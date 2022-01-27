package dev.leonardpark.emoji.ios;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.ios.category.ActivityCategory;
import dev.leonardpark.emoji.ios.category.FlagsCategory;
import dev.leonardpark.emoji.ios.category.FoodCategory;
import dev.leonardpark.emoji.ios.category.NatureCategory;
import dev.leonardpark.emoji.ios.category.ObjectsCategory;
import dev.leonardpark.emoji.ios.category.PeopleCategory;
import dev.leonardpark.emoji.ios.category.SymbolsCategory;
import dev.leonardpark.emoji.ios.category.TravelCategory;

class IosEmojiProvider : EmojiProvider {
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
