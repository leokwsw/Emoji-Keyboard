package dev.leonardpark.emoji.facebook.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.facebook.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class ActivityCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      Emoji(0x26bd, R.drawable.emoji_facebook_26bd),
      Emoji(0x1f3c0, R.drawable.emoji_facebook_1f3c0),
      Emoji(0x1f3c8, R.drawable.emoji_facebook_1f3c8),
      Emoji(0x26be, R.drawable.emoji_facebook_26be),
      Emoji(0x1f94e, R.drawable.emoji_facebook_1f94e),
      Emoji(0x1f3be, R.drawable.emoji_facebook_1f3be),
      Emoji(0x1f3d0, R.drawable.emoji_facebook_1f3d0),
      Emoji(0x1f3c9, R.drawable.emoji_facebook_1f3c9),
      Emoji(0x1f94f, R.drawable.emoji_facebook_1f94f),
      Emoji(0x1f3b1, R.drawable.emoji_facebook_1f3b1),
      Emoji(0x1fa80, R.drawable.emoji_facebook_1fa80),
      Emoji(0x1f3d3, R.drawable.emoji_facebook_1f3d3),
      Emoji(0x1f3f8, R.drawable.emoji_facebook_1f3f8),
      Emoji(0x1f3d2, R.drawable.emoji_facebook_1f3d2),
      Emoji(0x1f3d1, R.drawable.emoji_facebook_1f3d1),
      Emoji(0x1f94d, R.drawable.emoji_facebook_1f94d),
      Emoji(0x1f3cf, R.drawable.emoji_facebook_1f3cf),
      Emoji(0x1f945, R.drawable.emoji_facebook_1f945),
      Emoji(0x26f3, R.drawable.emoji_facebook_26f3),
      Emoji(0x1fa81, R.drawable.emoji_facebook_1fa81),
      Emoji(0x1f3f9, R.drawable.emoji_facebook_1f3f9),
      Emoji(0x1f3a3, R.drawable.emoji_facebook_1f3a3),
      Emoji(0x1f93f, R.drawable.emoji_facebook_1f93f),
      Emoji(0x1f94a, R.drawable.emoji_facebook_1f94a),
      Emoji(0x1f94b, R.drawable.emoji_facebook_1f94b),
      Emoji(0x1f3bd, R.drawable.emoji_facebook_1f3bd),
      Emoji(0x1f6f9, R.drawable.emoji_facebook_1f6f9),
      Emoji(0x1f6f7, R.drawable.emoji_facebook_1f6f7),
      Emoji(0x26f8, R.drawable.emoji_facebook_26f8),
      Emoji(0x1f94c, R.drawable.emoji_facebook_1f94c),
      Emoji(0x1f3bf, R.drawable.emoji_facebook_1f3bf),
      Emoji(0x26f7, R.drawable.emoji_facebook_26f7),
      Emoji(0x1f3c2, R.drawable.emoji_facebook_1f3c2, arrayOf(
        Emoji(intArrayOf(0x1f3c2, 0x1f3fb), R.drawable.emoji_facebook_1f3c2_1f3fb),
        Emoji(intArrayOf(0x1f3c2, 0x1f3fc), R.drawable.emoji_facebook_1f3c2_1f3fc),
        Emoji(intArrayOf(0x1f3c2, 0x1f3fd), R.drawable.emoji_facebook_1f3c2_1f3fd),
        Emoji(intArrayOf(0x1f3c2, 0x1f3fe), R.drawable.emoji_facebook_1f3c2_1f3fe),
        Emoji(intArrayOf(0x1f3c2, 0x1f3ff), R.drawable.emoji_facebook_1f3c2_1f3ff)
      )),
      Emoji(0x1fa82, R.drawable.emoji_facebook_1fa82),
      Emoji(0x1f3cb, R.drawable.emoji_facebook_1f3cb, arrayOf(
        Emoji(intArrayOf(0x1f3cb, 0x1f3fb), R.drawable.emoji_facebook_1f3cb_1f3fb),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fc), R.drawable.emoji_facebook_1f3cb_1f3fc),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fd), R.drawable.emoji_facebook_1f3cb_1f3fd),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fe), R.drawable.emoji_facebook_1f3cb_1f3fe),
        Emoji(intArrayOf(0x1f3cb, 0x1f3ff), R.drawable.emoji_facebook_1f3cb_1f3ff)
      )),
      Emoji(intArrayOf(0x1f3cb, 0xfe0f, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cb_fe0f_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3cb, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f3cb, 0xfe0f, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cb_fe0f_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3cb, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cb, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cb_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f93c, R.drawable.emoji_facebook_1f93c),
      Emoji(intArrayOf(0x1f93c, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93c_200d_2640_fe0f),
      Emoji(intArrayOf(0x1f93c, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93c_200d_2642_fe0f),
      Emoji(0x1f938, R.drawable.emoji_facebook_1f938, arrayOf(
        Emoji(intArrayOf(0x1f938, 0x1f3fb), R.drawable.emoji_facebook_1f938_1f3fb),
        Emoji(intArrayOf(0x1f938, 0x1f3fc), R.drawable.emoji_facebook_1f938_1f3fc),
        Emoji(intArrayOf(0x1f938, 0x1f3fd), R.drawable.emoji_facebook_1f938_1f3fd),
        Emoji(intArrayOf(0x1f938, 0x1f3fe), R.drawable.emoji_facebook_1f938_1f3fe),
        Emoji(intArrayOf(0x1f938, 0x1f3ff), R.drawable.emoji_facebook_1f938_1f3ff)
      )),
      Emoji(intArrayOf(0x1f938, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f938_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f938, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f938, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f938_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f938, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f938, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f938_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x26f9, R.drawable.emoji_facebook_26f9, arrayOf(
        Emoji(intArrayOf(0x26f9, 0x1f3fb), R.drawable.emoji_facebook_26f9_1f3fb),
        Emoji(intArrayOf(0x26f9, 0x1f3fc), R.drawable.emoji_facebook_26f9_1f3fc),
        Emoji(intArrayOf(0x26f9, 0x1f3fd), R.drawable.emoji_facebook_26f9_1f3fd),
        Emoji(intArrayOf(0x26f9, 0x1f3fe), R.drawable.emoji_facebook_26f9_1f3fe),
        Emoji(intArrayOf(0x26f9, 0x1f3ff), R.drawable.emoji_facebook_26f9_1f3ff)
      )),
      Emoji(intArrayOf(0x26f9, 0xfe0f, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_26f9_fe0f_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x26f9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x26f9, 0xfe0f, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_26f9_fe0f_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x26f9, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x26f9, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_26f9_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f93a, R.drawable.emoji_facebook_1f93a),
      Emoji(0x1f93e, R.drawable.emoji_facebook_1f93e, arrayOf(
        Emoji(intArrayOf(0x1f93e, 0x1f3fb), R.drawable.emoji_facebook_1f93e_1f3fb),
        Emoji(intArrayOf(0x1f93e, 0x1f3fc), R.drawable.emoji_facebook_1f93e_1f3fc),
        Emoji(intArrayOf(0x1f93e, 0x1f3fd), R.drawable.emoji_facebook_1f93e_1f3fd),
        Emoji(intArrayOf(0x1f93e, 0x1f3fe), R.drawable.emoji_facebook_1f93e_1f3fe),
        Emoji(intArrayOf(0x1f93e, 0x1f3ff), R.drawable.emoji_facebook_1f93e_1f3ff)
      )),
      Emoji(intArrayOf(0x1f93e, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93e_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f93e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f93e, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93e_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f93e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93e_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3cc, R.drawable.emoji_facebook_1f3cc, arrayOf(
        Emoji(intArrayOf(0x1f3cc, 0x1f3fb), R.drawable.emoji_facebook_1f3cc_1f3fb),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fc), R.drawable.emoji_facebook_1f3cc_1f3fc),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fd), R.drawable.emoji_facebook_1f3cc_1f3fd),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fe), R.drawable.emoji_facebook_1f3cc_1f3fe),
        Emoji(intArrayOf(0x1f3cc, 0x1f3ff), R.drawable.emoji_facebook_1f3cc_1f3ff)
      )),
      Emoji(intArrayOf(0x1f3cc, 0xfe0f, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cc_fe0f_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3cc, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f3cc, 0xfe0f, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cc_fe0f_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3cc, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3cc, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3cc_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3c7, R.drawable.emoji_facebook_1f3c7, arrayOf(
        Emoji(intArrayOf(0x1f3c7, 0x1f3fb), R.drawable.emoji_facebook_1f3c7_1f3fb),
        Emoji(intArrayOf(0x1f3c7, 0x1f3fc), R.drawable.emoji_facebook_1f3c7_1f3fc),
        Emoji(intArrayOf(0x1f3c7, 0x1f3fd), R.drawable.emoji_facebook_1f3c7_1f3fd),
        Emoji(intArrayOf(0x1f3c7, 0x1f3fe), R.drawable.emoji_facebook_1f3c7_1f3fe),
        Emoji(intArrayOf(0x1f3c7, 0x1f3ff), R.drawable.emoji_facebook_1f3c7_1f3ff)
      )),
      Emoji(0x1f9d8, R.drawable.emoji_facebook_1f9d8, arrayOf(
        Emoji(intArrayOf(0x1f9d8, 0x1f3fb), R.drawable.emoji_facebook_1f9d8_1f3fb),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fc), R.drawable.emoji_facebook_1f9d8_1f3fc),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fd), R.drawable.emoji_facebook_1f9d8_1f3fd),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fe), R.drawable.emoji_facebook_1f9d8_1f3fe),
        Emoji(intArrayOf(0x1f9d8, 0x1f3ff), R.drawable.emoji_facebook_1f9d8_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9d8, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d8_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d8, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9d8, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d8_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d8, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d8, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d8_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3c4, R.drawable.emoji_facebook_1f3c4, arrayOf(
        Emoji(intArrayOf(0x1f3c4, 0x1f3fb), R.drawable.emoji_facebook_1f3c4_1f3fb),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fc), R.drawable.emoji_facebook_1f3c4_1f3fc),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fd), R.drawable.emoji_facebook_1f3c4_1f3fd),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fe), R.drawable.emoji_facebook_1f3c4_1f3fe),
        Emoji(intArrayOf(0x1f3c4, 0x1f3ff), R.drawable.emoji_facebook_1f3c4_1f3ff)
      )),
      Emoji(intArrayOf(0x1f3c4, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c4_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3c4, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f3c4, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c4_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3c4, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c4, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c4_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3ca, R.drawable.emoji_facebook_1f3ca, arrayOf(
        Emoji(intArrayOf(0x1f3ca, 0x1f3fb), R.drawable.emoji_facebook_1f3ca_1f3fb),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fc), R.drawable.emoji_facebook_1f3ca_1f3fc),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fd), R.drawable.emoji_facebook_1f3ca_1f3fd),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fe), R.drawable.emoji_facebook_1f3ca_1f3fe),
        Emoji(intArrayOf(0x1f3ca, 0x1f3ff), R.drawable.emoji_facebook_1f3ca_1f3ff)
      )),
      Emoji(intArrayOf(0x1f3ca, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3ca_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3ca, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f3ca, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3ca_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3ca, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3ca, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3ca_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f93d, R.drawable.emoji_facebook_1f93d, arrayOf(
        Emoji(intArrayOf(0x1f93d, 0x1f3fb), R.drawable.emoji_facebook_1f93d_1f3fb),
        Emoji(intArrayOf(0x1f93d, 0x1f3fc), R.drawable.emoji_facebook_1f93d_1f3fc),
        Emoji(intArrayOf(0x1f93d, 0x1f3fd), R.drawable.emoji_facebook_1f93d_1f3fd),
        Emoji(intArrayOf(0x1f93d, 0x1f3fe), R.drawable.emoji_facebook_1f93d_1f3fe),
        Emoji(intArrayOf(0x1f93d, 0x1f3ff), R.drawable.emoji_facebook_1f93d_1f3ff)
      )),
      Emoji(intArrayOf(0x1f93d, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93d_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f93d, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f93d, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93d_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f93d, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f93d, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f93d_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f6a3, R.drawable.emoji_facebook_1f6a3, arrayOf(
        Emoji(intArrayOf(0x1f6a3, 0x1f3fb), R.drawable.emoji_facebook_1f6a3_1f3fb),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fc), R.drawable.emoji_facebook_1f6a3_1f3fc),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fd), R.drawable.emoji_facebook_1f6a3_1f3fd),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fe), R.drawable.emoji_facebook_1f6a3_1f3fe),
        Emoji(intArrayOf(0x1f6a3, 0x1f3ff), R.drawable.emoji_facebook_1f6a3_1f3ff)
      )),
      Emoji(intArrayOf(0x1f6a3, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6a3_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6a3, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f6a3, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6a3_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6a3, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6a3, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6a3_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9d7, R.drawable.emoji_facebook_1f9d7, arrayOf(
        Emoji(intArrayOf(0x1f9d7, 0x1f3fb), R.drawable.emoji_facebook_1f9d7_1f3fb),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fc), R.drawable.emoji_facebook_1f9d7_1f3fc),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fd), R.drawable.emoji_facebook_1f9d7_1f3fd),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fe), R.drawable.emoji_facebook_1f9d7_1f3fe),
        Emoji(intArrayOf(0x1f9d7, 0x1f3ff), R.drawable.emoji_facebook_1f9d7_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9d7, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d7_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d7, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9d7, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d7_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d7, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d7, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d7_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f6b5, R.drawable.emoji_facebook_1f6b5, arrayOf(
        Emoji(intArrayOf(0x1f6b5, 0x1f3fb), R.drawable.emoji_facebook_1f6b5_1f3fb),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fc), R.drawable.emoji_facebook_1f6b5_1f3fc),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fd), R.drawable.emoji_facebook_1f6b5_1f3fd),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fe), R.drawable.emoji_facebook_1f6b5_1f3fe),
        Emoji(intArrayOf(0x1f6b5, 0x1f3ff), R.drawable.emoji_facebook_1f6b5_1f3ff)
      )),
      Emoji(intArrayOf(0x1f6b5, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b5_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6b5, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f6b5, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b5_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6b5, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b5, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b5_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f6b4, R.drawable.emoji_facebook_1f6b4, arrayOf(
        Emoji(intArrayOf(0x1f6b4, 0x1f3fb), R.drawable.emoji_facebook_1f6b4_1f3fb),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fc), R.drawable.emoji_facebook_1f6b4_1f3fc),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fd), R.drawable.emoji_facebook_1f6b4_1f3fd),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fe), R.drawable.emoji_facebook_1f6b4_1f3fe),
        Emoji(intArrayOf(0x1f6b4, 0x1f3ff), R.drawable.emoji_facebook_1f6b4_1f3ff)
      )),
      Emoji(intArrayOf(0x1f6b4, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b4_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6b4, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f6b4, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b4_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6b4, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b4, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b4_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3c6, R.drawable.emoji_facebook_1f3c6),
      Emoji(0x1f947, R.drawable.emoji_facebook_1f947),
      Emoji(0x1f948, R.drawable.emoji_facebook_1f948),
      Emoji(0x1f949, R.drawable.emoji_facebook_1f949),
      Emoji(0x1f3c5, R.drawable.emoji_facebook_1f3c5),
      Emoji(0x1f396, R.drawable.emoji_facebook_1f396),
      Emoji(0x1f3f5, R.drawable.emoji_facebook_1f3f5),
      Emoji(0x1f397, R.drawable.emoji_facebook_1f397),
      Emoji(0x1f3ab, R.drawable.emoji_facebook_1f3ab),
      Emoji(0x1f39f, R.drawable.emoji_facebook_1f39f),
      Emoji(0x1f3aa, R.drawable.emoji_facebook_1f3aa),
      Emoji(0x1f939, R.drawable.emoji_facebook_1f939, arrayOf(
        Emoji(intArrayOf(0x1f939, 0x1f3fb), R.drawable.emoji_facebook_1f939_1f3fb),
        Emoji(intArrayOf(0x1f939, 0x1f3fc), R.drawable.emoji_facebook_1f939_1f3fc),
        Emoji(intArrayOf(0x1f939, 0x1f3fd), R.drawable.emoji_facebook_1f939_1f3fd),
        Emoji(intArrayOf(0x1f939, 0x1f3fe), R.drawable.emoji_facebook_1f939_1f3fe),
        Emoji(intArrayOf(0x1f939, 0x1f3ff), R.drawable.emoji_facebook_1f939_1f3ff)
      )),
      Emoji(intArrayOf(0x1f939, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f939_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f939, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f939, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f939_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f939, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f939, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f939_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3ad, R.drawable.emoji_facebook_1f3ad),
      Emoji(0x1fa70, R.drawable.emoji_facebook_1fa70),
      Emoji(0x1f3a8, R.drawable.emoji_facebook_1f3a8),
      Emoji(0x1f3ac, R.drawable.emoji_facebook_1f3ac),
      Emoji(0x1f3a4, R.drawable.emoji_facebook_1f3a4),
      Emoji(0x1f3a7, R.drawable.emoji_facebook_1f3a7),
      Emoji(0x1f3bc, R.drawable.emoji_facebook_1f3bc),
      Emoji(0x1f3b9, R.drawable.emoji_facebook_1f3b9),
      Emoji(0x1f941, R.drawable.emoji_facebook_1f941),
      Emoji(0x1f3b7, R.drawable.emoji_facebook_1f3b7),
      Emoji(0x1f3ba, R.drawable.emoji_facebook_1f3ba),
      Emoji(0x1f3b8, R.drawable.emoji_facebook_1f3b8),
      Emoji(0x1fa95, R.drawable.emoji_facebook_1fa95),
      Emoji(0x1f3bb, R.drawable.emoji_facebook_1f3bb),
      Emoji(0x1f3b2, R.drawable.emoji_facebook_1f3b2),
      Emoji(0x265f, R.drawable.emoji_facebook_265f),
      Emoji(0x1f3af, R.drawable.emoji_facebook_1f3af),
      Emoji(0x1f3b3, R.drawable.emoji_facebook_1f3b3),
      Emoji(0x1f3ae, R.drawable.emoji_facebook_1f3ae),
      Emoji(0x1f3b0, R.drawable.emoji_facebook_1f3b0),
      Emoji(0x1f9e9, R.drawable.emoji_facebook_1f9e9)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_facebook_category_activity
}
