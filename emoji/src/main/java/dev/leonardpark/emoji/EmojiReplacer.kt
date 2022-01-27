package dev.leonardpark.emoji

import android.content.Context
import android.text.Spannable

interface EmojiReplacer {
  fun replaceWithImages(
    context: Context,
    text: Spannable,
    emojiSize: Float,
    defaultEmojiSize: Float,
    fallback: EmojiReplacer?
  )
}