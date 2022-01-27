package dev.leonardpark.emoji.one;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.one.category.ActivityCategory;
import dev.leonardpark.emoji.one.category.FlagsCategory;
import dev.leonardpark.emoji.one.category.FoodCategory;
import dev.leonardpark.emoji.one.category.NatureCategory;
import dev.leonardpark.emoji.one.category.ObjectsCategory;
import dev.leonardpark.emoji.one.category.PeopleCategory;
import dev.leonardpark.emoji.one.category.SymbolsCategory;
import dev.leonardpark.emoji.one.category.TravelCategory;

class EmojiOneProvider : EmojiProvider {
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
