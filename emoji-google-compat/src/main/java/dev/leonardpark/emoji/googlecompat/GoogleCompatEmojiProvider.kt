package dev.leonardpark.emoji.googlecompat

import android.content.Context
import android.text.Spannable
import androidx.emoji2.text.EmojiCompat
import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.EmojiReplacer
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.googlecompat.category.*

class GoogleCompatEmojiProvider(emojiCompat: EmojiCompat?) : EmojiProvider, EmojiReplacer {

  init {
    if (emojiCompat == null) {
      throw NullPointerException()
    }
  }

  override fun getCategories(): Array<EmojiCategory> {
    return arrayOf(
      PeopleCategory(),
      NatureCategory(),
      FoodCategory(),
      ActivityCategory(),
      TravelCategory(),
      ObjectsCategory(),
      SymbolsCategory(),
      FlagsCategory()
    )
  }

  override fun replaceWithImages(
    context: Context,
    text: Spannable,
    emojiSize: Float,
    defaultEmojiSize: Float,
    fallback: EmojiReplacer?
  ) {
    if (EmojiCompat.get().loadState != EmojiCompat.LOAD_STATE_SUCCEEDED || emojiSize != defaultEmojiSize || EmojiCompat.get()
        .process(text, 0, text.length) !== text
    ) {
      fallback?.replaceWithImages(context, text, emojiSize, defaultEmojiSize, null)
    }
  }
}