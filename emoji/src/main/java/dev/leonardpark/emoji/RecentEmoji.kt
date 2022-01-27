package dev.leonardpark.emoji

import androidx.annotation.NonNull
import dev.leonardpark.emoji.emoji.Emoji

interface RecentEmoji {
  fun getRecentEmojis(): Collection<Emoji>
  fun addEmoji(@NonNull emoji: Emoji)
  fun persist()
}