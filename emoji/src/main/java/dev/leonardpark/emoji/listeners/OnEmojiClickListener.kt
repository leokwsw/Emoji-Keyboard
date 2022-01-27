package dev.leonardpark.emoji.listeners

import androidx.annotation.NonNull
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.emoji.Emoji

interface OnEmojiClickListener {
  fun onEmojiClick(@NonNull imageView: EmojiImageView, @NonNull emoji: Emoji)
}