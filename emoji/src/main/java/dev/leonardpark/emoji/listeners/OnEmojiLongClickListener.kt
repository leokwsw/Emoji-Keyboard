package dev.leonardpark.emoji.listeners

import androidx.annotation.NonNull
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.emoji.Emoji

interface OnEmojiLongClickListener {
  fun onEmojiLongClick(@NonNull view: EmojiImageView, @NonNull emoji: Emoji)
}