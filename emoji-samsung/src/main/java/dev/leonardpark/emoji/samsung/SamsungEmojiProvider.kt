package dev.leonardpark.emoji.samsung;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.samsung.category.ActivityCategory;
import dev.leonardpark.emoji.samsung.category.FlagsCategory;
import dev.leonardpark.emoji.samsung.category.FoodCategory;
import dev.leonardpark.emoji.samsung.category.NatureCategory;
import dev.leonardpark.emoji.samsung.category.ObjectsCategory;
import dev.leonardpark.emoji.samsung.category.PeopleCategory;
import dev.leonardpark.emoji.samsung.category.SymbolsCategory;
import dev.leonardpark.emoji.samsung.category.TravelCategory;

class SamsungEmojiProvider : EmojiProvider {
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
