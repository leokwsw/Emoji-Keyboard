package dev.leonardpark.emoji

import android.content.Context
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.listeners.OnEmojiClickListener
import dev.leonardpark.emoji.listeners.OnEmojiLongClickListener

class RecentEmojiGridView(context: Context) : EmojiGridView(context) {
  private lateinit var recentEmojis: RecentEmoji

  fun init(
    @Nullable onEmojiClickListener: OnEmojiClickListener?,
    @Nullable onEmojiLongClickListener: OnEmojiLongClickListener?,
    @NonNull recentEmoji: RecentEmoji
  ): RecentEmojiGridView {
    recentEmojis = recentEmoji
    val emojis: Collection<Emoji> = recentEmojis.getRecentEmojis()
    emojiArrayAdapter = EmojiArrayAdapter(
      context, emojis.toList(), null,
      onEmojiClickListener, onEmojiLongClickListener
    )
    adapter = emojiArrayAdapter
    return this
  }

  fun invalidateEmojis() {
    emojiArrayAdapter.updateEmojis(recentEmojis.getRecentEmojis())
  }

}