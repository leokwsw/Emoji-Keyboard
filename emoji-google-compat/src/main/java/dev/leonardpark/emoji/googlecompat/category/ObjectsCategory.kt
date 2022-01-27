package dev.leonardpark.emoji.googlecompat.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.googlecompat.GoogleCompatEmoji
import dev.leonardpark.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class ObjectsCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      GoogleCompatEmoji(0x231a),
      GoogleCompatEmoji(0x1f4f1),
      GoogleCompatEmoji(0x1f4f2),
      GoogleCompatEmoji(0x1f4bb),
      GoogleCompatEmoji(0x2328),
      GoogleCompatEmoji(0x1f5a5),
      GoogleCompatEmoji(0x1f5a8),
      GoogleCompatEmoji(0x1f5b1),
      GoogleCompatEmoji(0x1f5b2),
      GoogleCompatEmoji(0x1f579),
      GoogleCompatEmoji(0x1f5dc),
      GoogleCompatEmoji(0x1f4bd),
      GoogleCompatEmoji(0x1f4be),
      GoogleCompatEmoji(0x1f4bf),
      GoogleCompatEmoji(0x1f4c0),
      GoogleCompatEmoji(0x1f4fc),
      GoogleCompatEmoji(0x1f4f7),
      GoogleCompatEmoji(0x1f4f8),
      GoogleCompatEmoji(0x1f4f9),
      GoogleCompatEmoji(0x1f3a5),
      GoogleCompatEmoji(0x1f4fd),
      GoogleCompatEmoji(0x1f39e),
      GoogleCompatEmoji(0x1f4de),
      GoogleCompatEmoji(0x260e),
      GoogleCompatEmoji(0x1f4df),
      GoogleCompatEmoji(0x1f4e0),
      GoogleCompatEmoji(0x1f4fa),
      GoogleCompatEmoji(0x1f4fb),
      GoogleCompatEmoji(0x1f399),
      GoogleCompatEmoji(0x1f39a),
      GoogleCompatEmoji(0x1f39b),
      GoogleCompatEmoji(0x1f9ed),
      GoogleCompatEmoji(0x23f1),
      GoogleCompatEmoji(0x23f2),
      GoogleCompatEmoji(0x23f0),
      GoogleCompatEmoji(0x1f570),
      GoogleCompatEmoji(0x231b),
      GoogleCompatEmoji(0x23f3),
      GoogleCompatEmoji(0x1f4e1),
      GoogleCompatEmoji(0x1f50b),
      GoogleCompatEmoji(0x1f50c),
      GoogleCompatEmoji(0x1f4a1),
      GoogleCompatEmoji(0x1f526),
      GoogleCompatEmoji(0x1f56f),
      GoogleCompatEmoji(0x1fa94),
      GoogleCompatEmoji(0x1f9ef),
      GoogleCompatEmoji(0x1f6e2),
      GoogleCompatEmoji(0x1f4b8),
      GoogleCompatEmoji(0x1f4b5),
      GoogleCompatEmoji(0x1f4b4),
      GoogleCompatEmoji(0x1f4b6),
      GoogleCompatEmoji(0x1f4b7),
      GoogleCompatEmoji(0x1fa99),
      GoogleCompatEmoji(0x1f4b0),
      GoogleCompatEmoji(0x1f4b3),
      GoogleCompatEmoji(0x1f48e),
      GoogleCompatEmoji(0x2696),
      GoogleCompatEmoji(0x1fa9c),
      GoogleCompatEmoji(0x1f9f0),
      GoogleCompatEmoji(0x1fa9b),
      GoogleCompatEmoji(0x1f527),
      GoogleCompatEmoji(0x1f528),
      GoogleCompatEmoji(0x2692),
      GoogleCompatEmoji(0x1f6e0),
      GoogleCompatEmoji(0x26cf),
      GoogleCompatEmoji(0x1f529),
      GoogleCompatEmoji(0x2699),
      GoogleCompatEmoji(0x1f9f1),
      GoogleCompatEmoji(0x26d3),
      GoogleCompatEmoji(0x1fa9d),
      GoogleCompatEmoji(0x1faa2),
      GoogleCompatEmoji(0x1f9f2),
      GoogleCompatEmoji(0x1f52b),
      GoogleCompatEmoji(0x1f4a3),
      GoogleCompatEmoji(0x1f9e8),
      GoogleCompatEmoji(0x1fa93),
      GoogleCompatEmoji(0x1fa9a),
      GoogleCompatEmoji(0x1f52a),
      GoogleCompatEmoji(0x1f5e1),
      GoogleCompatEmoji(0x2694),
      GoogleCompatEmoji(0x1f6e1),
      GoogleCompatEmoji(0x1f6ac),
      GoogleCompatEmoji(0x26b0),
      GoogleCompatEmoji(0x1faa6),
      GoogleCompatEmoji(0x26b1),
      GoogleCompatEmoji(0x1f3fa),
      GoogleCompatEmoji(0x1fa84),
      GoogleCompatEmoji(0x1f52e),
      GoogleCompatEmoji(0x1f4ff),
      GoogleCompatEmoji(0x1f9ff),
      GoogleCompatEmoji(0x1f488),
      GoogleCompatEmoji(0x2697),
      GoogleCompatEmoji(0x1f52d),
      GoogleCompatEmoji(0x1f52c),
      GoogleCompatEmoji(0x1f573),
      GoogleCompatEmoji(0x1fa9f),
      GoogleCompatEmoji(0x1fa79),
      GoogleCompatEmoji(0x1fa7a),
      GoogleCompatEmoji(0x1f48a),
      GoogleCompatEmoji(0x1f489),
      GoogleCompatEmoji(0x1fa78),
      GoogleCompatEmoji(0x1f9ec),
      GoogleCompatEmoji(0x1f9a0),
      GoogleCompatEmoji(0x1f9eb),
      GoogleCompatEmoji(0x1f9ea),
      GoogleCompatEmoji(0x1f321),
      GoogleCompatEmoji(0x1faa4),
      GoogleCompatEmoji(0x1f9f9),
      GoogleCompatEmoji(0x1f9fa),
      GoogleCompatEmoji(0x1faa1),
      GoogleCompatEmoji(0x1f9fb),
      GoogleCompatEmoji(0x1f6bd),
      GoogleCompatEmoji(0x1faa0),
      GoogleCompatEmoji(0x1faa3),
      GoogleCompatEmoji(0x1f6b0),
      GoogleCompatEmoji(0x1f6bf),
      GoogleCompatEmoji(0x1f6c1),
      GoogleCompatEmoji(0x1f6c0, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6c0, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f6c0, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f6c0, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f6c0, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f6c0, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1faa5),
      GoogleCompatEmoji(0x1f9fc),
      GoogleCompatEmoji(0x1fa92),
      GoogleCompatEmoji(0x1f9fd),
      GoogleCompatEmoji(0x1f9f4),
      GoogleCompatEmoji(0x1f6ce),
      GoogleCompatEmoji(0x1f511),
      GoogleCompatEmoji(0x1f5dd),
      GoogleCompatEmoji(0x1f6aa),
      GoogleCompatEmoji(0x1fa91),
      GoogleCompatEmoji(0x1fa9e),
      GoogleCompatEmoji(0x1f6cb),
      GoogleCompatEmoji(0x1f6cf),
      GoogleCompatEmoji(0x1f6cc, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6cc, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f6cc, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f6cc, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f6cc, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f6cc, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9f8),
      GoogleCompatEmoji(0x1f5bc),
      GoogleCompatEmoji(0x1f6cd),
      GoogleCompatEmoji(0x1f6d2),
      GoogleCompatEmoji(0x1f381),
      GoogleCompatEmoji(0x1f388),
      GoogleCompatEmoji(0x1f38f),
      GoogleCompatEmoji(0x1f380),
      GoogleCompatEmoji(0x1f38a),
      GoogleCompatEmoji(0x1f389),
      GoogleCompatEmoji(0x1fa85),
      GoogleCompatEmoji(0x1fa86),
      GoogleCompatEmoji(0x1f38e),
      GoogleCompatEmoji(0x1f3ee),
      GoogleCompatEmoji(0x1f390),
      GoogleCompatEmoji(0x1f9e7),
      GoogleCompatEmoji(0x2709),
      GoogleCompatEmoji(0x1f4e9),
      GoogleCompatEmoji(0x1f4e8),
      GoogleCompatEmoji(0x1f4e7),
      GoogleCompatEmoji(0x1f48c),
      GoogleCompatEmoji(0x1f4e5),
      GoogleCompatEmoji(0x1f4e4),
      GoogleCompatEmoji(0x1f4e6),
      GoogleCompatEmoji(0x1f3f7),
      GoogleCompatEmoji(0x1f4ea),
      GoogleCompatEmoji(0x1f4eb),
      GoogleCompatEmoji(0x1f4ec),
      GoogleCompatEmoji(0x1f4ed),
      GoogleCompatEmoji(0x1f4ee),
      GoogleCompatEmoji(0x1f4ef),
      GoogleCompatEmoji(0x1faa7),
      GoogleCompatEmoji(0x1f4dc),
      GoogleCompatEmoji(0x1f4c3),
      GoogleCompatEmoji(0x1f4c4),
      GoogleCompatEmoji(0x1f4d1),
      GoogleCompatEmoji(0x1f9fe),
      GoogleCompatEmoji(0x1f4ca),
      GoogleCompatEmoji(0x1f4c8),
      GoogleCompatEmoji(0x1f4c9),
      GoogleCompatEmoji(0x1f5d2),
      GoogleCompatEmoji(0x1f5d3),
      GoogleCompatEmoji(0x1f4c6),
      GoogleCompatEmoji(0x1f4c5),
      GoogleCompatEmoji(0x1f5d1),
      GoogleCompatEmoji(0x1f4c7),
      GoogleCompatEmoji(0x1f5c3),
      GoogleCompatEmoji(0x1f5f3),
      GoogleCompatEmoji(0x1f5c4),
      GoogleCompatEmoji(0x1f4cb),
      GoogleCompatEmoji(0x1f4c1),
      GoogleCompatEmoji(0x1f4c2),
      GoogleCompatEmoji(0x1f5c2),
      GoogleCompatEmoji(0x1f5de),
      GoogleCompatEmoji(0x1f4f0),
      GoogleCompatEmoji(0x1f4d3),
      GoogleCompatEmoji(0x1f4d4),
      GoogleCompatEmoji(0x1f4d2),
      GoogleCompatEmoji(0x1f4d5),
      GoogleCompatEmoji(0x1f4d7),
      GoogleCompatEmoji(0x1f4d8),
      GoogleCompatEmoji(0x1f4d9),
      GoogleCompatEmoji(0x1f4da),
      GoogleCompatEmoji(0x1f4d6),
      GoogleCompatEmoji(0x1f516),
      GoogleCompatEmoji(0x1f9f7),
      GoogleCompatEmoji(0x1f517),
      GoogleCompatEmoji(0x1f4ce),
      GoogleCompatEmoji(0x1f587),
      GoogleCompatEmoji(0x1f4d0),
      GoogleCompatEmoji(0x1f4cf),
      GoogleCompatEmoji(0x1f9ee),
      GoogleCompatEmoji(0x1f4cc),
      GoogleCompatEmoji(0x1f4cd),
      GoogleCompatEmoji(0x2702),
      GoogleCompatEmoji(0x1f58a),
      GoogleCompatEmoji(0x1f58b),
      GoogleCompatEmoji(0x2712),
      GoogleCompatEmoji(0x1f58c),
      GoogleCompatEmoji(0x1f58d),
      GoogleCompatEmoji(0x1f4dd),
      GoogleCompatEmoji(0x270f),
      GoogleCompatEmoji(0x1f50d),
      GoogleCompatEmoji(0x1f50e),
      GoogleCompatEmoji(0x1f50f),
      GoogleCompatEmoji(0x1f510),
      GoogleCompatEmoji(0x1f512),
      GoogleCompatEmoji(0x1f513)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_googlecompat_category_objects
}