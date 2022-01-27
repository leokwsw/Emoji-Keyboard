package dev.leonardpark.emoji

class EmojiInformation(
  var isOnlyEmojis: Boolean,
  var emojis: List<EmojiRange>
) {

  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }

    if (other == null || javaClass != other.javaClass) {
      return false
    }

    val that = other as EmojiInformation
    return isOnlyEmojis == that.isOnlyEmojis && emojis == that.emojis
  }

  override fun hashCode(): Int {
    var result = if (isOnlyEmojis) 1 else 0
    result = 31 * result + emojis.hashCode()
    return result
  }
}