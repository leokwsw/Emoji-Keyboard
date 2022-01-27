package dev.leonardpark.emoji

import androidx.annotation.NonNull
import dev.leonardpark.emoji.emoji.Emoji

/**
 * Interface for providing some custom implementation for variant emojis.
 */
interface VariantEmoji {
  /**
   * Returns the variant for the passed emoji. Could be loaded from a database, shared preferences or just hard
   * coded.<br>
   *
   * This method will be called more than one time hence it is recommended to hold a collection of
   * desired emojis.
   */
  @NonNull
  fun getVariant(desiredEmoji: Emoji): Emoji

  /**
   * Should add the emoji to the variants. After calling this method, {@link #getVariant(Emoji)}
   * should return the emoji that was just added.
   */
  fun addVariant(@NonNull newVariant: Emoji)

  /**
   * Should persist all emojis.
   */
  fun persist()
}