package dev.leonardpark.emoji

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Point
import android.graphics.drawable.BitmapDrawable
import android.view.Gravity
import android.view.View
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.view.inputmethod.InputMethodManager
import android.widget.PopupWindow
import androidx.annotation.CheckResult
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emojicompat.EmojiEditText
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.listeners.*

class EmojiPopup(
  rootView: View,
  emojiEditText: EmojiEditText,
  recent: RecentEmoji?,
  variant: VariantEmoji?
) {
  companion object {
    const val MIN_KEYBOARD_HEIGHT = 100
  }

  class Builder(@NonNull private var rootView: View) {

    companion object {
      @CheckResult
      fun fromRootView(rootView: View): Builder = Builder(rootView)
    }

    @Nullable
    private var onEmojiPopupShownListener: OnEmojiPopupShownListener? = null

    @Nullable
    private var onSoftKeyboardCloseListener: OnSoftKeyboardCloseListener? = null

    @Nullable
    private var onSoftKeyboardOpenListener: OnSoftKeyboardOpenListener? = null

    @Nullable
    private var onEmojiBackspaceClickListener: OnEmojiBackspaceClickListener? = null

    @Nullable
    private var onEmojiClickListener: OnEmojiClickListener? = null

    @Nullable
    private var onEmojiPopupDismissListener: OnEmojiPopupDismissListener? = null

    @Nullable
    private var recentEmoji: RecentEmoji? = null

    @Nullable
    private var variantEmoji: VariantEmoji? = null

    @CheckResult
    fun setOnSoftKeyboardCloseListener(@Nullable listener: OnSoftKeyboardCloseListener): Builder {
      onSoftKeyboardCloseListener = listener
      return this
    }

    @CheckResult
    fun setOnEmojiClickListener(@Nullable listener: OnEmojiClickListener): Builder {
      onEmojiClickListener = listener
      return this
    }

    @CheckResult
    fun setOnSoftKeyboardOpenListener(@Nullable listener: OnSoftKeyboardOpenListener): Builder {
      onSoftKeyboardOpenListener = listener
      return this
    }

    @CheckResult
    fun setOnEmojiPopupShownListener(@Nullable listener: OnEmojiPopupShownListener): Builder {
      onEmojiPopupShownListener = listener
      return this
    }

    @CheckResult
    fun setOnEmojiPopupDismissListener(@Nullable listener: OnEmojiPopupDismissListener): Builder {
      onEmojiPopupDismissListener = listener
      return this
    }

    @CheckResult
    fun setOnEmojiBackspaceClickListener(@Nullable listener: OnEmojiBackspaceClickListener): Builder {
      onEmojiBackspaceClickListener = listener
      return this
    }

    @CheckResult
    fun setRecentEmoji(@Nullable recent: RecentEmoji): Builder {
      recentEmoji = recent
      return this
    }

    @CheckResult
    fun setVariantEmoji(@Nullable variant: VariantEmoji): Builder {
      variantEmoji = variant
      return this
    }

    @CheckResult
    fun build(@NonNull emojiEditText: EmojiEditText?): EmojiPopup {
      EmojiManager.getInstance().verifyInstalled()
      checkNotNull(emojiEditText, { "EmojiEditText can't be null" })
      val emojiPopup = EmojiPopup(rootView, emojiEditText, recentEmoji, variantEmoji)
      emojiPopup.onSoftKeyboardCloseListener = onSoftKeyboardCloseListener
      emojiPopup.onEmojiClickListener = onEmojiClickListener
      emojiPopup.onSoftKeyboardOpenListener = onSoftKeyboardOpenListener
      emojiPopup.onEmojiPopupShownListener = onEmojiPopupShownListener
      emojiPopup.onEmojiPopupDismissListener = onEmojiPopupDismissListener
      emojiPopup.onEmojiBackspaceClickListener = onEmojiBackspaceClickListener
      return emojiPopup
    }
  }

  var rootView: View = rootView.rootView
  var context: Activity = Utils.asActivity(rootView.context)

  @NonNull
  var recentEmoji: RecentEmoji = recent ?: RecentEmojiManager(context)

  @NonNull
  val variantEmoji: VariantEmoji = variant ?: VariantEmojiManager(context)

  @NonNull
  var variantPopup: EmojiVariantPopup? = null

  val popupWindow: PopupWindow = PopupWindow(context)
  var emojiEditText: EmojiEditText? = emojiEditText

  var isPendingOpen = false
  var isKeyboardOpen = false

  @Nullable
  var onEmojiPopupShownListener: OnEmojiPopupShownListener? = null

  @Nullable
  var onSoftKeyboardCloseListener: OnSoftKeyboardCloseListener? = null

  @Nullable
  var onSoftKeyboardOpenListener: OnSoftKeyboardOpenListener? = null

  @Nullable
  var onEmojiBackspaceClickListener: OnEmojiBackspaceClickListener? = null

  @Nullable
  var onEmojiClickListener: OnEmojiClickListener? = null

  @Nullable
  var onEmojiPopupDismissListener: OnEmojiPopupDismissListener? = null

  val onGlobalLayoutListener: OnGlobalLayoutListener = object : OnGlobalLayoutListener {
    override fun onGlobalLayout() {
      val rect = Utils.windowVisibleDisplayFrame(context)
      val heightDifference = Utils.screenHeight(context) - rect!!.bottom
      if (heightDifference > Utils.dpToPx(context, MIN_KEYBOARD_HEIGHT)) {
        popupWindow!!.height = heightDifference
        popupWindow.width = rect.right
        if (!isKeyboardOpen && onSoftKeyboardOpenListener != null) {
          onSoftKeyboardOpenListener!!.onKeyboardOpen(heightDifference)
        }
        isKeyboardOpen = true
        if (isPendingOpen) {
          showAtBottom()
          isPendingOpen = false
        }
      } else {
        if (isKeyboardOpen) {
          isKeyboardOpen = false
          if (onSoftKeyboardCloseListener != null) {
            onSoftKeyboardCloseListener!!.onKeyboardClose()
          }
          dismiss()
          Utils.removeOnGlobalLayoutListener(context.window.decorView, this)
        }
      }
    }
  }

  init {
    val longClickListener: OnEmojiLongClickListener = object : OnEmojiLongClickListener {
      override fun onEmojiLongClick(view: EmojiImageView, emoji: Emoji) {
        variantPopup!!.show(view, emoji)
      }
    }

    val clickListener: OnEmojiClickListener = object : OnEmojiClickListener {
      override fun onEmojiClick(imageView: EmojiImageView, emoji: Emoji) {
        emojiEditText.input(emoji)
        recentEmoji.addEmoji(emoji)
        variantEmoji.addVariant(emoji)
        imageView.updateEmoji(emoji)
        if (onEmojiClickListener != null) {
          onEmojiClickListener!!.onEmojiClick(imageView, emoji)
        }
        variantPopup!!.dismiss()
      }
    }

    variantPopup = EmojiVariantPopup(this.rootView, clickListener)

    val emojiView = EmojiView(context, clickListener, longClickListener, recentEmoji, variantEmoji)
    emojiView.setOnEmojiBackspaceClickListener(object : OnEmojiBackspaceClickListener {
      override fun onEmojiBackspaceClick(v: View) {
        emojiEditText.backspace()
        if (onEmojiBackspaceClickListener != null) {
          onEmojiBackspaceClickListener!!.onEmojiBackspaceClick(v)
        }
      }
    })

    popupWindow.contentView = emojiView
    popupWindow.inputMethodMode = PopupWindow.INPUT_METHOD_NOT_NEEDED
    popupWindow.setBackgroundDrawable(
      BitmapDrawable(
        context.resources,
        null as Bitmap?
      )
    ) // To avoid borders and overdraw.

    popupWindow.setOnDismissListener {
      if (onEmojiPopupDismissListener != null) {
        onEmojiPopupDismissListener!!.onEmojiPopupDismiss()
      }
    }
  }

  fun toggle() {
    if (!popupWindow!!.isShowing) {
      // Remove any previous listeners to avoid duplicates.
      Utils.removeOnGlobalLayoutListener(context.window.decorView, onGlobalLayoutListener)
      context.window.decorView.viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener)
      if (isKeyboardOpen) {
        // If the keyboard is visible, simply show the emoji popup.
        showAtBottom()
      } else {
        // Open the text keyboard first and immediately after that show the emoji popup.
        emojiEditText!!.isFocusableInTouchMode = true
        emojiEditText!!.requestFocus()
        showAtBottomPending()
        val inputMethodManager =
          context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.showSoftInput(emojiEditText, InputMethodManager.SHOW_IMPLICIT)
      }
    } else {
      dismiss()
    }

    // Manually dispatch the event. In some cases this does not work out of the box reliably.
    context.window.decorView.viewTreeObserver.dispatchOnGlobalLayout()
  }

  fun isShowing(): Boolean = popupWindow!!.isShowing

  fun dismiss() {
    popupWindow!!.dismiss()
    variantPopup!!.dismiss()
    recentEmoji.persist()
    variantEmoji!!.persist()
  }

  fun showAtBottom() {
    val desiredLocation = Point(0, Utils.screenHeight(context) - popupWindow!!.height)
    popupWindow.showAtLocation(rootView, Gravity.NO_GRAVITY, desiredLocation.x, desiredLocation.y)
    Utils.fixPopupLocation(popupWindow, desiredLocation)
    if (onEmojiPopupShownListener != null) {
      onEmojiPopupShownListener!!.onEmojiPopupShown()
    }
  }

  private fun showAtBottomPending() {
    if (isKeyboardOpen) {
      showAtBottom()
    } else {
      isPendingOpen = true
    }
  }
}