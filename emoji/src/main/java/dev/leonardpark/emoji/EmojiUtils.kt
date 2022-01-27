package dev.leonardpark.emoji

import android.text.TextUtils
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import java.util.regex.Matcher
import java.util.regex.Pattern

class EmojiUtils() {
  companion object {
    private val SPACE_REMOVAL = Pattern.compile("[\\s]")

    fun isOnlyEmojis(@Nullable text: String?): Boolean {
      if (!TextUtils.isEmpty(text)) {
        val inputWithoutSpaces =
          SPACE_REMOVAL.matcher(text).replaceAll(Matcher.quoteReplacement(""))
        return EmojiManager.getInstance()
          .getEmojiRepetitivePattern()
          .matcher(inputWithoutSpaces)
          .matches()
      }
      return false
    }

    @NonNull
    fun emojis(@Nullable text: String?): List<EmojiRange?>? {
      return EmojiManager.getInstance().findAllEmojis(text!!)
    }

    fun emojisCount(@Nullable text: String?): Int {
      return emojis(text)!!.size
    }

    @NonNull
    fun emojiInformation(@Nullable text: String?): EmojiInformation {
      val emojis = EmojiManager.getInstance().findAllEmojis(text!!)
      val isOnlyEmojis = isOnlyEmojis(text)
      return EmojiInformation(isOnlyEmojis, emojis)
    }
  }

  init {
    throw AssertionError("No instances.")
  }
}