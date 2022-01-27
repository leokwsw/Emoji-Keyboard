package dev.leonardpark.emoji

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.NonNull
import dev.leonardpark.emoji.emoji.Emoji
import java.util.*

class VariantEmojiManager(context: Context): VariantEmoji {
  companion object {
    private const val PREFERENCE_NAME = "variant-emoji-manager"
    private const val EMOJI_DELIMITER = "~"
    private const val VARIANT_EMOJIS = "variant-emojis"
    const val EMOJI_GUESS_SIZE = 5
  }

  @NonNull
  private val context: Context = context.applicationContext

  @NonNull
  private var variantsList: MutableList<Emoji> = ArrayList(0)

  override fun getVariant(desiredEmoji: Emoji): Emoji {
    if (variantsList.isEmpty()) {
      initFromSharedPreferences()
    }

    val baseEmoji = desiredEmoji.getBase()

    for (i in variantsList.indices) {
      val emoji = variantsList[i]
      if (baseEmoji.equals(emoji.getBase())) {
        return emoji
      }
    }

    return desiredEmoji
  }

  override fun addVariant(newVariant: Emoji) {
    val newVariantBase = newVariant.getBase()

    for (i in variantsList.indices) {
      val variant = variantsList[i]
      if (variant.getBase() == newVariantBase) {
        if (variant == newVariant) {
          return  // Same skin-tone was used.
        } else {
          variantsList.removeAt(i)
          variantsList.add(newVariant)
          return
        }
      }
    }

    variantsList.add(newVariant)
  }

  override fun persist() {
    if (variantsList.size > 0) {
      val stringBuilder = StringBuilder(variantsList.size * EMOJI_GUESS_SIZE)
      for (i in variantsList.indices) {
        stringBuilder.append(variantsList[i].getUnicode()).append(EMOJI_DELIMITER)
      }
      stringBuilder.setLength(stringBuilder.length - EMOJI_DELIMITER.length)
      getPreferences().edit().putString(VARIANT_EMOJIS, stringBuilder.toString()).apply()
    } else {
      getPreferences().edit().remove(VARIANT_EMOJIS).apply()
    }
  }

  private fun initFromSharedPreferences() {
    val savedRecentVariants: String = getPreferences().getString(VARIANT_EMOJIS, "")!!
    if (savedRecentVariants.isNotEmpty()) {
      val stringTokenizer = StringTokenizer(savedRecentVariants, EMOJI_DELIMITER)
      variantsList = ArrayList(stringTokenizer.countTokens())
      while (stringTokenizer.hasMoreTokens()) {
        val token = stringTokenizer.nextToken()
        val emoji = EmojiManager.getInstance().findEmoji(token)
        if (emoji != null && emoji.getLength() == token.length) {
          variantsList.add(emoji)
        }
      }
    }
  }

  private fun getPreferences(): SharedPreferences {
    return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
  }
}