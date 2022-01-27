package dev.leonardpark.emoji.windows.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.windows.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class FlagsCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      Emoji(0x1f3f3, R.drawable.emoji_windows_1f3f3),
      Emoji(0x1f3f4, R.drawable.emoji_windows_1f3f4),
      Emoji(0x1f3c1, R.drawable.emoji_windows_1f3c1),
      Emoji(0x1f6a9, R.drawable.emoji_windows_1f6a9),
      Emoji(intArrayOf(0x1f3f3, 0xfe0f, 0x200d, 0x1f308), R.drawable.emoji_windows_1f3f3_fe0f_200d_1f308),
      Emoji(intArrayOf(0x1f3f4, 0x200d, 0x2620, 0xfe0f), R.drawable.emoji_windows_1f3f4_200d_2620_fe0f),
      Emoji(0x1f38c, R.drawable.emoji_windows_1f38c)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_windows_category_flags
}
