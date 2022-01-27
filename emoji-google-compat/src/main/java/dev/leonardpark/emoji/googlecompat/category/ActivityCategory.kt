package dev.leonardpark.emoji.googlecompat.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.googlecompat.GoogleCompatEmoji
import dev.leonardpark.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class ActivityCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      GoogleCompatEmoji(0x26bd),
      GoogleCompatEmoji(0x1f3c0),
      GoogleCompatEmoji(0x1f3c8),
      GoogleCompatEmoji(0x26be),
      GoogleCompatEmoji(0x1f94e),
      GoogleCompatEmoji(0x1f3be),
      GoogleCompatEmoji(0x1f3d0),
      GoogleCompatEmoji(0x1f3c9),
      GoogleCompatEmoji(0x1f94f),
      GoogleCompatEmoji(0x1fa83),
      GoogleCompatEmoji(0x1f3b1),
      GoogleCompatEmoji(0x1fa80),
      GoogleCompatEmoji(0x1f3d3),
      GoogleCompatEmoji(0x1f3f8),
      GoogleCompatEmoji(0x1f3d2),
      GoogleCompatEmoji(0x1f3d1),
      GoogleCompatEmoji(0x1f94d),
      GoogleCompatEmoji(0x1f3cf),
      GoogleCompatEmoji(0x1f945),
      GoogleCompatEmoji(0x26f3),
      GoogleCompatEmoji(0x1fa81),
      GoogleCompatEmoji(0x1f3f9),
      GoogleCompatEmoji(0x1f3a3),
      GoogleCompatEmoji(0x1f93f),
      GoogleCompatEmoji(0x1f94a),
      GoogleCompatEmoji(0x1f94b),
      GoogleCompatEmoji(0x1f3bd),
      GoogleCompatEmoji(0x1f6f9),
      GoogleCompatEmoji(0x1f6fc),
      GoogleCompatEmoji(0x1f6f7),
      GoogleCompatEmoji(0x26f8),
      GoogleCompatEmoji(0x1f94c),
      GoogleCompatEmoji(0x1f3bf),
      GoogleCompatEmoji(0x26f7),
      GoogleCompatEmoji(0x1f3c2, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c2, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3c2, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3c2, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3c2, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3c2, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1fa82),
      GoogleCompatEmoji(0x1f3cb, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3cb, 0xfe0f, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3cb, 0xfe0f, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cb, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f93c),
      GoogleCompatEmoji(intArrayOf(0x1f93c, 0x200d, 0x2640, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f93c, 0x200d, 0x2642, 0xfe0f)),
      GoogleCompatEmoji(0x1f938, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f938, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f938, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f938, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x26f9, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x26f9, 0xfe0f, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x26f9, 0xfe0f, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x26f9, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f93a),
      GoogleCompatEmoji(0x1f93e, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f93e, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f93e, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3cc, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3cc, 0xfe0f, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3cc, 0xfe0f, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3cc, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3c7, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c7, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3c7, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3c7, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3c7, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3c7, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9d8, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d8, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3c4, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c4, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3ca, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3ca, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f93d, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f93d, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f93d, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f93d, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f6a3, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6a3, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9d7, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d7, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f6b5, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b5, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f6b4, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b4, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3c6),
      GoogleCompatEmoji(0x1f947),
      GoogleCompatEmoji(0x1f948),
      GoogleCompatEmoji(0x1f949),
      GoogleCompatEmoji(0x1f3c5),
      GoogleCompatEmoji(0x1f396),
      GoogleCompatEmoji(0x1f3f5),
      GoogleCompatEmoji(0x1f397),
      GoogleCompatEmoji(0x1f3ab),
      GoogleCompatEmoji(0x1f39f),
      GoogleCompatEmoji(0x1f3aa),
      GoogleCompatEmoji(0x1f939, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f939, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f939, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f939, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3ad),
      GoogleCompatEmoji(0x1fa70),
      GoogleCompatEmoji(0x1f3a8),
      GoogleCompatEmoji(0x1f3ac),
      GoogleCompatEmoji(0x1f3a4),
      GoogleCompatEmoji(0x1f3a7),
      GoogleCompatEmoji(0x1f3bc),
      GoogleCompatEmoji(0x1f3b9),
      GoogleCompatEmoji(0x1f941),
      GoogleCompatEmoji(0x1fa98),
      GoogleCompatEmoji(0x1f3b7),
      GoogleCompatEmoji(0x1f3ba),
      GoogleCompatEmoji(0x1f3b8),
      GoogleCompatEmoji(0x1fa95),
      GoogleCompatEmoji(0x1f3bb),
      GoogleCompatEmoji(0x1fa97),
      GoogleCompatEmoji(0x1f3b2),
      GoogleCompatEmoji(0x265f),
      GoogleCompatEmoji(0x1f3af),
      GoogleCompatEmoji(0x1f3b3),
      GoogleCompatEmoji(0x1f3ae),
      GoogleCompatEmoji(0x1f3b0),
      GoogleCompatEmoji(0x1f9e9)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_googlecompat_category_activity
}
