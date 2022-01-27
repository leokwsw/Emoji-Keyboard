package dev.leonardpark.emoji.facebook;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.facebook.category.ActivityCategory;
import dev.leonardpark.emoji.facebook.category.FlagsCategory;
import dev.leonardpark.emoji.facebook.category.FoodCategory;
import dev.leonardpark.emoji.facebook.category.NatureCategory;
import dev.leonardpark.emoji.facebook.category.ObjectsCategory;
import dev.leonardpark.emoji.facebook.category.PeopleCategory;
import dev.leonardpark.emoji.facebook.category.SymbolsCategory;
import dev.leonardpark.emoji.facebook.category.TravelCategory;

class FacebookEmojiProvider : EmojiProvider {
  override fun getCategories(): Array<EmojiCategory> = arrayOf(
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
