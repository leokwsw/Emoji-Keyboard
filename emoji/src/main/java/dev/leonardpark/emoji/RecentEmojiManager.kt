package dev.leonardpark.emoji

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.NonNull
import dev.leonardpark.emoji.emoji.Emoji
import java.util.*

class RecentEmojiManager(context: Context) : RecentEmoji {
  companion object {
    private const val PREFERENCE_NAME = "emoji-recent-manager"
    private const val TIME_DELIMITER = ";"
    private const val EMOJI_DELIMITER = "~"
    private const val RECENT_EMOJIS = "recent-emojis"
    const val EMOJI_GUESS_SIZE = 5
    const val MAX_RECENTS = 40

    class Data(val emoji: Emoji, val timestamp: Long)

    class EmojiList(size: Int) {
      companion object {
        val COMPARATOR: Comparator<Data> =
          Comparator<Data> { lhs, rhs ->
            java.lang.Long.valueOf(rhs.timestamp).compareTo(lhs.timestamp)
          }
      }

      var emojis: MutableList<Data> = ArrayList<Data>(size)

      fun add(emoji: Emoji) {
        add(emoji, System.currentTimeMillis())
      }

      fun add(emoji: Emoji, timestamp: Long) {
        val iterator: MutableIterator<Data> =
          emojis.iterator()
        val emojiBase = emoji.getBase()
        while (iterator.hasNext()) {
          val data: Data = iterator.next()
          if (data.emoji.getBase() == emojiBase) { // Do the comparison by base so that skin tones are only saved once.
            iterator.remove()
          }
        }
        emojis.add(0, Data(emoji, timestamp))
        if (emojis.size > MAX_RECENTS) {
          emojis.removeAt(MAX_RECENTS)
        }
      }

      fun getEmojis(): Collection<Emoji> {
        Collections.sort(emojis, COMPARATOR)
        val sortedEmojis: MutableCollection<Emoji> = ArrayList(emojis.size)
        for (data in emojis) {
          sortedEmojis.add(data.emoji)
        }
        return sortedEmojis
      }

      fun size(): Int = emojis.size

      operator fun get(index: Int): Data = emojis[index]
    }
  }

  @NonNull
  private var context: Context = context.applicationContext

  @NonNull
  private var emojiList: EmojiList = EmojiList(0)

  override fun getRecentEmojis(): Collection<Emoji> {
    if (emojiList.size() == 0) {
      val savedRecentEmojis: String = getPreferences().getString(RECENT_EMOJIS, "")!!
      if (savedRecentEmojis.isNotEmpty()) {
        val stringTokenizer = StringTokenizer(savedRecentEmojis, EMOJI_DELIMITER)
        emojiList = EmojiList(stringTokenizer.countTokens())
        while (stringTokenizer.hasMoreTokens()) {
          val token = stringTokenizer.nextToken()
          val parts = token.split(TIME_DELIMITER).toTypedArray()
          if (parts.size == 2) {
            val emoji = EmojiManager.getInstance().findEmoji(parts[0])
            if (emoji != null && emoji.getLength() == parts[0].length) {
              val timestamp = parts[1].toLong()
              emojiList.add(emoji, timestamp)
            }
          }
        }
      } else {
        emojiList = EmojiList(0)
      }
    }

    return emojiList.getEmojis()
  }

  override fun addEmoji(emoji: Emoji) {
    emojiList.add(emoji)
  }

  override fun persist() {
    if (emojiList.size() > 0) {
      val stringBuilder = StringBuilder(emojiList.size() * EMOJI_GUESS_SIZE)
      for (i in 0 until emojiList.size()) {
        val data: Data = emojiList[i]
        stringBuilder.append(data.emoji.getUnicode())
          .append(TIME_DELIMITER)
          .append(data.timestamp)
          .append(EMOJI_DELIMITER)
      }
      stringBuilder.setLength(stringBuilder.length - EMOJI_DELIMITER.length)
      getPreferences().edit().putString(RECENT_EMOJIS, stringBuilder.toString()).apply()
    }
  }

  private fun getPreferences(): SharedPreferences {
    return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
  }

}