package dev.leonardpark.emoji

import android.content.Context
import android.widget.GridView
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.listeners.OnEmojiClickListener
import dev.leonardpark.emoji.listeners.OnEmojiLongClickListener

open class EmojiGridView(context: Context) : GridView(context) {
  lateinit var emojiArrayAdapter: EmojiArrayAdapter

  init {
    val resources = resources
    val width = resources.getDimensionPixelSize(R.dimen.emoji_grid_view_column_width)
    val spacing = resources.getDimensionPixelSize(R.dimen.emoji_grid_view_spacing)
    columnWidth = width
    horizontalSpacing = spacing
    verticalSpacing = spacing
    setPadding(spacing, spacing, spacing, spacing)
    numColumns = AUTO_FIT
    clipToPadding = false
    isVerticalScrollBarEnabled = false
  }

  fun init(
    @Nullable onEmojiClickListener: OnEmojiClickListener,
    @Nullable onEmojiLongClickListener: OnEmojiLongClickListener,
    @NonNull category: EmojiCategory,
    @NonNull variantManager: VariantEmoji
  ): EmojiGridView {
    emojiArrayAdapter = EmojiArrayAdapter(
      context, category.getEmojis(), variantManager,
      onEmojiClickListener, onEmojiLongClickListener
    )
    adapter = emojiArrayAdapter
    return this
  }
}