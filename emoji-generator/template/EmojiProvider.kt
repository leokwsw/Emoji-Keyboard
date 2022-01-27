package dev.leonardpark.emoji.<%= package %>;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
<%= imports %>

class <%= name %>Provider : EmojiProvider {
  override fun getCategories(): Array<EmojiCategory> = arrayOf(
    <%= categoryMapping %>
  )
}
