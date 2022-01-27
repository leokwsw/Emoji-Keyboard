package dev.leonardpark.emoji

import dev.leonardpark.emoji.emoji.EmojiCategory

interface EmojiProvider {
  fun getCategories(): Array<EmojiCategory>
}