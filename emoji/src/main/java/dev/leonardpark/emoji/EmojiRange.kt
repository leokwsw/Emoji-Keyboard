package dev.leonardpark.emoji

import androidx.annotation.NonNull
import dev.leonardpark.emoji.emoji.Emoji

class EmojiRange(
  var start: Int,
  var end: Int,
  @NonNull var emoji: Emoji
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }

    if (other == null || javaClass != other.javaClass) {
      return false
    }

    val that = other as EmojiRange

    return start == that.start && end == that.end && emoji.equals(that.emoji)
  }

  override fun hashCode(): Int {
    var result = start
    result = 31 * result + end
    result = 31 * result + emoji.hashCode()
    return result
  }
}