package dev.leonardpark.emoji

import android.content.Context
import android.graphics.PorterDuff
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.Nullable
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.listeners.OnEmojiBackspaceClickListener
import dev.leonardpark.emoji.listeners.OnEmojiClickListener
import dev.leonardpark.emoji.listeners.OnEmojiLongClickListener
import dev.leonardpark.emoji.listeners.RepeatListener
import java.util.concurrent.TimeUnit

class EmojiView : LinearLayoutCompat, ViewPager.OnPageChangeListener {
  companion object {
    private val INITIAL_INTERVAL = TimeUnit.SECONDS.toMillis(1) / 2
    private const val NORMAL_INTERVAL = 50L

    class EmojiTabsClickListener(
      private var emojisPager: ViewPager,
      private var position: Int
    ) : OnClickListener {
      override fun onClick(p0: View?) {
        emojisPager.currentItem = position
      }
    }
  }

  @ColorInt
  private var themeAccentColor = 0

  @ColorInt
  private var themeIconColor = 0

  private lateinit var emojiTabs: MutableList<AppCompatImageButton>
  private lateinit var emojiPagerAdapter: EmojiPagerAdapter

  @Nullable
  var onEmojiBackspaceClickListener: OnEmojiBackspaceClickListener? = null

  private var emojiTabLastSelectedIndex = -1

  constructor(
    context: Context,
    onEmojiClickListener: OnEmojiClickListener,
    onEmojiLongClickListener: OnEmojiLongClickListener,
    recentEmoji: RecentEmoji,
    variantManager: VariantEmoji
  ) : super(context) {
    inflate(context, R.layout.emoji_view, this)
    orientation = LinearLayoutCompat.VERTICAL
    setBackgroundColor(ContextCompat.getColor(context, R.color.emoji_background))

    themeIconColor = ContextCompat.getColor(context, R.color.emoji_icons)
    val value = TypedValue()
    context.theme.resolveAttribute(R.attr.colorAccent, value, true)
    themeAccentColor = value.data

    val emojisPager: ViewPager = findViewById(R.id.emojis_pager)
    val emojisTab = findViewById<LinearLayout>(R.id.emojis_tab)
    emojisPager.addOnPageChangeListener(this)

    val categories: Array<EmojiCategory> = EmojiManager.getInstance().getCategories()

    emojiTabs = mutableListOf()
    emojiTabs.add(inflateButton(context, R.drawable.emoji_recent_selector, emojisTab))
    for (i in categories.indices) {
      emojiTabs.add(inflateButton(context, categories[i].getIcon(), emojisTab))
    }
    emojiTabs.add(inflateButton(context, R.drawable.emoji_backspace, emojisTab))

    handleOnClicks(emojisPager)

    emojiPagerAdapter =
      EmojiPagerAdapter(onEmojiClickListener, onEmojiLongClickListener, recentEmoji, variantManager)
    emojisPager.adapter = emojiPagerAdapter

    val startIndex = if (emojiPagerAdapter!!.numberOfRecentEmojis() > 0) 0 else 1
    emojisPager.currentItem = startIndex
    onPageSelected(startIndex)
  }

  private fun handleOnClicks(emojisPager: ViewPager) {
    for (i in 0 until emojiTabs.size - 1) {
      emojiTabs[i].setOnClickListener(
        EmojiTabsClickListener(
          emojisPager,
          i
        )
      )
    }

    emojiTabs[emojiTabs.size - 1].setOnTouchListener(
      RepeatListener(
        INITIAL_INTERVAL, NORMAL_INTERVAL
      ) { view ->
        if (onEmojiBackspaceClickListener != null) {
          onEmojiBackspaceClickListener!!.onEmojiBackspaceClick(view)
        }
      }
    )
  }

  @JvmName("setOnEmojiBackspaceClickListener1")
  fun setOnEmojiBackspaceClickListener(@Nullable onEmojiBackspaceClickListener: OnEmojiBackspaceClickListener?) {
    this.onEmojiBackspaceClickListener = onEmojiBackspaceClickListener
  }

  private fun inflateButton(
    context: Context,
    @DrawableRes icon: Int,
    parent: ViewGroup
  ): AppCompatImageButton {
    val button =
      LayoutInflater.from(context)
        .inflate(R.layout.emoji_category, parent, false) as AppCompatImageButton

    button.setImageDrawable(AppCompatResources.getDrawable(context, icon))
    button.setColorFilter(themeIconColor, PorterDuff.Mode.SRC_IN)

    parent.addView(button)

    return button
  }

  override fun onPageSelected(i: Int) {
    if (emojiTabLastSelectedIndex != i) {
      if (i == 0) {
        emojiPagerAdapter.invalidateRecentEmojis()
      }
      if (emojiTabLastSelectedIndex >= 0 && emojiTabLastSelectedIndex < emojiTabs.size) {
        emojiTabs[emojiTabLastSelectedIndex].isSelected = false
        emojiTabs[emojiTabLastSelectedIndex].setColorFilter(themeIconColor, PorterDuff.Mode.SRC_IN)
      }
      emojiTabs[i].isSelected = true
      emojiTabs[i].setColorFilter(themeAccentColor, PorterDuff.Mode.SRC_IN)
      emojiTabLastSelectedIndex = i
    }
  }

  override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

  }

  override fun onPageScrollStateChanged(state: Int) {

  }
}