package dev.leonardpark.emoji

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import dev.leonardpark.emoji.listeners.OnEmojiClickListener
import dev.leonardpark.emoji.listeners.OnEmojiLongClickListener

class EmojiPagerAdapter(
  private var listener: OnEmojiClickListener?,
  private var longListener: OnEmojiLongClickListener?,
  private var recentEmoji: RecentEmoji?,
  private var variantManager: VariantEmoji?
) : PagerAdapter() {
  companion object {
    private const val RECENT_POSITION = 0
  }

  private var recentEmojiGridView: RecentEmojiGridView? = null


  init {
    this.recentEmojiGridView = null
  }

  override fun getCount(): Int {
    return EmojiManager.getInstance().getCategories().size + 1
  }

  override fun instantiateItem(pager: ViewGroup, position: Int): Any {
    val newView: View

    if (position == RECENT_POSITION) {
      newView = RecentEmojiGridView(pager.context).init(listener, longListener, recentEmoji!!)
      recentEmojiGridView = newView
    } else {
      newView = EmojiGridView(pager.context).init(
        listener!!, longListener!!,
        EmojiManager.getInstance().getCategories()[position - 1], variantManager!!
      )
    }

    pager.addView(newView)
    return newView
  }

  override fun destroyItem(pager: ViewGroup, position: Int, view: Any) {
    pager.removeView(view as View?)

    if (position == RECENT_POSITION) {
      recentEmojiGridView = null
    }
  }

  override fun isViewFromObject(view: View, `object`: Any): Boolean {
    return view == `object`
  }

  fun numberOfRecentEmojis(): Int {
    return recentEmoji!!.getRecentEmojis().size
  }

  fun invalidateRecentEmojis() {
    recentEmojiGridView?.invalidateEmojis()
  }
}