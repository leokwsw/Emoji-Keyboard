package dev.leonardpark.emoji.google;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.category.ActivityCategory;
import dev.leonardpark.emoji.google.category.FlagsCategory;
import dev.leonardpark.emoji.google.category.FoodCategory;
import dev.leonardpark.emoji.google.category.NatureCategory;
import dev.leonardpark.emoji.google.category.ObjectsCategory;
import dev.leonardpark.emoji.google.category.PeopleCategory;
import dev.leonardpark.emoji.google.category.SymbolsCategory;
import dev.leonardpark.emoji.google.category.TravelCategory;

class GoogleEmojiProvider : EmojiProvider {
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
