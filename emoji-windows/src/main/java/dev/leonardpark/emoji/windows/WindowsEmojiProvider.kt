package dev.leonardpark.emoji.windows;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.windows.category.ActivityCategory;
import dev.leonardpark.emoji.windows.category.FlagsCategory;
import dev.leonardpark.emoji.windows.category.FoodCategory;
import dev.leonardpark.emoji.windows.category.NatureCategory;
import dev.leonardpark.emoji.windows.category.ObjectsCategory;
import dev.leonardpark.emoji.windows.category.PeopleCategory;
import dev.leonardpark.emoji.windows.category.SymbolsCategory;
import dev.leonardpark.emoji.windows.category.TravelCategory;

class WindowsEmojiProvider : EmojiProvider {
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
