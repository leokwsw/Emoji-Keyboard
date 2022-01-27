package dev.leonardpark.emoji.twitter;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.twitter.category.ActivityCategory;
import dev.leonardpark.emoji.twitter.category.FlagsCategory;
import dev.leonardpark.emoji.twitter.category.FoodCategory;
import dev.leonardpark.emoji.twitter.category.NatureCategory;
import dev.leonardpark.emoji.twitter.category.ObjectsCategory;
import dev.leonardpark.emoji.twitter.category.PeopleCategory;
import dev.leonardpark.emoji.twitter.category.SymbolsCategory;
import dev.leonardpark.emoji.twitter.category.TravelCategory;

class TwitterEmojiProvider : EmojiProvider {
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
