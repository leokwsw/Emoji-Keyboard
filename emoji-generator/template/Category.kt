package dev.leonardpark.emoji.<%= package %>.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
<%= imports %>import dev.leonardpark.emoji.<%= package %>.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class <%= name %>Category: EmojiCategory {
  companion object {
    private val DATA = listOf(
      <%= data %>
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_<%= package %>_category_<%= icon %>
}
