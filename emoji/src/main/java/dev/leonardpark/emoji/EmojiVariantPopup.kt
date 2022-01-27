package dev.leonardpark.emoji

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Point
import android.graphics.drawable.BitmapDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.View.MeasureSpec
import android.view.ViewGroup.MarginLayoutParams
import android.view.WindowManager
import android.widget.ImageView
import android.widget.PopupWindow
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.appcompat.widget.LinearLayoutCompat
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.listeners.OnEmojiClickListener

class EmojiVariantPopup(
  @NonNull var rootView: View,
  @Nullable var listener: OnEmojiClickListener?
) {
  companion object {
    private const val MARGIN = 2
  }

  @Nullable
  private var popupWindow: PopupWindow? = null

  @Nullable
  var rootImageView: EmojiImageView? = null

  fun show(
    @NonNull clickedImage: EmojiImageView,
    @NonNull emoji: Emoji
  ) {
    dismiss()
    rootImageView = clickedImage
    val content: View = initView(clickedImage.context, emoji, clickedImage.width)

    popupWindow = PopupWindow(
      content,
      WindowManager.LayoutParams.WRAP_CONTENT,
      WindowManager.LayoutParams.WRAP_CONTENT
    )
    popupWindow!!.isFocusable = true
    popupWindow!!.isOutsideTouchable = true
    popupWindow!!.inputMethodMode = PopupWindow.INPUT_METHOD_NOT_NEEDED
    popupWindow!!.setBackgroundDrawable(
      BitmapDrawable(
        clickedImage.context.resources,
        null as Bitmap?
      )
    )

    content.measure(
      MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED),
      MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)
    )

    val location = Utils.locationOnScreen(clickedImage)
    val desiredLocation = Point(
      location.x - content.measuredWidth / 2 + clickedImage.width / 2,
      location.y - content.measuredHeight
    )

    popupWindow!!.showAtLocation(rootView, Gravity.NO_GRAVITY, desiredLocation.x, desiredLocation.y)
    rootImageView!!.parent.requestDisallowInterceptTouchEvent(true)
    Utils.fixPopupLocation(popupWindow!!, desiredLocation)
  }

  fun dismiss() {
    rootImageView = null
    popupWindow?.let {
      it.dismiss()
      popupWindow = null
    }
  }

  private fun initView(@NonNull context: Context, @NonNull emoji: Emoji, width: Int): View {
    val result = View.inflate(context, R.layout.emoji_skin_popup, null)
    val imageContainer = result.findViewById<LinearLayoutCompat>(R.id.container)
    val variants = emoji.getBase().getVariants()
    variants.add(0, emoji.getBase())
    val inflater = LayoutInflater.from(context)
    for (variant in variants) {
      val emojiImage = inflater.inflate(R.layout.emoji_item, imageContainer, false) as ImageView
      val layoutParams = emojiImage.layoutParams as MarginLayoutParams
      val margin: Int = Utils.dpToPx(context, MARGIN)

      // Use the same size for Emojis as in the picker.
      layoutParams.width = width
      layoutParams.setMargins(margin, margin, margin, margin)
      emojiImage.setImageDrawable(variant.getDrawable(context))
      emojiImage.setOnClickListener {
        if (listener != null && rootImageView != null) {
          listener!!.onEmojiClick(rootImageView!!, variant)
        }
      }
      imageContainer.addView(emojiImage)
    }
    return result
  }
}