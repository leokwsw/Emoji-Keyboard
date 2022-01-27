package dev.leonardpark.emoji

import android.content.Context
import android.text.Spannable
import android.text.TextUtils
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import java.util.*
import java.util.regex.Pattern

class EmojiManager {
  companion object {
    private val INSTANCE = EmojiManager()
    private const val GUESSED_UNICODE_AMOUNT = 3000
    private const val GUESSED_TOTAL_PATTERN_LENGTH = GUESSED_UNICODE_AMOUNT * 4

    private val STRING_LENGTH_COMPARATOR: Comparator<String> =
      Comparator<String> { p0, p1 ->
        val firstLength = p0.length
        val secondLength = p1.length
        if (firstLength < secondLength) 1 else if (firstLength == secondLength) 0 else -1
      }

    private val DEFAULT_EMOJI_REPLACER: EmojiReplacer = object : EmojiReplacer {
      override fun replaceWithImages(
        context: Context,
        text: Spannable,
        emojiSize: Float,
        defaultEmojiSize: Float,
        fallback: EmojiReplacer?
      ) {
        val emojiManager: EmojiManager = getInstance()
        val existingSpans: Array<EmojiSpan> = text.getSpans(0, text.length, EmojiSpan::class.java)
        val existingSpanPositions: MutableList<Int> = ArrayList(existingSpans.size)
        val size = existingSpans.size
        for (i in 0 until size) {
          existingSpanPositions.add(text.getSpanStart(existingSpans[i]))
        }
        val findAllEmojis: List<EmojiRange> = emojiManager.findAllEmojis(text)
        for (i in findAllEmojis.indices) {
          val location: EmojiRange = findAllEmojis[i]
          if (!existingSpanPositions.contains(location.start)) {
            text.setSpan(
              EmojiSpan(context, location.emoji, emojiSize),
              location.start, location.end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
          }
        }
      }
    }

    fun getInstance(): EmojiManager {
      return INSTANCE
    }

    fun replaceWithImages(
      context: Context?,
      text: Spannable?,
      emojiSize: Float,
      defaultEmojiSize: Float
    ) {
      val emojiManager = getInstance()
      emojiManager.emojiReplacer!!.replaceWithImages(
        context!!,
        text!!, emojiSize, defaultEmojiSize, DEFAULT_EMOJI_REPLACER
      )
    }

    fun install(@NonNull provider: EmojiProvider) {
      INSTANCE.categories = checkNotNull(provider.getCategories(), { "categories == null" })
      INSTANCE.emojiMap = LinkedHashMap<String, Emoji>(GUESSED_UNICODE_AMOUNT)
      INSTANCE.emojiReplacer = if (provider is EmojiReplacer) provider else DEFAULT_EMOJI_REPLACER
      val unicodesForPattern: MutableList<String> = ArrayList(GUESSED_UNICODE_AMOUNT)
      val categoriesSize = INSTANCE.categories!!.size
      for (i in 0 until categoriesSize) {
        val emojis: List<Emoji> =
          checkNotNull(INSTANCE.categories!![i].getEmojis(), { "emojies == null" })
        val emojisSize = emojis.size
        for (j in 0 until emojisSize) {
          val emoji = emojis[j]
          val unicode = emoji.getUnicode()
          val variants = emoji.getVariants()
          INSTANCE.emojiMap[unicode] = emoji
          unicodesForPattern.add(unicode)
          for (k in variants.indices) {
            val variant = variants[k]
            val variantUnicode = variant.getUnicode()
            INSTANCE.emojiMap[variantUnicode] = variant
            unicodesForPattern.add(variantUnicode)
          }
        }
      }
      require(unicodesForPattern.isNotEmpty()) { "Your EmojiProvider must at least have one category with at least one emoji." }

      // We need to sort the unicodes by length so the longest one gets matched first.
      Collections.sort(unicodesForPattern, STRING_LENGTH_COMPARATOR)
      val patternBuilder = StringBuilder(GUESSED_TOTAL_PATTERN_LENGTH)
      val unicodesForPatternSize = unicodesForPattern.size
      for (i in 0 until unicodesForPatternSize) {
        patternBuilder.append(Pattern.quote(unicodesForPattern[i])).append('|')
      }
      val regex = patternBuilder.deleteCharAt(patternBuilder.length - 1).toString()
      INSTANCE.emojiPattern = Pattern.compile(regex)
      INSTANCE.emojiRepetitivePattern = Pattern.compile("($regex)+")
    }
  }

  private var emojiMap: MutableMap<String, Emoji> =
    LinkedHashMap<String, Emoji>(GUESSED_UNICODE_AMOUNT)
  private var categories: Array<EmojiCategory>? = null
  private var emojiPattern: Pattern? = null
  private var emojiRepetitivePattern: Pattern? = null
  private var emojiReplacer: EmojiReplacer? = null

  fun destroy() {
    INSTANCE.emojiMap = LinkedHashMap<String, Emoji>(GUESSED_UNICODE_AMOUNT)
    INSTANCE.categories = null
    INSTANCE.emojiPattern = null
    INSTANCE.emojiRepetitivePattern = null
  }


  fun getCategories(): Array<EmojiCategory> {
    verifyInstalled()
    return categories!!
  }

  fun getEmojiRepetitivePattern(): Pattern {
    return emojiRepetitivePattern!!
  }

  @NonNull
  fun findAllEmojis(@Nullable text: CharSequence): List<EmojiRange> {
    verifyInstalled()
    val result: MutableList<EmojiRange> = ArrayList()
    if (!TextUtils.isEmpty(text)) {
      val matcher = emojiPattern!!.matcher(text)
      while (matcher.find()) {
        val found = findEmoji(text.subSequence(matcher.start(), matcher.end()))
        if (found != null) {
          result.add(EmojiRange(matcher.start(), matcher.end(), found))
        }
      }
    }
    return result
  }

  @Nullable
  fun findEmoji(@NonNull candidate: CharSequence): Emoji? {
    verifyInstalled()

    // We need to call toString on the candidate, since the emojiMap may not find the requested entry otherwise, because
    // the type is different.
    return emojiMap[candidate.toString()]
  }

  fun verifyInstalled() {
    if (categories == null)
      checkNotNull(categories) { "Please install an EmojiProvider through the EmojiManager.install() method first." }
  }
}