package dev.leonardpark.emoji.emoji

import androidx.annotation.DrawableRes
import androidx.annotation.NonNull

// Interface for defining a category.
interface EmojiCategory {
  // Returns all of the emojis it can display.
  @NonNull
  fun getEmojis(): List<Emoji>
  // Returns the icon of the category that should be displayed.
  @DrawableRes
  fun getIcon(): Int
}