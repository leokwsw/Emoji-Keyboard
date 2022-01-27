package dev.leonardpark.emoji.facebook.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.facebook.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class PeopleCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      Emoji(0x1f600, R.drawable.emoji_facebook_1f600),
      Emoji(0x1f603, R.drawable.emoji_facebook_1f603),
      Emoji(0x1f604, R.drawable.emoji_facebook_1f604),
      Emoji(0x1f601, R.drawable.emoji_facebook_1f601),
      Emoji(0x1f606, R.drawable.emoji_facebook_1f606),
      Emoji(0x1f605, R.drawable.emoji_facebook_1f605),
      Emoji(0x1f602, R.drawable.emoji_facebook_1f602),
      Emoji(0x1f923, R.drawable.emoji_facebook_1f923),
      Emoji(0x263a, R.drawable.emoji_facebook_263a),
      Emoji(0x1f60a, R.drawable.emoji_facebook_1f60a),
      Emoji(0x1f607, R.drawable.emoji_facebook_1f607),
      Emoji(0x1f642, R.drawable.emoji_facebook_1f642),
      Emoji(0x1f643, R.drawable.emoji_facebook_1f643),
      Emoji(0x1f609, R.drawable.emoji_facebook_1f609),
      Emoji(0x1f60c, R.drawable.emoji_facebook_1f60c),
      Emoji(0x1f60d, R.drawable.emoji_facebook_1f60d),
      Emoji(0x1f970, R.drawable.emoji_facebook_1f970),
      Emoji(0x1f618, R.drawable.emoji_facebook_1f618),
      Emoji(0x1f617, R.drawable.emoji_facebook_1f617),
      Emoji(0x1f619, R.drawable.emoji_facebook_1f619),
      Emoji(0x1f61a, R.drawable.emoji_facebook_1f61a),
      Emoji(0x1f60b, R.drawable.emoji_facebook_1f60b),
      Emoji(0x1f61b, R.drawable.emoji_facebook_1f61b),
      Emoji(0x1f61d, R.drawable.emoji_facebook_1f61d),
      Emoji(0x1f61c, R.drawable.emoji_facebook_1f61c),
      Emoji(0x1f92a, R.drawable.emoji_facebook_1f92a),
      Emoji(0x1f928, R.drawable.emoji_facebook_1f928),
      Emoji(0x1f9d0, R.drawable.emoji_facebook_1f9d0),
      Emoji(0x1f913, R.drawable.emoji_facebook_1f913),
      Emoji(0x1f60e, R.drawable.emoji_facebook_1f60e),
      Emoji(0x1f929, R.drawable.emoji_facebook_1f929),
      Emoji(0x1f973, R.drawable.emoji_facebook_1f973),
      Emoji(0x1f60f, R.drawable.emoji_facebook_1f60f),
      Emoji(0x1f612, R.drawable.emoji_facebook_1f612),
      Emoji(0x1f61e, R.drawable.emoji_facebook_1f61e),
      Emoji(0x1f614, R.drawable.emoji_facebook_1f614),
      Emoji(0x1f61f, R.drawable.emoji_facebook_1f61f),
      Emoji(0x1f615, R.drawable.emoji_facebook_1f615),
      Emoji(0x1f641, R.drawable.emoji_facebook_1f641),
      Emoji(0x2639, R.drawable.emoji_facebook_2639),
      Emoji(0x1f623, R.drawable.emoji_facebook_1f623),
      Emoji(0x1f616, R.drawable.emoji_facebook_1f616),
      Emoji(0x1f62b, R.drawable.emoji_facebook_1f62b),
      Emoji(0x1f629, R.drawable.emoji_facebook_1f629),
      Emoji(0x1f97a, R.drawable.emoji_facebook_1f97a),
      Emoji(0x1f622, R.drawable.emoji_facebook_1f622),
      Emoji(0x1f62d, R.drawable.emoji_facebook_1f62d),
      Emoji(0x1f624, R.drawable.emoji_facebook_1f624),
      Emoji(0x1f620, R.drawable.emoji_facebook_1f620),
      Emoji(0x1f621, R.drawable.emoji_facebook_1f621),
      Emoji(0x1f92c, R.drawable.emoji_facebook_1f92c),
      Emoji(0x1f92f, R.drawable.emoji_facebook_1f92f),
      Emoji(0x1f633, R.drawable.emoji_facebook_1f633),
      Emoji(0x1f975, R.drawable.emoji_facebook_1f975),
      Emoji(0x1f976, R.drawable.emoji_facebook_1f976),
      Emoji(0x1f631, R.drawable.emoji_facebook_1f631),
      Emoji(0x1f628, R.drawable.emoji_facebook_1f628),
      Emoji(0x1f630, R.drawable.emoji_facebook_1f630),
      Emoji(0x1f625, R.drawable.emoji_facebook_1f625),
      Emoji(0x1f613, R.drawable.emoji_facebook_1f613),
      Emoji(0x1f917, R.drawable.emoji_facebook_1f917),
      Emoji(0x1f914, R.drawable.emoji_facebook_1f914),
      Emoji(0x1f92d, R.drawable.emoji_facebook_1f92d),
      Emoji(0x1f971, R.drawable.emoji_facebook_1f971),
      Emoji(0x1f92b, R.drawable.emoji_facebook_1f92b),
      Emoji(0x1f925, R.drawable.emoji_facebook_1f925),
      Emoji(0x1f636, R.drawable.emoji_facebook_1f636),
      Emoji(0x1f610, R.drawable.emoji_facebook_1f610),
      Emoji(0x1f611, R.drawable.emoji_facebook_1f611),
      Emoji(0x1f62c, R.drawable.emoji_facebook_1f62c),
      Emoji(0x1f644, R.drawable.emoji_facebook_1f644),
      Emoji(0x1f62f, R.drawable.emoji_facebook_1f62f),
      Emoji(0x1f626, R.drawable.emoji_facebook_1f626),
      Emoji(0x1f627, R.drawable.emoji_facebook_1f627),
      Emoji(0x1f62e, R.drawable.emoji_facebook_1f62e),
      Emoji(0x1f632, R.drawable.emoji_facebook_1f632),
      Emoji(0x1f634, R.drawable.emoji_facebook_1f634),
      Emoji(0x1f924, R.drawable.emoji_facebook_1f924),
      Emoji(0x1f62a, R.drawable.emoji_facebook_1f62a),
      Emoji(0x1f635, R.drawable.emoji_facebook_1f635),
      Emoji(0x1f910, R.drawable.emoji_facebook_1f910),
      Emoji(0x1f974, R.drawable.emoji_facebook_1f974),
      Emoji(0x1f922, R.drawable.emoji_facebook_1f922),
      Emoji(0x1f92e, R.drawable.emoji_facebook_1f92e),
      Emoji(0x1f927, R.drawable.emoji_facebook_1f927),
      Emoji(0x1f637, R.drawable.emoji_facebook_1f637),
      Emoji(0x1f912, R.drawable.emoji_facebook_1f912),
      Emoji(0x1f915, R.drawable.emoji_facebook_1f915),
      Emoji(0x1f911, R.drawable.emoji_facebook_1f911),
      Emoji(0x1f920, R.drawable.emoji_facebook_1f920),
      Emoji(0x1f608, R.drawable.emoji_facebook_1f608),
      Emoji(0x1f47f, R.drawable.emoji_facebook_1f47f),
      Emoji(0x1f479, R.drawable.emoji_facebook_1f479),
      Emoji(0x1f47a, R.drawable.emoji_facebook_1f47a),
      Emoji(0x1f921, R.drawable.emoji_facebook_1f921),
      Emoji(0x1f4a9, R.drawable.emoji_facebook_1f4a9),
      Emoji(0x1f47b, R.drawable.emoji_facebook_1f47b),
      Emoji(0x1f480, R.drawable.emoji_facebook_1f480),
      Emoji(0x2620, R.drawable.emoji_facebook_2620),
      Emoji(0x1f47d, R.drawable.emoji_facebook_1f47d),
      Emoji(0x1f47e, R.drawable.emoji_facebook_1f47e),
      Emoji(0x1f916, R.drawable.emoji_facebook_1f916),
      Emoji(0x1f383, R.drawable.emoji_facebook_1f383),
      Emoji(0x1f63a, R.drawable.emoji_facebook_1f63a),
      Emoji(0x1f638, R.drawable.emoji_facebook_1f638),
      Emoji(0x1f639, R.drawable.emoji_facebook_1f639),
      Emoji(0x1f63b, R.drawable.emoji_facebook_1f63b),
      Emoji(0x1f63c, R.drawable.emoji_facebook_1f63c),
      Emoji(0x1f63d, R.drawable.emoji_facebook_1f63d),
      Emoji(0x1f640, R.drawable.emoji_facebook_1f640),
      Emoji(0x1f63f, R.drawable.emoji_facebook_1f63f),
      Emoji(0x1f63e, R.drawable.emoji_facebook_1f63e),
      Emoji(0x1f932, R.drawable.emoji_facebook_1f932, arrayOf(
        Emoji(intArrayOf(0x1f932, 0x1f3fb), R.drawable.emoji_facebook_1f932_1f3fb),
        Emoji(intArrayOf(0x1f932, 0x1f3fc), R.drawable.emoji_facebook_1f932_1f3fc),
        Emoji(intArrayOf(0x1f932, 0x1f3fd), R.drawable.emoji_facebook_1f932_1f3fd),
        Emoji(intArrayOf(0x1f932, 0x1f3fe), R.drawable.emoji_facebook_1f932_1f3fe),
        Emoji(intArrayOf(0x1f932, 0x1f3ff), R.drawable.emoji_facebook_1f932_1f3ff)
      )),
      Emoji(0x1f450, R.drawable.emoji_facebook_1f450, arrayOf(
        Emoji(intArrayOf(0x1f450, 0x1f3fb), R.drawable.emoji_facebook_1f450_1f3fb),
        Emoji(intArrayOf(0x1f450, 0x1f3fc), R.drawable.emoji_facebook_1f450_1f3fc),
        Emoji(intArrayOf(0x1f450, 0x1f3fd), R.drawable.emoji_facebook_1f450_1f3fd),
        Emoji(intArrayOf(0x1f450, 0x1f3fe), R.drawable.emoji_facebook_1f450_1f3fe),
        Emoji(intArrayOf(0x1f450, 0x1f3ff), R.drawable.emoji_facebook_1f450_1f3ff)
      )),
      Emoji(0x1f64c, R.drawable.emoji_facebook_1f64c, arrayOf(
        Emoji(intArrayOf(0x1f64c, 0x1f3fb), R.drawable.emoji_facebook_1f64c_1f3fb),
        Emoji(intArrayOf(0x1f64c, 0x1f3fc), R.drawable.emoji_facebook_1f64c_1f3fc),
        Emoji(intArrayOf(0x1f64c, 0x1f3fd), R.drawable.emoji_facebook_1f64c_1f3fd),
        Emoji(intArrayOf(0x1f64c, 0x1f3fe), R.drawable.emoji_facebook_1f64c_1f3fe),
        Emoji(intArrayOf(0x1f64c, 0x1f3ff), R.drawable.emoji_facebook_1f64c_1f3ff)
      )),
      Emoji(0x1f44f, R.drawable.emoji_facebook_1f44f, arrayOf(
        Emoji(intArrayOf(0x1f44f, 0x1f3fb), R.drawable.emoji_facebook_1f44f_1f3fb),
        Emoji(intArrayOf(0x1f44f, 0x1f3fc), R.drawable.emoji_facebook_1f44f_1f3fc),
        Emoji(intArrayOf(0x1f44f, 0x1f3fd), R.drawable.emoji_facebook_1f44f_1f3fd),
        Emoji(intArrayOf(0x1f44f, 0x1f3fe), R.drawable.emoji_facebook_1f44f_1f3fe),
        Emoji(intArrayOf(0x1f44f, 0x1f3ff), R.drawable.emoji_facebook_1f44f_1f3ff)
      )),
      Emoji(0x1f91d, R.drawable.emoji_facebook_1f91d),
      Emoji(0x1f44d, R.drawable.emoji_facebook_1f44d, arrayOf(
        Emoji(intArrayOf(0x1f44d, 0x1f3fb), R.drawable.emoji_facebook_1f44d_1f3fb),
        Emoji(intArrayOf(0x1f44d, 0x1f3fc), R.drawable.emoji_facebook_1f44d_1f3fc),
        Emoji(intArrayOf(0x1f44d, 0x1f3fd), R.drawable.emoji_facebook_1f44d_1f3fd),
        Emoji(intArrayOf(0x1f44d, 0x1f3fe), R.drawable.emoji_facebook_1f44d_1f3fe),
        Emoji(intArrayOf(0x1f44d, 0x1f3ff), R.drawable.emoji_facebook_1f44d_1f3ff)
      )),
      Emoji(0x1f44e, R.drawable.emoji_facebook_1f44e, arrayOf(
        Emoji(intArrayOf(0x1f44e, 0x1f3fb), R.drawable.emoji_facebook_1f44e_1f3fb),
        Emoji(intArrayOf(0x1f44e, 0x1f3fc), R.drawable.emoji_facebook_1f44e_1f3fc),
        Emoji(intArrayOf(0x1f44e, 0x1f3fd), R.drawable.emoji_facebook_1f44e_1f3fd),
        Emoji(intArrayOf(0x1f44e, 0x1f3fe), R.drawable.emoji_facebook_1f44e_1f3fe),
        Emoji(intArrayOf(0x1f44e, 0x1f3ff), R.drawable.emoji_facebook_1f44e_1f3ff)
      )),
      Emoji(0x1f44a, R.drawable.emoji_facebook_1f44a, arrayOf(
        Emoji(intArrayOf(0x1f44a, 0x1f3fb), R.drawable.emoji_facebook_1f44a_1f3fb),
        Emoji(intArrayOf(0x1f44a, 0x1f3fc), R.drawable.emoji_facebook_1f44a_1f3fc),
        Emoji(intArrayOf(0x1f44a, 0x1f3fd), R.drawable.emoji_facebook_1f44a_1f3fd),
        Emoji(intArrayOf(0x1f44a, 0x1f3fe), R.drawable.emoji_facebook_1f44a_1f3fe),
        Emoji(intArrayOf(0x1f44a, 0x1f3ff), R.drawable.emoji_facebook_1f44a_1f3ff)
      )),
      Emoji(0x270a, R.drawable.emoji_facebook_270a, arrayOf(
        Emoji(intArrayOf(0x270a, 0x1f3fb), R.drawable.emoji_facebook_270a_1f3fb),
        Emoji(intArrayOf(0x270a, 0x1f3fc), R.drawable.emoji_facebook_270a_1f3fc),
        Emoji(intArrayOf(0x270a, 0x1f3fd), R.drawable.emoji_facebook_270a_1f3fd),
        Emoji(intArrayOf(0x270a, 0x1f3fe), R.drawable.emoji_facebook_270a_1f3fe),
        Emoji(intArrayOf(0x270a, 0x1f3ff), R.drawable.emoji_facebook_270a_1f3ff)
      )),
      Emoji(0x1f91b, R.drawable.emoji_facebook_1f91b, arrayOf(
        Emoji(intArrayOf(0x1f91b, 0x1f3fb), R.drawable.emoji_facebook_1f91b_1f3fb),
        Emoji(intArrayOf(0x1f91b, 0x1f3fc), R.drawable.emoji_facebook_1f91b_1f3fc),
        Emoji(intArrayOf(0x1f91b, 0x1f3fd), R.drawable.emoji_facebook_1f91b_1f3fd),
        Emoji(intArrayOf(0x1f91b, 0x1f3fe), R.drawable.emoji_facebook_1f91b_1f3fe),
        Emoji(intArrayOf(0x1f91b, 0x1f3ff), R.drawable.emoji_facebook_1f91b_1f3ff)
      )),
      Emoji(0x1f91c, R.drawable.emoji_facebook_1f91c, arrayOf(
        Emoji(intArrayOf(0x1f91c, 0x1f3fb), R.drawable.emoji_facebook_1f91c_1f3fb),
        Emoji(intArrayOf(0x1f91c, 0x1f3fc), R.drawable.emoji_facebook_1f91c_1f3fc),
        Emoji(intArrayOf(0x1f91c, 0x1f3fd), R.drawable.emoji_facebook_1f91c_1f3fd),
        Emoji(intArrayOf(0x1f91c, 0x1f3fe), R.drawable.emoji_facebook_1f91c_1f3fe),
        Emoji(intArrayOf(0x1f91c, 0x1f3ff), R.drawable.emoji_facebook_1f91c_1f3ff)
      )),
      Emoji(0x1f91e, R.drawable.emoji_facebook_1f91e, arrayOf(
        Emoji(intArrayOf(0x1f91e, 0x1f3fb), R.drawable.emoji_facebook_1f91e_1f3fb),
        Emoji(intArrayOf(0x1f91e, 0x1f3fc), R.drawable.emoji_facebook_1f91e_1f3fc),
        Emoji(intArrayOf(0x1f91e, 0x1f3fd), R.drawable.emoji_facebook_1f91e_1f3fd),
        Emoji(intArrayOf(0x1f91e, 0x1f3fe), R.drawable.emoji_facebook_1f91e_1f3fe),
        Emoji(intArrayOf(0x1f91e, 0x1f3ff), R.drawable.emoji_facebook_1f91e_1f3ff)
      )),
      Emoji(0x270c, R.drawable.emoji_facebook_270c, arrayOf(
        Emoji(intArrayOf(0x270c, 0x1f3fb), R.drawable.emoji_facebook_270c_1f3fb),
        Emoji(intArrayOf(0x270c, 0x1f3fc), R.drawable.emoji_facebook_270c_1f3fc),
        Emoji(intArrayOf(0x270c, 0x1f3fd), R.drawable.emoji_facebook_270c_1f3fd),
        Emoji(intArrayOf(0x270c, 0x1f3fe), R.drawable.emoji_facebook_270c_1f3fe),
        Emoji(intArrayOf(0x270c, 0x1f3ff), R.drawable.emoji_facebook_270c_1f3ff)
      )),
      Emoji(0x1f91f, R.drawable.emoji_facebook_1f91f, arrayOf(
        Emoji(intArrayOf(0x1f91f, 0x1f3fb), R.drawable.emoji_facebook_1f91f_1f3fb),
        Emoji(intArrayOf(0x1f91f, 0x1f3fc), R.drawable.emoji_facebook_1f91f_1f3fc),
        Emoji(intArrayOf(0x1f91f, 0x1f3fd), R.drawable.emoji_facebook_1f91f_1f3fd),
        Emoji(intArrayOf(0x1f91f, 0x1f3fe), R.drawable.emoji_facebook_1f91f_1f3fe),
        Emoji(intArrayOf(0x1f91f, 0x1f3ff), R.drawable.emoji_facebook_1f91f_1f3ff)
      )),
      Emoji(0x1f918, R.drawable.emoji_facebook_1f918, arrayOf(
        Emoji(intArrayOf(0x1f918, 0x1f3fb), R.drawable.emoji_facebook_1f918_1f3fb),
        Emoji(intArrayOf(0x1f918, 0x1f3fc), R.drawable.emoji_facebook_1f918_1f3fc),
        Emoji(intArrayOf(0x1f918, 0x1f3fd), R.drawable.emoji_facebook_1f918_1f3fd),
        Emoji(intArrayOf(0x1f918, 0x1f3fe), R.drawable.emoji_facebook_1f918_1f3fe),
        Emoji(intArrayOf(0x1f918, 0x1f3ff), R.drawable.emoji_facebook_1f918_1f3ff)
      )),
      Emoji(0x1f44c, R.drawable.emoji_facebook_1f44c, arrayOf(
        Emoji(intArrayOf(0x1f44c, 0x1f3fb), R.drawable.emoji_facebook_1f44c_1f3fb),
        Emoji(intArrayOf(0x1f44c, 0x1f3fc), R.drawable.emoji_facebook_1f44c_1f3fc),
        Emoji(intArrayOf(0x1f44c, 0x1f3fd), R.drawable.emoji_facebook_1f44c_1f3fd),
        Emoji(intArrayOf(0x1f44c, 0x1f3fe), R.drawable.emoji_facebook_1f44c_1f3fe),
        Emoji(intArrayOf(0x1f44c, 0x1f3ff), R.drawable.emoji_facebook_1f44c_1f3ff)
      )),
      Emoji(0x1f90f, R.drawable.emoji_facebook_1f90f, arrayOf(
        Emoji(intArrayOf(0x1f90f, 0x1f3fb), R.drawable.emoji_facebook_1f90f_1f3fb),
        Emoji(intArrayOf(0x1f90f, 0x1f3fc), R.drawable.emoji_facebook_1f90f_1f3fc),
        Emoji(intArrayOf(0x1f90f, 0x1f3fd), R.drawable.emoji_facebook_1f90f_1f3fd),
        Emoji(intArrayOf(0x1f90f, 0x1f3fe), R.drawable.emoji_facebook_1f90f_1f3fe),
        Emoji(intArrayOf(0x1f90f, 0x1f3ff), R.drawable.emoji_facebook_1f90f_1f3ff)
      )),
      Emoji(0x1f448, R.drawable.emoji_facebook_1f448, arrayOf(
        Emoji(intArrayOf(0x1f448, 0x1f3fb), R.drawable.emoji_facebook_1f448_1f3fb),
        Emoji(intArrayOf(0x1f448, 0x1f3fc), R.drawable.emoji_facebook_1f448_1f3fc),
        Emoji(intArrayOf(0x1f448, 0x1f3fd), R.drawable.emoji_facebook_1f448_1f3fd),
        Emoji(intArrayOf(0x1f448, 0x1f3fe), R.drawable.emoji_facebook_1f448_1f3fe),
        Emoji(intArrayOf(0x1f448, 0x1f3ff), R.drawable.emoji_facebook_1f448_1f3ff)
      )),
      Emoji(0x1f449, R.drawable.emoji_facebook_1f449, arrayOf(
        Emoji(intArrayOf(0x1f449, 0x1f3fb), R.drawable.emoji_facebook_1f449_1f3fb),
        Emoji(intArrayOf(0x1f449, 0x1f3fc), R.drawable.emoji_facebook_1f449_1f3fc),
        Emoji(intArrayOf(0x1f449, 0x1f3fd), R.drawable.emoji_facebook_1f449_1f3fd),
        Emoji(intArrayOf(0x1f449, 0x1f3fe), R.drawable.emoji_facebook_1f449_1f3fe),
        Emoji(intArrayOf(0x1f449, 0x1f3ff), R.drawable.emoji_facebook_1f449_1f3ff)
      )),
      Emoji(0x1f446, R.drawable.emoji_facebook_1f446, arrayOf(
        Emoji(intArrayOf(0x1f446, 0x1f3fb), R.drawable.emoji_facebook_1f446_1f3fb),
        Emoji(intArrayOf(0x1f446, 0x1f3fc), R.drawable.emoji_facebook_1f446_1f3fc),
        Emoji(intArrayOf(0x1f446, 0x1f3fd), R.drawable.emoji_facebook_1f446_1f3fd),
        Emoji(intArrayOf(0x1f446, 0x1f3fe), R.drawable.emoji_facebook_1f446_1f3fe),
        Emoji(intArrayOf(0x1f446, 0x1f3ff), R.drawable.emoji_facebook_1f446_1f3ff)
      )),
      Emoji(0x1f447, R.drawable.emoji_facebook_1f447, arrayOf(
        Emoji(intArrayOf(0x1f447, 0x1f3fb), R.drawable.emoji_facebook_1f447_1f3fb),
        Emoji(intArrayOf(0x1f447, 0x1f3fc), R.drawable.emoji_facebook_1f447_1f3fc),
        Emoji(intArrayOf(0x1f447, 0x1f3fd), R.drawable.emoji_facebook_1f447_1f3fd),
        Emoji(intArrayOf(0x1f447, 0x1f3fe), R.drawable.emoji_facebook_1f447_1f3fe),
        Emoji(intArrayOf(0x1f447, 0x1f3ff), R.drawable.emoji_facebook_1f447_1f3ff)
      )),
      Emoji(0x261d, R.drawable.emoji_facebook_261d, arrayOf(
        Emoji(intArrayOf(0x261d, 0x1f3fb), R.drawable.emoji_facebook_261d_1f3fb),
        Emoji(intArrayOf(0x261d, 0x1f3fc), R.drawable.emoji_facebook_261d_1f3fc),
        Emoji(intArrayOf(0x261d, 0x1f3fd), R.drawable.emoji_facebook_261d_1f3fd),
        Emoji(intArrayOf(0x261d, 0x1f3fe), R.drawable.emoji_facebook_261d_1f3fe),
        Emoji(intArrayOf(0x261d, 0x1f3ff), R.drawable.emoji_facebook_261d_1f3ff)
      )),
      Emoji(0x270b, R.drawable.emoji_facebook_270b, arrayOf(
        Emoji(intArrayOf(0x270b, 0x1f3fb), R.drawable.emoji_facebook_270b_1f3fb),
        Emoji(intArrayOf(0x270b, 0x1f3fc), R.drawable.emoji_facebook_270b_1f3fc),
        Emoji(intArrayOf(0x270b, 0x1f3fd), R.drawable.emoji_facebook_270b_1f3fd),
        Emoji(intArrayOf(0x270b, 0x1f3fe), R.drawable.emoji_facebook_270b_1f3fe),
        Emoji(intArrayOf(0x270b, 0x1f3ff), R.drawable.emoji_facebook_270b_1f3ff)
      )),
      Emoji(0x1f91a, R.drawable.emoji_facebook_1f91a, arrayOf(
        Emoji(intArrayOf(0x1f91a, 0x1f3fb), R.drawable.emoji_facebook_1f91a_1f3fb),
        Emoji(intArrayOf(0x1f91a, 0x1f3fc), R.drawable.emoji_facebook_1f91a_1f3fc),
        Emoji(intArrayOf(0x1f91a, 0x1f3fd), R.drawable.emoji_facebook_1f91a_1f3fd),
        Emoji(intArrayOf(0x1f91a, 0x1f3fe), R.drawable.emoji_facebook_1f91a_1f3fe),
        Emoji(intArrayOf(0x1f91a, 0x1f3ff), R.drawable.emoji_facebook_1f91a_1f3ff)
      )),
      Emoji(0x1f590, R.drawable.emoji_facebook_1f590, arrayOf(
        Emoji(intArrayOf(0x1f590, 0x1f3fb), R.drawable.emoji_facebook_1f590_1f3fb),
        Emoji(intArrayOf(0x1f590, 0x1f3fc), R.drawable.emoji_facebook_1f590_1f3fc),
        Emoji(intArrayOf(0x1f590, 0x1f3fd), R.drawable.emoji_facebook_1f590_1f3fd),
        Emoji(intArrayOf(0x1f590, 0x1f3fe), R.drawable.emoji_facebook_1f590_1f3fe),
        Emoji(intArrayOf(0x1f590, 0x1f3ff), R.drawable.emoji_facebook_1f590_1f3ff)
      )),
      Emoji(0x1f596, R.drawable.emoji_facebook_1f596, arrayOf(
        Emoji(intArrayOf(0x1f596, 0x1f3fb), R.drawable.emoji_facebook_1f596_1f3fb),
        Emoji(intArrayOf(0x1f596, 0x1f3fc), R.drawable.emoji_facebook_1f596_1f3fc),
        Emoji(intArrayOf(0x1f596, 0x1f3fd), R.drawable.emoji_facebook_1f596_1f3fd),
        Emoji(intArrayOf(0x1f596, 0x1f3fe), R.drawable.emoji_facebook_1f596_1f3fe),
        Emoji(intArrayOf(0x1f596, 0x1f3ff), R.drawable.emoji_facebook_1f596_1f3ff)
      )),
      Emoji(0x1f44b, R.drawable.emoji_facebook_1f44b, arrayOf(
        Emoji(intArrayOf(0x1f44b, 0x1f3fb), R.drawable.emoji_facebook_1f44b_1f3fb),
        Emoji(intArrayOf(0x1f44b, 0x1f3fc), R.drawable.emoji_facebook_1f44b_1f3fc),
        Emoji(intArrayOf(0x1f44b, 0x1f3fd), R.drawable.emoji_facebook_1f44b_1f3fd),
        Emoji(intArrayOf(0x1f44b, 0x1f3fe), R.drawable.emoji_facebook_1f44b_1f3fe),
        Emoji(intArrayOf(0x1f44b, 0x1f3ff), R.drawable.emoji_facebook_1f44b_1f3ff)
      )),
      Emoji(0x1f919, R.drawable.emoji_facebook_1f919, arrayOf(
        Emoji(intArrayOf(0x1f919, 0x1f3fb), R.drawable.emoji_facebook_1f919_1f3fb),
        Emoji(intArrayOf(0x1f919, 0x1f3fc), R.drawable.emoji_facebook_1f919_1f3fc),
        Emoji(intArrayOf(0x1f919, 0x1f3fd), R.drawable.emoji_facebook_1f919_1f3fd),
        Emoji(intArrayOf(0x1f919, 0x1f3fe), R.drawable.emoji_facebook_1f919_1f3fe),
        Emoji(intArrayOf(0x1f919, 0x1f3ff), R.drawable.emoji_facebook_1f919_1f3ff)
      )),
      Emoji(0x1f4aa, R.drawable.emoji_facebook_1f4aa, arrayOf(
        Emoji(intArrayOf(0x1f4aa, 0x1f3fb), R.drawable.emoji_facebook_1f4aa_1f3fb),
        Emoji(intArrayOf(0x1f4aa, 0x1f3fc), R.drawable.emoji_facebook_1f4aa_1f3fc),
        Emoji(intArrayOf(0x1f4aa, 0x1f3fd), R.drawable.emoji_facebook_1f4aa_1f3fd),
        Emoji(intArrayOf(0x1f4aa, 0x1f3fe), R.drawable.emoji_facebook_1f4aa_1f3fe),
        Emoji(intArrayOf(0x1f4aa, 0x1f3ff), R.drawable.emoji_facebook_1f4aa_1f3ff)
      )),
      Emoji(0x1f9be, R.drawable.emoji_facebook_1f9be),
      Emoji(0x1f595, R.drawable.emoji_facebook_1f595, arrayOf(
        Emoji(intArrayOf(0x1f595, 0x1f3fb), R.drawable.emoji_facebook_1f595_1f3fb),
        Emoji(intArrayOf(0x1f595, 0x1f3fc), R.drawable.emoji_facebook_1f595_1f3fc),
        Emoji(intArrayOf(0x1f595, 0x1f3fd), R.drawable.emoji_facebook_1f595_1f3fd),
        Emoji(intArrayOf(0x1f595, 0x1f3fe), R.drawable.emoji_facebook_1f595_1f3fe),
        Emoji(intArrayOf(0x1f595, 0x1f3ff), R.drawable.emoji_facebook_1f595_1f3ff)
      )),
      Emoji(0x270d, R.drawable.emoji_facebook_270d, arrayOf(
        Emoji(intArrayOf(0x270d, 0x1f3fb), R.drawable.emoji_facebook_270d_1f3fb),
        Emoji(intArrayOf(0x270d, 0x1f3fc), R.drawable.emoji_facebook_270d_1f3fc),
        Emoji(intArrayOf(0x270d, 0x1f3fd), R.drawable.emoji_facebook_270d_1f3fd),
        Emoji(intArrayOf(0x270d, 0x1f3fe), R.drawable.emoji_facebook_270d_1f3fe),
        Emoji(intArrayOf(0x270d, 0x1f3ff), R.drawable.emoji_facebook_270d_1f3ff)
      )),
      Emoji(0x1f64f, R.drawable.emoji_facebook_1f64f, arrayOf(
        Emoji(intArrayOf(0x1f64f, 0x1f3fb), R.drawable.emoji_facebook_1f64f_1f3fb),
        Emoji(intArrayOf(0x1f64f, 0x1f3fc), R.drawable.emoji_facebook_1f64f_1f3fc),
        Emoji(intArrayOf(0x1f64f, 0x1f3fd), R.drawable.emoji_facebook_1f64f_1f3fd),
        Emoji(intArrayOf(0x1f64f, 0x1f3fe), R.drawable.emoji_facebook_1f64f_1f3fe),
        Emoji(intArrayOf(0x1f64f, 0x1f3ff), R.drawable.emoji_facebook_1f64f_1f3ff)
      )),
      Emoji(0x1f9b6, R.drawable.emoji_facebook_1f9b6, arrayOf(
        Emoji(intArrayOf(0x1f9b6, 0x1f3fb), R.drawable.emoji_facebook_1f9b6_1f3fb),
        Emoji(intArrayOf(0x1f9b6, 0x1f3fc), R.drawable.emoji_facebook_1f9b6_1f3fc),
        Emoji(intArrayOf(0x1f9b6, 0x1f3fd), R.drawable.emoji_facebook_1f9b6_1f3fd),
        Emoji(intArrayOf(0x1f9b6, 0x1f3fe), R.drawable.emoji_facebook_1f9b6_1f3fe),
        Emoji(intArrayOf(0x1f9b6, 0x1f3ff), R.drawable.emoji_facebook_1f9b6_1f3ff)
      )),
      Emoji(0x1f9b5, R.drawable.emoji_facebook_1f9b5, arrayOf(
        Emoji(intArrayOf(0x1f9b5, 0x1f3fb), R.drawable.emoji_facebook_1f9b5_1f3fb),
        Emoji(intArrayOf(0x1f9b5, 0x1f3fc), R.drawable.emoji_facebook_1f9b5_1f3fc),
        Emoji(intArrayOf(0x1f9b5, 0x1f3fd), R.drawable.emoji_facebook_1f9b5_1f3fd),
        Emoji(intArrayOf(0x1f9b5, 0x1f3fe), R.drawable.emoji_facebook_1f9b5_1f3fe),
        Emoji(intArrayOf(0x1f9b5, 0x1f3ff), R.drawable.emoji_facebook_1f9b5_1f3ff)
      )),
      Emoji(0x1f9bf, R.drawable.emoji_facebook_1f9bf),
      Emoji(0x1f484, R.drawable.emoji_facebook_1f484),
      Emoji(0x1f48b, R.drawable.emoji_facebook_1f48b),
      Emoji(0x1f444, R.drawable.emoji_facebook_1f444),
      Emoji(0x1f9b7, R.drawable.emoji_facebook_1f9b7),
      Emoji(0x1f445, R.drawable.emoji_facebook_1f445),
      Emoji(0x1f442, R.drawable.emoji_facebook_1f442, arrayOf(
        Emoji(intArrayOf(0x1f442, 0x1f3fb), R.drawable.emoji_facebook_1f442_1f3fb),
        Emoji(intArrayOf(0x1f442, 0x1f3fc), R.drawable.emoji_facebook_1f442_1f3fc),
        Emoji(intArrayOf(0x1f442, 0x1f3fd), R.drawable.emoji_facebook_1f442_1f3fd),
        Emoji(intArrayOf(0x1f442, 0x1f3fe), R.drawable.emoji_facebook_1f442_1f3fe),
        Emoji(intArrayOf(0x1f442, 0x1f3ff), R.drawable.emoji_facebook_1f442_1f3ff)
      )),
      Emoji(0x1f9bb, R.drawable.emoji_facebook_1f9bb, arrayOf(
        Emoji(intArrayOf(0x1f9bb, 0x1f3fb), R.drawable.emoji_facebook_1f9bb_1f3fb),
        Emoji(intArrayOf(0x1f9bb, 0x1f3fc), R.drawable.emoji_facebook_1f9bb_1f3fc),
        Emoji(intArrayOf(0x1f9bb, 0x1f3fd), R.drawable.emoji_facebook_1f9bb_1f3fd),
        Emoji(intArrayOf(0x1f9bb, 0x1f3fe), R.drawable.emoji_facebook_1f9bb_1f3fe),
        Emoji(intArrayOf(0x1f9bb, 0x1f3ff), R.drawable.emoji_facebook_1f9bb_1f3ff)
      )),
      Emoji(0x1f443, R.drawable.emoji_facebook_1f443, arrayOf(
        Emoji(intArrayOf(0x1f443, 0x1f3fb), R.drawable.emoji_facebook_1f443_1f3fb),
        Emoji(intArrayOf(0x1f443, 0x1f3fc), R.drawable.emoji_facebook_1f443_1f3fc),
        Emoji(intArrayOf(0x1f443, 0x1f3fd), R.drawable.emoji_facebook_1f443_1f3fd),
        Emoji(intArrayOf(0x1f443, 0x1f3fe), R.drawable.emoji_facebook_1f443_1f3fe),
        Emoji(intArrayOf(0x1f443, 0x1f3ff), R.drawable.emoji_facebook_1f443_1f3ff)
      )),
      Emoji(0x1f463, R.drawable.emoji_facebook_1f463),
      Emoji(0x1f441, R.drawable.emoji_facebook_1f441),
      Emoji(0x1f440, R.drawable.emoji_facebook_1f440),
      Emoji(0x1f9e0, R.drawable.emoji_facebook_1f9e0),
      Emoji(0x1f9b4, R.drawable.emoji_facebook_1f9b4),
      Emoji(0x1f5e3, R.drawable.emoji_facebook_1f5e3),
      Emoji(0x1f464, R.drawable.emoji_facebook_1f464),
      Emoji(0x1f465, R.drawable.emoji_facebook_1f465),
      Emoji(0x1f476, R.drawable.emoji_facebook_1f476, arrayOf(
        Emoji(intArrayOf(0x1f476, 0x1f3fb), R.drawable.emoji_facebook_1f476_1f3fb),
        Emoji(intArrayOf(0x1f476, 0x1f3fc), R.drawable.emoji_facebook_1f476_1f3fc),
        Emoji(intArrayOf(0x1f476, 0x1f3fd), R.drawable.emoji_facebook_1f476_1f3fd),
        Emoji(intArrayOf(0x1f476, 0x1f3fe), R.drawable.emoji_facebook_1f476_1f3fe),
        Emoji(intArrayOf(0x1f476, 0x1f3ff), R.drawable.emoji_facebook_1f476_1f3ff)
      )),
      Emoji(0x1f467, R.drawable.emoji_facebook_1f467, arrayOf(
        Emoji(intArrayOf(0x1f467, 0x1f3fb), R.drawable.emoji_facebook_1f467_1f3fb),
        Emoji(intArrayOf(0x1f467, 0x1f3fc), R.drawable.emoji_facebook_1f467_1f3fc),
        Emoji(intArrayOf(0x1f467, 0x1f3fd), R.drawable.emoji_facebook_1f467_1f3fd),
        Emoji(intArrayOf(0x1f467, 0x1f3fe), R.drawable.emoji_facebook_1f467_1f3fe),
        Emoji(intArrayOf(0x1f467, 0x1f3ff), R.drawable.emoji_facebook_1f467_1f3ff)
      )),
      Emoji(0x1f9d2, R.drawable.emoji_facebook_1f9d2, arrayOf(
        Emoji(intArrayOf(0x1f9d2, 0x1f3fb), R.drawable.emoji_facebook_1f9d2_1f3fb),
        Emoji(intArrayOf(0x1f9d2, 0x1f3fc), R.drawable.emoji_facebook_1f9d2_1f3fc),
        Emoji(intArrayOf(0x1f9d2, 0x1f3fd), R.drawable.emoji_facebook_1f9d2_1f3fd),
        Emoji(intArrayOf(0x1f9d2, 0x1f3fe), R.drawable.emoji_facebook_1f9d2_1f3fe),
        Emoji(intArrayOf(0x1f9d2, 0x1f3ff), R.drawable.emoji_facebook_1f9d2_1f3ff)
      )),
      Emoji(0x1f466, R.drawable.emoji_facebook_1f466, arrayOf(
        Emoji(intArrayOf(0x1f466, 0x1f3fb), R.drawable.emoji_facebook_1f466_1f3fb),
        Emoji(intArrayOf(0x1f466, 0x1f3fc), R.drawable.emoji_facebook_1f466_1f3fc),
        Emoji(intArrayOf(0x1f466, 0x1f3fd), R.drawable.emoji_facebook_1f466_1f3fd),
        Emoji(intArrayOf(0x1f466, 0x1f3fe), R.drawable.emoji_facebook_1f466_1f3fe),
        Emoji(intArrayOf(0x1f466, 0x1f3ff), R.drawable.emoji_facebook_1f466_1f3ff)
      )),
      Emoji(0x1f469, R.drawable.emoji_facebook_1f469, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3fe), R.drawable.emoji_facebook_1f469_1f3fe),
        Emoji(intArrayOf(0x1f469, 0x1f3ff), R.drawable.emoji_facebook_1f469_1f3ff),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9b1),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9b1),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9b1),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9b1),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9b1),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9b0),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9b0),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9b0),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9b0),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9b0),
        Emoji(intArrayOf(0x1f471, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3ff_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9b3),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9b3),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9b3),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9b3),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9b3),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9b2),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9b2),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9b2),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9b2),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9b2)
      )),
      Emoji(0x1f9d1, R.drawable.emoji_facebook_1f9d1, arrayOf(
        Emoji(intArrayOf(0x1f9d1, 0x1f3fb), R.drawable.emoji_facebook_1f9d1_1f3fb),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fc), R.drawable.emoji_facebook_1f9d1_1f3fc),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fd), R.drawable.emoji_facebook_1f9d1_1f3fd),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fe), R.drawable.emoji_facebook_1f9d1_1f3fe),
        Emoji(intArrayOf(0x1f9d1, 0x1f3ff), R.drawable.emoji_facebook_1f9d1_1f3ff),
        Emoji(intArrayOf(0x1f471, 0x1f3fb), R.drawable.emoji_facebook_1f471_1f3fb),
        Emoji(intArrayOf(0x1f471, 0x1f3fc), R.drawable.emoji_facebook_1f471_1f3fc),
        Emoji(intArrayOf(0x1f471, 0x1f3fd), R.drawable.emoji_facebook_1f471_1f3fd),
        Emoji(intArrayOf(0x1f471, 0x1f3fe), R.drawable.emoji_facebook_1f471_1f3fe),
        Emoji(intArrayOf(0x1f471, 0x1f3ff), R.drawable.emoji_facebook_1f471_1f3ff),
        Emoji(intArrayOf(0x1f9d4, 0x1f3fb), R.drawable.emoji_facebook_1f9d4_1f3fb),
        Emoji(intArrayOf(0x1f9d4, 0x1f3fc), R.drawable.emoji_facebook_1f9d4_1f3fc),
        Emoji(intArrayOf(0x1f9d4, 0x1f3fd), R.drawable.emoji_facebook_1f9d4_1f3fd),
        Emoji(intArrayOf(0x1f9d4, 0x1f3fe), R.drawable.emoji_facebook_1f9d4_1f3fe),
        Emoji(intArrayOf(0x1f9d4, 0x1f3ff), R.drawable.emoji_facebook_1f9d4_1f3ff)
      )),
      Emoji(0x1f468, R.drawable.emoji_facebook_1f468, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f468_1f3fb),
        Emoji(intArrayOf(0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f468_1f3fc),
        Emoji(intArrayOf(0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f468_1f3fd),
        Emoji(intArrayOf(0x1f468, 0x1f3fe), R.drawable.emoji_facebook_1f468_1f3fe),
        Emoji(intArrayOf(0x1f468, 0x1f3ff), R.drawable.emoji_facebook_1f468_1f3ff),
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9b1),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9b1),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9b1),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9b1),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9b1),
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9b0),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9b0),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9b0),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9b0),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9b0),
        Emoji(intArrayOf(0x1f471, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f471, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f471_1f3ff_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9b3),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9b3),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9b3),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9b3),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9b3),
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9b2),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9b2),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9b2),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9b2),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9b2)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f469_200d_1f9b1),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9b1), R.drawable.emoji_facebook_1f468_200d_1f9b1),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f469_200d_1f9b0),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9b0), R.drawable.emoji_facebook_1f468_200d_1f9b0),
      Emoji(intArrayOf(0x1f471, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f471_200d_2640_fe0f),
      Emoji(0x1f471, R.drawable.emoji_facebook_1f471),
      Emoji(intArrayOf(0x1f471, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f471_200d_2642_fe0f),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f469_200d_1f9b3),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9b3), R.drawable.emoji_facebook_1f468_200d_1f9b3),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f469_200d_1f9b2),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9b2), R.drawable.emoji_facebook_1f468_200d_1f9b2),
      Emoji(0x1f9d4, R.drawable.emoji_facebook_1f9d4),
      Emoji(0x1f475, R.drawable.emoji_facebook_1f475, arrayOf(
        Emoji(intArrayOf(0x1f475, 0x1f3fb), R.drawable.emoji_facebook_1f475_1f3fb),
        Emoji(intArrayOf(0x1f475, 0x1f3fc), R.drawable.emoji_facebook_1f475_1f3fc),
        Emoji(intArrayOf(0x1f475, 0x1f3fd), R.drawable.emoji_facebook_1f475_1f3fd),
        Emoji(intArrayOf(0x1f475, 0x1f3fe), R.drawable.emoji_facebook_1f475_1f3fe),
        Emoji(intArrayOf(0x1f475, 0x1f3ff), R.drawable.emoji_facebook_1f475_1f3ff)
      )),
      Emoji(0x1f9d3, R.drawable.emoji_facebook_1f9d3, arrayOf(
        Emoji(intArrayOf(0x1f9d3, 0x1f3fb), R.drawable.emoji_facebook_1f9d3_1f3fb),
        Emoji(intArrayOf(0x1f9d3, 0x1f3fc), R.drawable.emoji_facebook_1f9d3_1f3fc),
        Emoji(intArrayOf(0x1f9d3, 0x1f3fd), R.drawable.emoji_facebook_1f9d3_1f3fd),
        Emoji(intArrayOf(0x1f9d3, 0x1f3fe), R.drawable.emoji_facebook_1f9d3_1f3fe),
        Emoji(intArrayOf(0x1f9d3, 0x1f3ff), R.drawable.emoji_facebook_1f9d3_1f3ff)
      )),
      Emoji(0x1f474, R.drawable.emoji_facebook_1f474, arrayOf(
        Emoji(intArrayOf(0x1f474, 0x1f3fb), R.drawable.emoji_facebook_1f474_1f3fb),
        Emoji(intArrayOf(0x1f474, 0x1f3fc), R.drawable.emoji_facebook_1f474_1f3fc),
        Emoji(intArrayOf(0x1f474, 0x1f3fd), R.drawable.emoji_facebook_1f474_1f3fd),
        Emoji(intArrayOf(0x1f474, 0x1f3fe), R.drawable.emoji_facebook_1f474_1f3fe),
        Emoji(intArrayOf(0x1f474, 0x1f3ff), R.drawable.emoji_facebook_1f474_1f3ff)
      )),
      Emoji(0x1f472, R.drawable.emoji_facebook_1f472, arrayOf(
        Emoji(intArrayOf(0x1f472, 0x1f3fb), R.drawable.emoji_facebook_1f472_1f3fb),
        Emoji(intArrayOf(0x1f472, 0x1f3fc), R.drawable.emoji_facebook_1f472_1f3fc),
        Emoji(intArrayOf(0x1f472, 0x1f3fd), R.drawable.emoji_facebook_1f472_1f3fd),
        Emoji(intArrayOf(0x1f472, 0x1f3fe), R.drawable.emoji_facebook_1f472_1f3fe),
        Emoji(intArrayOf(0x1f472, 0x1f3ff), R.drawable.emoji_facebook_1f472_1f3ff)
      )),
      Emoji(0x1f473, R.drawable.emoji_facebook_1f473, arrayOf(
        Emoji(intArrayOf(0x1f473, 0x1f3fb), R.drawable.emoji_facebook_1f473_1f3fb),
        Emoji(intArrayOf(0x1f473, 0x1f3fc), R.drawable.emoji_facebook_1f473_1f3fc),
        Emoji(intArrayOf(0x1f473, 0x1f3fd), R.drawable.emoji_facebook_1f473_1f3fd),
        Emoji(intArrayOf(0x1f473, 0x1f3fe), R.drawable.emoji_facebook_1f473_1f3fe),
        Emoji(intArrayOf(0x1f473, 0x1f3ff), R.drawable.emoji_facebook_1f473_1f3ff)
      )),
      Emoji(intArrayOf(0x1f473, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f473_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f473, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f473, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f473_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f473, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f473, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f473_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9d5, R.drawable.emoji_facebook_1f9d5, arrayOf(
        Emoji(intArrayOf(0x1f9d5, 0x1f3fb), R.drawable.emoji_facebook_1f9d5_1f3fb),
        Emoji(intArrayOf(0x1f9d5, 0x1f3fc), R.drawable.emoji_facebook_1f9d5_1f3fc),
        Emoji(intArrayOf(0x1f9d5, 0x1f3fd), R.drawable.emoji_facebook_1f9d5_1f3fd),
        Emoji(intArrayOf(0x1f9d5, 0x1f3fe), R.drawable.emoji_facebook_1f9d5_1f3fe),
        Emoji(intArrayOf(0x1f9d5, 0x1f3ff), R.drawable.emoji_facebook_1f9d5_1f3ff)
      )),
      Emoji(0x1f46e, R.drawable.emoji_facebook_1f46e, arrayOf(
        Emoji(intArrayOf(0x1f46e, 0x1f3fb), R.drawable.emoji_facebook_1f46e_1f3fb),
        Emoji(intArrayOf(0x1f46e, 0x1f3fc), R.drawable.emoji_facebook_1f46e_1f3fc),
        Emoji(intArrayOf(0x1f46e, 0x1f3fd), R.drawable.emoji_facebook_1f46e_1f3fd),
        Emoji(intArrayOf(0x1f46e, 0x1f3fe), R.drawable.emoji_facebook_1f46e_1f3fe),
        Emoji(intArrayOf(0x1f46e, 0x1f3ff), R.drawable.emoji_facebook_1f46e_1f3ff)
      )),
      Emoji(intArrayOf(0x1f46e, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46e_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f46e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f46e, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46e_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f46e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f46e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46e_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f477, R.drawable.emoji_facebook_1f477, arrayOf(
        Emoji(intArrayOf(0x1f477, 0x1f3fb), R.drawable.emoji_facebook_1f477_1f3fb),
        Emoji(intArrayOf(0x1f477, 0x1f3fc), R.drawable.emoji_facebook_1f477_1f3fc),
        Emoji(intArrayOf(0x1f477, 0x1f3fd), R.drawable.emoji_facebook_1f477_1f3fd),
        Emoji(intArrayOf(0x1f477, 0x1f3fe), R.drawable.emoji_facebook_1f477_1f3fe),
        Emoji(intArrayOf(0x1f477, 0x1f3ff), R.drawable.emoji_facebook_1f477_1f3ff)
      )),
      Emoji(intArrayOf(0x1f477, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f477_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f477, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f477, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f477_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f477, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f477, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f477_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f482, R.drawable.emoji_facebook_1f482, arrayOf(
        Emoji(intArrayOf(0x1f482, 0x1f3fb), R.drawable.emoji_facebook_1f482_1f3fb),
        Emoji(intArrayOf(0x1f482, 0x1f3fc), R.drawable.emoji_facebook_1f482_1f3fc),
        Emoji(intArrayOf(0x1f482, 0x1f3fd), R.drawable.emoji_facebook_1f482_1f3fd),
        Emoji(intArrayOf(0x1f482, 0x1f3fe), R.drawable.emoji_facebook_1f482_1f3fe),
        Emoji(intArrayOf(0x1f482, 0x1f3ff), R.drawable.emoji_facebook_1f482_1f3ff)
      )),
      Emoji(intArrayOf(0x1f482, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f482_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f482, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f482, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f482_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f482, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f482, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f482_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f575, R.drawable.emoji_facebook_1f575, arrayOf(
        Emoji(intArrayOf(0x1f575, 0x1f3fb), R.drawable.emoji_facebook_1f575_1f3fb),
        Emoji(intArrayOf(0x1f575, 0x1f3fc), R.drawable.emoji_facebook_1f575_1f3fc),
        Emoji(intArrayOf(0x1f575, 0x1f3fd), R.drawable.emoji_facebook_1f575_1f3fd),
        Emoji(intArrayOf(0x1f575, 0x1f3fe), R.drawable.emoji_facebook_1f575_1f3fe),
        Emoji(intArrayOf(0x1f575, 0x1f3ff), R.drawable.emoji_facebook_1f575_1f3ff)
      )),
      Emoji(intArrayOf(0x1f575, 0xfe0f, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f575_fe0f_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f575, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f575, 0xfe0f, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f575_fe0f_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f575, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f575, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f575_1f3ff_200d_2642_fe0f)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f469_200d_2695_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fb_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fc_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fd_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fe_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3ff_200d_2695_fe0f)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f468_200d_2695_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fb_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fc_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fd_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fe_200d_2695_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x2695, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3ff_200d_2695_fe0f)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f469_200d_1f33e, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f33e),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f33e),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f33e),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f33e),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f33e)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f468_200d_1f33e, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f33e),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f33e),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f33e),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f33e),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f33e), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f33e)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f469_200d_1f373, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f373),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f373),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f373),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f373),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f373)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f468_200d_1f373, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f373),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f373),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f373),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f373),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f373), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f373)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f469_200d_1f393, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f393),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f393),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f393),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f393),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f393)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f468_200d_1f393, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f393),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f393),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f393),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f393),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f393), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f393)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f469_200d_1f3a4, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f3a4),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f3a4),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f3a4),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f3a4),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f3a4)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f468_200d_1f3a4, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f3a4),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f3a4),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f3a4),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f3a4),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3a4), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f3a4)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f469_200d_1f3eb, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f3eb),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f3eb),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f3eb),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f3eb),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f3eb)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f468_200d_1f3eb, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f3eb),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f3eb),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f3eb),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f3eb),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3eb), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f3eb)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f469_200d_1f3ed, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f3ed),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f3ed),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f3ed),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f3ed),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f3ed)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f468_200d_1f3ed, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f3ed),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f3ed),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f3ed),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f3ed),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3ed), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f3ed)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f469_200d_1f4bb, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f4bb),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f4bb),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f4bb),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f4bb),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f4bb)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f468_200d_1f4bb, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f4bb),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f4bb),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f4bb),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f4bb),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f4bb), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f4bb)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f469_200d_1f4bc, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f4bc),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f4bc),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f4bc),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f4bc),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f4bc)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f468_200d_1f4bc, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f4bc),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f4bc),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f4bc),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f4bc),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f4bc), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f4bc)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f469_200d_1f527, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f527),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f527),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f527),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f527),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f527)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f468_200d_1f527, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f527),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f527),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f527),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f527),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f527), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f527)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f469_200d_1f52c, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f52c),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f52c),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f52c),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f52c),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f52c)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f468_200d_1f52c, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f52c),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f52c),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f52c),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f52c),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f52c), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f52c)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f469_200d_1f3a8, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f3a8),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f3a8),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f3a8),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f3a8),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f3a8)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f468_200d_1f3a8, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f3a8),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f3a8),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f3a8),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f3a8),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3a8), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f3a8)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f469_200d_1f692, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f692),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f692),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f692),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f692),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f692)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f468_200d_1f692, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f692),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f692),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f692),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f692),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f692), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f692)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f469_200d_2708_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fb_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fc_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fd_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fe_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3ff_200d_2708_fe0f)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f468_200d_2708_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fb_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fc_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fd_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fe_200d_2708_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x2708, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3ff_200d_2708_fe0f)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f469_200d_1f680, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f680),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f680),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f680),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f680),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f680)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f468_200d_1f680, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f680),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f680),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f680),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f680),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f680), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f680)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f469_200d_2696_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fb_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fc_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fd_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3fe_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f469_1f3ff_200d_2696_fe0f)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f468_200d_2696_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fb_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fc_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fd_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3fe_200d_2696_fe0f),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x2696, 0xfe0f), R.drawable.emoji_facebook_1f468_1f3ff_200d_2696_fe0f)
      )),
      Emoji(0x1f470, R.drawable.emoji_facebook_1f470, arrayOf(
        Emoji(intArrayOf(0x1f470, 0x1f3fb), R.drawable.emoji_facebook_1f470_1f3fb),
        Emoji(intArrayOf(0x1f470, 0x1f3fc), R.drawable.emoji_facebook_1f470_1f3fc),
        Emoji(intArrayOf(0x1f470, 0x1f3fd), R.drawable.emoji_facebook_1f470_1f3fd),
        Emoji(intArrayOf(0x1f470, 0x1f3fe), R.drawable.emoji_facebook_1f470_1f3fe),
        Emoji(intArrayOf(0x1f470, 0x1f3ff), R.drawable.emoji_facebook_1f470_1f3ff)
      )),
      Emoji(0x1f935, R.drawable.emoji_facebook_1f935, arrayOf(
        Emoji(intArrayOf(0x1f935, 0x1f3fb), R.drawable.emoji_facebook_1f935_1f3fb),
        Emoji(intArrayOf(0x1f935, 0x1f3fc), R.drawable.emoji_facebook_1f935_1f3fc),
        Emoji(intArrayOf(0x1f935, 0x1f3fd), R.drawable.emoji_facebook_1f935_1f3fd),
        Emoji(intArrayOf(0x1f935, 0x1f3fe), R.drawable.emoji_facebook_1f935_1f3fe),
        Emoji(intArrayOf(0x1f935, 0x1f3ff), R.drawable.emoji_facebook_1f935_1f3ff)
      )),
      Emoji(0x1f478, R.drawable.emoji_facebook_1f478, arrayOf(
        Emoji(intArrayOf(0x1f478, 0x1f3fb), R.drawable.emoji_facebook_1f478_1f3fb),
        Emoji(intArrayOf(0x1f478, 0x1f3fc), R.drawable.emoji_facebook_1f478_1f3fc),
        Emoji(intArrayOf(0x1f478, 0x1f3fd), R.drawable.emoji_facebook_1f478_1f3fd),
        Emoji(intArrayOf(0x1f478, 0x1f3fe), R.drawable.emoji_facebook_1f478_1f3fe),
        Emoji(intArrayOf(0x1f478, 0x1f3ff), R.drawable.emoji_facebook_1f478_1f3ff)
      )),
      Emoji(0x1f934, R.drawable.emoji_facebook_1f934, arrayOf(
        Emoji(intArrayOf(0x1f934, 0x1f3fb), R.drawable.emoji_facebook_1f934_1f3fb),
        Emoji(intArrayOf(0x1f934, 0x1f3fc), R.drawable.emoji_facebook_1f934_1f3fc),
        Emoji(intArrayOf(0x1f934, 0x1f3fd), R.drawable.emoji_facebook_1f934_1f3fd),
        Emoji(intArrayOf(0x1f934, 0x1f3fe), R.drawable.emoji_facebook_1f934_1f3fe),
        Emoji(intArrayOf(0x1f934, 0x1f3ff), R.drawable.emoji_facebook_1f934_1f3ff)
      )),
      Emoji(0x1f9b8, R.drawable.emoji_facebook_1f9b8, arrayOf(
        Emoji(intArrayOf(0x1f9b8, 0x1f3fb), R.drawable.emoji_facebook_1f9b8_1f3fb),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fc), R.drawable.emoji_facebook_1f9b8_1f3fc),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fd), R.drawable.emoji_facebook_1f9b8_1f3fd),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fe), R.drawable.emoji_facebook_1f9b8_1f3fe),
        Emoji(intArrayOf(0x1f9b8, 0x1f3ff), R.drawable.emoji_facebook_1f9b8_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9b8, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b8_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9b8, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9b8, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b8_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9b8, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b8, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b8_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9b9, R.drawable.emoji_facebook_1f9b9, arrayOf(
        Emoji(intArrayOf(0x1f9b9, 0x1f3fb), R.drawable.emoji_facebook_1f9b9_1f3fb),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fc), R.drawable.emoji_facebook_1f9b9_1f3fc),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fd), R.drawable.emoji_facebook_1f9b9_1f3fd),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fe), R.drawable.emoji_facebook_1f9b9_1f3fe),
        Emoji(intArrayOf(0x1f9b9, 0x1f3ff), R.drawable.emoji_facebook_1f9b9_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9b9, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b9_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9b9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9b9, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b9_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9b9, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9b9, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9b9_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f936, R.drawable.emoji_facebook_1f936, arrayOf(
        Emoji(intArrayOf(0x1f936, 0x1f3fb), R.drawable.emoji_facebook_1f936_1f3fb),
        Emoji(intArrayOf(0x1f936, 0x1f3fc), R.drawable.emoji_facebook_1f936_1f3fc),
        Emoji(intArrayOf(0x1f936, 0x1f3fd), R.drawable.emoji_facebook_1f936_1f3fd),
        Emoji(intArrayOf(0x1f936, 0x1f3fe), R.drawable.emoji_facebook_1f936_1f3fe),
        Emoji(intArrayOf(0x1f936, 0x1f3ff), R.drawable.emoji_facebook_1f936_1f3ff)
      )),
      Emoji(0x1f385, R.drawable.emoji_facebook_1f385, arrayOf(
        Emoji(intArrayOf(0x1f385, 0x1f3fb), R.drawable.emoji_facebook_1f385_1f3fb),
        Emoji(intArrayOf(0x1f385, 0x1f3fc), R.drawable.emoji_facebook_1f385_1f3fc),
        Emoji(intArrayOf(0x1f385, 0x1f3fd), R.drawable.emoji_facebook_1f385_1f3fd),
        Emoji(intArrayOf(0x1f385, 0x1f3fe), R.drawable.emoji_facebook_1f385_1f3fe),
        Emoji(intArrayOf(0x1f385, 0x1f3ff), R.drawable.emoji_facebook_1f385_1f3ff)
      )),
      Emoji(0x1f9d9, R.drawable.emoji_facebook_1f9d9, arrayOf(
        Emoji(intArrayOf(0x1f9d9, 0x1f3fb), R.drawable.emoji_facebook_1f9d9_1f3fb),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fc), R.drawable.emoji_facebook_1f9d9_1f3fc),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fd), R.drawable.emoji_facebook_1f9d9_1f3fd),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fe), R.drawable.emoji_facebook_1f9d9_1f3fe),
        Emoji(intArrayOf(0x1f9d9, 0x1f3ff), R.drawable.emoji_facebook_1f9d9_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9d9, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d9_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9d9, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d9_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d9, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d9, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d9_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9dd, R.drawable.emoji_facebook_1f9dd, arrayOf(
        Emoji(intArrayOf(0x1f9dd, 0x1f3fb), R.drawable.emoji_facebook_1f9dd_1f3fb),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fc), R.drawable.emoji_facebook_1f9dd_1f3fc),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fd), R.drawable.emoji_facebook_1f9dd_1f3fd),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fe), R.drawable.emoji_facebook_1f9dd_1f3fe),
        Emoji(intArrayOf(0x1f9dd, 0x1f3ff), R.drawable.emoji_facebook_1f9dd_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9dd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dd_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9dd, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9dd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dd_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9dd, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dd, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dd_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9db, R.drawable.emoji_facebook_1f9db, arrayOf(
        Emoji(intArrayOf(0x1f9db, 0x1f3fb), R.drawable.emoji_facebook_1f9db_1f3fb),
        Emoji(intArrayOf(0x1f9db, 0x1f3fc), R.drawable.emoji_facebook_1f9db_1f3fc),
        Emoji(intArrayOf(0x1f9db, 0x1f3fd), R.drawable.emoji_facebook_1f9db_1f3fd),
        Emoji(intArrayOf(0x1f9db, 0x1f3fe), R.drawable.emoji_facebook_1f9db_1f3fe),
        Emoji(intArrayOf(0x1f9db, 0x1f3ff), R.drawable.emoji_facebook_1f9db_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9db, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9db_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9db, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9db, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9db_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9db, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9db, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9db_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9df, R.drawable.emoji_facebook_1f9df),
      Emoji(intArrayOf(0x1f9df, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9df_200d_2640_fe0f),
      Emoji(intArrayOf(0x1f9df, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9df_200d_2642_fe0f),
      Emoji(0x1f9de, R.drawable.emoji_facebook_1f9de),
      Emoji(intArrayOf(0x1f9de, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9de_200d_2640_fe0f),
      Emoji(intArrayOf(0x1f9de, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9de_200d_2642_fe0f),
      Emoji(0x1f9dc, R.drawable.emoji_facebook_1f9dc, arrayOf(
        Emoji(intArrayOf(0x1f9dc, 0x1f3fb), R.drawable.emoji_facebook_1f9dc_1f3fb),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fc), R.drawable.emoji_facebook_1f9dc_1f3fc),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fd), R.drawable.emoji_facebook_1f9dc_1f3fd),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fe), R.drawable.emoji_facebook_1f9dc_1f3fe),
        Emoji(intArrayOf(0x1f9dc, 0x1f3ff), R.drawable.emoji_facebook_1f9dc_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9dc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dc_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9dc, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9dc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dc_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9dc, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9dc, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9dc_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9da, R.drawable.emoji_facebook_1f9da, arrayOf(
        Emoji(intArrayOf(0x1f9da, 0x1f3fb), R.drawable.emoji_facebook_1f9da_1f3fb),
        Emoji(intArrayOf(0x1f9da, 0x1f3fc), R.drawable.emoji_facebook_1f9da_1f3fc),
        Emoji(intArrayOf(0x1f9da, 0x1f3fd), R.drawable.emoji_facebook_1f9da_1f3fd),
        Emoji(intArrayOf(0x1f9da, 0x1f3fe), R.drawable.emoji_facebook_1f9da_1f3fe),
        Emoji(intArrayOf(0x1f9da, 0x1f3ff), R.drawable.emoji_facebook_1f9da_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9da, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9da_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9da, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9da, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9da_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9da, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9da, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9da_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f47c, R.drawable.emoji_facebook_1f47c, arrayOf(
        Emoji(intArrayOf(0x1f47c, 0x1f3fb), R.drawable.emoji_facebook_1f47c_1f3fb),
        Emoji(intArrayOf(0x1f47c, 0x1f3fc), R.drawable.emoji_facebook_1f47c_1f3fc),
        Emoji(intArrayOf(0x1f47c, 0x1f3fd), R.drawable.emoji_facebook_1f47c_1f3fd),
        Emoji(intArrayOf(0x1f47c, 0x1f3fe), R.drawable.emoji_facebook_1f47c_1f3fe),
        Emoji(intArrayOf(0x1f47c, 0x1f3ff), R.drawable.emoji_facebook_1f47c_1f3ff)
      )),
      Emoji(0x1f930, R.drawable.emoji_facebook_1f930, arrayOf(
        Emoji(intArrayOf(0x1f930, 0x1f3fb), R.drawable.emoji_facebook_1f930_1f3fb),
        Emoji(intArrayOf(0x1f930, 0x1f3fc), R.drawable.emoji_facebook_1f930_1f3fc),
        Emoji(intArrayOf(0x1f930, 0x1f3fd), R.drawable.emoji_facebook_1f930_1f3fd),
        Emoji(intArrayOf(0x1f930, 0x1f3fe), R.drawable.emoji_facebook_1f930_1f3fe),
        Emoji(intArrayOf(0x1f930, 0x1f3ff), R.drawable.emoji_facebook_1f930_1f3ff)
      )),
      Emoji(0x1f931, R.drawable.emoji_facebook_1f931, arrayOf(
        Emoji(intArrayOf(0x1f931, 0x1f3fb), R.drawable.emoji_facebook_1f931_1f3fb),
        Emoji(intArrayOf(0x1f931, 0x1f3fc), R.drawable.emoji_facebook_1f931_1f3fc),
        Emoji(intArrayOf(0x1f931, 0x1f3fd), R.drawable.emoji_facebook_1f931_1f3fd),
        Emoji(intArrayOf(0x1f931, 0x1f3fe), R.drawable.emoji_facebook_1f931_1f3fe),
        Emoji(intArrayOf(0x1f931, 0x1f3ff), R.drawable.emoji_facebook_1f931_1f3ff)
      )),
      Emoji(0x1f647, R.drawable.emoji_facebook_1f647, arrayOf(
        Emoji(intArrayOf(0x1f647, 0x1f3fb), R.drawable.emoji_facebook_1f647_1f3fb),
        Emoji(intArrayOf(0x1f647, 0x1f3fc), R.drawable.emoji_facebook_1f647_1f3fc),
        Emoji(intArrayOf(0x1f647, 0x1f3fd), R.drawable.emoji_facebook_1f647_1f3fd),
        Emoji(intArrayOf(0x1f647, 0x1f3fe), R.drawable.emoji_facebook_1f647_1f3fe),
        Emoji(intArrayOf(0x1f647, 0x1f3ff), R.drawable.emoji_facebook_1f647_1f3ff)
      )),
      Emoji(intArrayOf(0x1f647, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f647_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f647, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f647, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f647_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f647, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f647, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f647_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f481, R.drawable.emoji_facebook_1f481, arrayOf(
        Emoji(intArrayOf(0x1f481, 0x1f3fb), R.drawable.emoji_facebook_1f481_1f3fb),
        Emoji(intArrayOf(0x1f481, 0x1f3fc), R.drawable.emoji_facebook_1f481_1f3fc),
        Emoji(intArrayOf(0x1f481, 0x1f3fd), R.drawable.emoji_facebook_1f481_1f3fd),
        Emoji(intArrayOf(0x1f481, 0x1f3fe), R.drawable.emoji_facebook_1f481_1f3fe),
        Emoji(intArrayOf(0x1f481, 0x1f3ff), R.drawable.emoji_facebook_1f481_1f3ff)
      )),
      Emoji(intArrayOf(0x1f481, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f481_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f481, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f481, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f481_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f481, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f481, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f481_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f645, R.drawable.emoji_facebook_1f645, arrayOf(
        Emoji(intArrayOf(0x1f645, 0x1f3fb), R.drawable.emoji_facebook_1f645_1f3fb),
        Emoji(intArrayOf(0x1f645, 0x1f3fc), R.drawable.emoji_facebook_1f645_1f3fc),
        Emoji(intArrayOf(0x1f645, 0x1f3fd), R.drawable.emoji_facebook_1f645_1f3fd),
        Emoji(intArrayOf(0x1f645, 0x1f3fe), R.drawable.emoji_facebook_1f645_1f3fe),
        Emoji(intArrayOf(0x1f645, 0x1f3ff), R.drawable.emoji_facebook_1f645_1f3ff)
      )),
      Emoji(intArrayOf(0x1f645, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f645_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f645, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f645, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f645_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f645, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f645, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f645_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f646, R.drawable.emoji_facebook_1f646, arrayOf(
        Emoji(intArrayOf(0x1f646, 0x1f3fb), R.drawable.emoji_facebook_1f646_1f3fb),
        Emoji(intArrayOf(0x1f646, 0x1f3fc), R.drawable.emoji_facebook_1f646_1f3fc),
        Emoji(intArrayOf(0x1f646, 0x1f3fd), R.drawable.emoji_facebook_1f646_1f3fd),
        Emoji(intArrayOf(0x1f646, 0x1f3fe), R.drawable.emoji_facebook_1f646_1f3fe),
        Emoji(intArrayOf(0x1f646, 0x1f3ff), R.drawable.emoji_facebook_1f646_1f3ff)
      )),
      Emoji(intArrayOf(0x1f646, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f646_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f646, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f646, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f646_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f646, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f646, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f646_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f64b, R.drawable.emoji_facebook_1f64b, arrayOf(
        Emoji(intArrayOf(0x1f64b, 0x1f3fb), R.drawable.emoji_facebook_1f64b_1f3fb),
        Emoji(intArrayOf(0x1f64b, 0x1f3fc), R.drawable.emoji_facebook_1f64b_1f3fc),
        Emoji(intArrayOf(0x1f64b, 0x1f3fd), R.drawable.emoji_facebook_1f64b_1f3fd),
        Emoji(intArrayOf(0x1f64b, 0x1f3fe), R.drawable.emoji_facebook_1f64b_1f3fe),
        Emoji(intArrayOf(0x1f64b, 0x1f3ff), R.drawable.emoji_facebook_1f64b_1f3ff)
      )),
      Emoji(intArrayOf(0x1f64b, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64b_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f64b, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f64b, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64b_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f64b, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64b, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64b_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9cf, R.drawable.emoji_facebook_1f9cf, arrayOf(
        Emoji(intArrayOf(0x1f9cf, 0x1f3fb), R.drawable.emoji_facebook_1f9cf_1f3fb),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fc), R.drawable.emoji_facebook_1f9cf_1f3fc),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fd), R.drawable.emoji_facebook_1f9cf_1f3fd),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fe), R.drawable.emoji_facebook_1f9cf_1f3fe),
        Emoji(intArrayOf(0x1f9cf, 0x1f3ff), R.drawable.emoji_facebook_1f9cf_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9cf, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cf_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9cf, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9cf, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cf_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9cf, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cf, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cf_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f926, R.drawable.emoji_facebook_1f926, arrayOf(
        Emoji(intArrayOf(0x1f926, 0x1f3fb), R.drawable.emoji_facebook_1f926_1f3fb),
        Emoji(intArrayOf(0x1f926, 0x1f3fc), R.drawable.emoji_facebook_1f926_1f3fc),
        Emoji(intArrayOf(0x1f926, 0x1f3fd), R.drawable.emoji_facebook_1f926_1f3fd),
        Emoji(intArrayOf(0x1f926, 0x1f3fe), R.drawable.emoji_facebook_1f926_1f3fe),
        Emoji(intArrayOf(0x1f926, 0x1f3ff), R.drawable.emoji_facebook_1f926_1f3ff)
      )),
      Emoji(intArrayOf(0x1f926, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f926_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f926, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f926, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f926_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f926, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f926, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f926_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f937, R.drawable.emoji_facebook_1f937, arrayOf(
        Emoji(intArrayOf(0x1f937, 0x1f3fb), R.drawable.emoji_facebook_1f937_1f3fb),
        Emoji(intArrayOf(0x1f937, 0x1f3fc), R.drawable.emoji_facebook_1f937_1f3fc),
        Emoji(intArrayOf(0x1f937, 0x1f3fd), R.drawable.emoji_facebook_1f937_1f3fd),
        Emoji(intArrayOf(0x1f937, 0x1f3fe), R.drawable.emoji_facebook_1f937_1f3fe),
        Emoji(intArrayOf(0x1f937, 0x1f3ff), R.drawable.emoji_facebook_1f937_1f3ff)
      )),
      Emoji(intArrayOf(0x1f937, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f937_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f937, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f937, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f937_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f937, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f937, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f937_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f64e, R.drawable.emoji_facebook_1f64e, arrayOf(
        Emoji(intArrayOf(0x1f64e, 0x1f3fb), R.drawable.emoji_facebook_1f64e_1f3fb),
        Emoji(intArrayOf(0x1f64e, 0x1f3fc), R.drawable.emoji_facebook_1f64e_1f3fc),
        Emoji(intArrayOf(0x1f64e, 0x1f3fd), R.drawable.emoji_facebook_1f64e_1f3fd),
        Emoji(intArrayOf(0x1f64e, 0x1f3fe), R.drawable.emoji_facebook_1f64e_1f3fe),
        Emoji(intArrayOf(0x1f64e, 0x1f3ff), R.drawable.emoji_facebook_1f64e_1f3ff)
      )),
      Emoji(intArrayOf(0x1f64e, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64e_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f64e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f64e, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64e_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f64e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64e_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f64d, R.drawable.emoji_facebook_1f64d, arrayOf(
        Emoji(intArrayOf(0x1f64d, 0x1f3fb), R.drawable.emoji_facebook_1f64d_1f3fb),
        Emoji(intArrayOf(0x1f64d, 0x1f3fc), R.drawable.emoji_facebook_1f64d_1f3fc),
        Emoji(intArrayOf(0x1f64d, 0x1f3fd), R.drawable.emoji_facebook_1f64d_1f3fd),
        Emoji(intArrayOf(0x1f64d, 0x1f3fe), R.drawable.emoji_facebook_1f64d_1f3fe),
        Emoji(intArrayOf(0x1f64d, 0x1f3ff), R.drawable.emoji_facebook_1f64d_1f3ff)
      )),
      Emoji(intArrayOf(0x1f64d, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64d_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f64d, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f64d, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64d_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f64d, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f64d, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f64d_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f487, R.drawable.emoji_facebook_1f487, arrayOf(
        Emoji(intArrayOf(0x1f487, 0x1f3fb), R.drawable.emoji_facebook_1f487_1f3fb),
        Emoji(intArrayOf(0x1f487, 0x1f3fc), R.drawable.emoji_facebook_1f487_1f3fc),
        Emoji(intArrayOf(0x1f487, 0x1f3fd), R.drawable.emoji_facebook_1f487_1f3fd),
        Emoji(intArrayOf(0x1f487, 0x1f3fe), R.drawable.emoji_facebook_1f487_1f3fe),
        Emoji(intArrayOf(0x1f487, 0x1f3ff), R.drawable.emoji_facebook_1f487_1f3ff)
      )),
      Emoji(intArrayOf(0x1f487, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f487_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f487, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f487, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f487_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f487, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f487, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f487_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f486, R.drawable.emoji_facebook_1f486, arrayOf(
        Emoji(intArrayOf(0x1f486, 0x1f3fb), R.drawable.emoji_facebook_1f486_1f3fb),
        Emoji(intArrayOf(0x1f486, 0x1f3fc), R.drawable.emoji_facebook_1f486_1f3fc),
        Emoji(intArrayOf(0x1f486, 0x1f3fd), R.drawable.emoji_facebook_1f486_1f3fd),
        Emoji(intArrayOf(0x1f486, 0x1f3fe), R.drawable.emoji_facebook_1f486_1f3fe),
        Emoji(intArrayOf(0x1f486, 0x1f3ff), R.drawable.emoji_facebook_1f486_1f3ff)
      )),
      Emoji(intArrayOf(0x1f486, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f486_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f486, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f486, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f486_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f486, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f486, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f486_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9d6, R.drawable.emoji_facebook_1f9d6, arrayOf(
        Emoji(intArrayOf(0x1f9d6, 0x1f3fb), R.drawable.emoji_facebook_1f9d6_1f3fb),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fc), R.drawable.emoji_facebook_1f9d6_1f3fc),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fd), R.drawable.emoji_facebook_1f9d6_1f3fd),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fe), R.drawable.emoji_facebook_1f9d6_1f3fe),
        Emoji(intArrayOf(0x1f9d6, 0x1f3ff), R.drawable.emoji_facebook_1f9d6_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9d6, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d6_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d6, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9d6, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d6_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9d6, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9d6, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9d6_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f485, R.drawable.emoji_facebook_1f485, arrayOf(
        Emoji(intArrayOf(0x1f485, 0x1f3fb), R.drawable.emoji_facebook_1f485_1f3fb),
        Emoji(intArrayOf(0x1f485, 0x1f3fc), R.drawable.emoji_facebook_1f485_1f3fc),
        Emoji(intArrayOf(0x1f485, 0x1f3fd), R.drawable.emoji_facebook_1f485_1f3fd),
        Emoji(intArrayOf(0x1f485, 0x1f3fe), R.drawable.emoji_facebook_1f485_1f3fe),
        Emoji(intArrayOf(0x1f485, 0x1f3ff), R.drawable.emoji_facebook_1f485_1f3ff)
      )),
      Emoji(0x1f933, R.drawable.emoji_facebook_1f933, arrayOf(
        Emoji(intArrayOf(0x1f933, 0x1f3fb), R.drawable.emoji_facebook_1f933_1f3fb),
        Emoji(intArrayOf(0x1f933, 0x1f3fc), R.drawable.emoji_facebook_1f933_1f3fc),
        Emoji(intArrayOf(0x1f933, 0x1f3fd), R.drawable.emoji_facebook_1f933_1f3fd),
        Emoji(intArrayOf(0x1f933, 0x1f3fe), R.drawable.emoji_facebook_1f933_1f3fe),
        Emoji(intArrayOf(0x1f933, 0x1f3ff), R.drawable.emoji_facebook_1f933_1f3ff)
      )),
      Emoji(0x1f483, R.drawable.emoji_facebook_1f483, arrayOf(
        Emoji(intArrayOf(0x1f483, 0x1f3fb), R.drawable.emoji_facebook_1f483_1f3fb),
        Emoji(intArrayOf(0x1f483, 0x1f3fc), R.drawable.emoji_facebook_1f483_1f3fc),
        Emoji(intArrayOf(0x1f483, 0x1f3fd), R.drawable.emoji_facebook_1f483_1f3fd),
        Emoji(intArrayOf(0x1f483, 0x1f3fe), R.drawable.emoji_facebook_1f483_1f3fe),
        Emoji(intArrayOf(0x1f483, 0x1f3ff), R.drawable.emoji_facebook_1f483_1f3ff)
      )),
      Emoji(0x1f57a, R.drawable.emoji_facebook_1f57a, arrayOf(
        Emoji(intArrayOf(0x1f57a, 0x1f3fb), R.drawable.emoji_facebook_1f57a_1f3fb),
        Emoji(intArrayOf(0x1f57a, 0x1f3fc), R.drawable.emoji_facebook_1f57a_1f3fc),
        Emoji(intArrayOf(0x1f57a, 0x1f3fd), R.drawable.emoji_facebook_1f57a_1f3fd),
        Emoji(intArrayOf(0x1f57a, 0x1f3ff), R.drawable.emoji_facebook_1f57a_1f3ff),
        Emoji(intArrayOf(0x1f57a, 0x1f3fe), R.drawable.emoji_facebook_1f57a_1f3fe)
      )),
      Emoji(0x1f46f, R.drawable.emoji_facebook_1f46f),
      Emoji(intArrayOf(0x1f46f, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f46f_200d_2640_fe0f),
      Emoji(intArrayOf(0x1f46f, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f46f_200d_2642_fe0f),
      Emoji(0x1f574, R.drawable.emoji_facebook_1f574, arrayOf(
        Emoji(intArrayOf(0x1f574, 0x1f3fb), R.drawable.emoji_facebook_1f574_1f3fb),
        Emoji(intArrayOf(0x1f574, 0x1f3fc), R.drawable.emoji_facebook_1f574_1f3fc),
        Emoji(intArrayOf(0x1f574, 0x1f3fd), R.drawable.emoji_facebook_1f574_1f3fd),
        Emoji(intArrayOf(0x1f574, 0x1f3fe), R.drawable.emoji_facebook_1f574_1f3fe),
        Emoji(intArrayOf(0x1f574, 0x1f3ff), R.drawable.emoji_facebook_1f574_1f3ff)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f469_200d_1f9bd, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9bd),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9bd),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9bd),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9bd),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9bd)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f468_200d_1f9bd, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9bd),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9bd),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9bd),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9bd),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9bd), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9bd)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f469_200d_1f9bc, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9bc),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9bc),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9bc),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9bc),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9bc)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f468_200d_1f9bc, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9bc),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9bc),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9bc),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9bc),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9bc), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9bc)
      )),
      Emoji(0x1f6b6, R.drawable.emoji_facebook_1f6b6, arrayOf(
        Emoji(intArrayOf(0x1f6b6, 0x1f3fb), R.drawable.emoji_facebook_1f6b6_1f3fb),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fc), R.drawable.emoji_facebook_1f6b6_1f3fc),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fd), R.drawable.emoji_facebook_1f6b6_1f3fd),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fe), R.drawable.emoji_facebook_1f6b6_1f3fe),
        Emoji(intArrayOf(0x1f6b6, 0x1f3ff), R.drawable.emoji_facebook_1f6b6_1f3ff)
      )),
      Emoji(intArrayOf(0x1f6b6, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b6_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6b6, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f6b6, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b6_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f6b6, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f6b6, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f6b6_1f3ff_200d_2642_fe0f)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f469_200d_1f9af, arrayOf(
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f9af),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f9af),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f9af),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f9af),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f9af)
      )),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f468_200d_1f9af, arrayOf(
        Emoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f468_1f3fb_200d_1f9af),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f9af),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f9af),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f9af),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9af), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f9af)
      )),
      Emoji(0x1f9ce, R.drawable.emoji_facebook_1f9ce, arrayOf(
        Emoji(intArrayOf(0x1f9ce, 0x1f3fb), R.drawable.emoji_facebook_1f9ce_1f3fb),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fc), R.drawable.emoji_facebook_1f9ce_1f3fc),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fd), R.drawable.emoji_facebook_1f9ce_1f3fd),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fe), R.drawable.emoji_facebook_1f9ce_1f3fe),
        Emoji(intArrayOf(0x1f9ce, 0x1f3ff), R.drawable.emoji_facebook_1f9ce_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9ce, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9ce_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9ce, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9ce, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9ce_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9ce, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9ce, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9ce_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f3c3, R.drawable.emoji_facebook_1f3c3, arrayOf(
        Emoji(intArrayOf(0x1f3c3, 0x1f3fb), R.drawable.emoji_facebook_1f3c3_1f3fb),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fc), R.drawable.emoji_facebook_1f3c3_1f3fc),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fd), R.drawable.emoji_facebook_1f3c3_1f3fd),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fe), R.drawable.emoji_facebook_1f3c3_1f3fe),
        Emoji(intArrayOf(0x1f3c3, 0x1f3ff), R.drawable.emoji_facebook_1f3c3_1f3ff)
      )),
      Emoji(intArrayOf(0x1f3c3, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c3_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3c3, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f3c3, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c3_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f3c3, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f3c3, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f3c3_1f3ff_200d_2642_fe0f)
      )),
      Emoji(0x1f9cd, R.drawable.emoji_facebook_1f9cd, arrayOf(
        Emoji(intArrayOf(0x1f9cd, 0x1f3fb), R.drawable.emoji_facebook_1f9cd_1f3fb),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fc), R.drawable.emoji_facebook_1f9cd_1f3fc),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fd), R.drawable.emoji_facebook_1f9cd_1f3fd),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fe), R.drawable.emoji_facebook_1f9cd_1f3fe),
        Emoji(intArrayOf(0x1f9cd, 0x1f3ff), R.drawable.emoji_facebook_1f9cd_1f3ff)
      )),
      Emoji(intArrayOf(0x1f9cd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cd_200d_2640_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9cd, 0x1f3fb, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fb_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fc, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fc_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fd, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fd_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fe, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fe_200d_2640_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3ff, 0x200d, 0x2640, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3ff_200d_2640_fe0f)
      )),
      Emoji(intArrayOf(0x1f9cd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cd_200d_2642_fe0f, arrayOf(
        Emoji(intArrayOf(0x1f9cd, 0x1f3fb, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fb_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fc, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fc_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fd, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fd_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3fe, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3fe_200d_2642_fe0f),
        Emoji(intArrayOf(0x1f9cd, 0x1f3ff, 0x200d, 0x2642, 0xfe0f), R.drawable.emoji_facebook_1f9cd_1f3ff_200d_2642_fe0f)
      )),
      Emoji(intArrayOf(0x1f9d1, 0x200d, 0x1f91d, 0x200d, 0x1f9d1), R.drawable.emoji_facebook_1f9d1_200d_1f91d_200d_1f9d1, arrayOf(
        Emoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb), R.drawable.emoji_facebook_1f9d1_1f3fb_200d_1f91d_200d_1f9d1_1f3fb),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb), R.drawable.emoji_facebook_1f9d1_1f3fc_200d_1f91d_200d_1f9d1_1f3fb),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc), R.drawable.emoji_facebook_1f9d1_1f3fc_200d_1f91d_200d_1f9d1_1f3fc),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb), R.drawable.emoji_facebook_1f9d1_1f3fd_200d_1f91d_200d_1f9d1_1f3fb),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc), R.drawable.emoji_facebook_1f9d1_1f3fd_200d_1f91d_200d_1f9d1_1f3fc),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd), R.drawable.emoji_facebook_1f9d1_1f3fd_200d_1f91d_200d_1f9d1_1f3fd),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb), R.drawable.emoji_facebook_1f9d1_1f3fe_200d_1f91d_200d_1f9d1_1f3fb),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc), R.drawable.emoji_facebook_1f9d1_1f3fe_200d_1f91d_200d_1f9d1_1f3fc),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd), R.drawable.emoji_facebook_1f9d1_1f3fe_200d_1f91d_200d_1f9d1_1f3fd),
        Emoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe), R.drawable.emoji_facebook_1f9d1_1f3fe_200d_1f91d_200d_1f9d1_1f3fe),
        Emoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb), R.drawable.emoji_facebook_1f9d1_1f3ff_200d_1f91d_200d_1f9d1_1f3fb),
        Emoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc), R.drawable.emoji_facebook_1f9d1_1f3ff_200d_1f91d_200d_1f9d1_1f3fc),
        Emoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd), R.drawable.emoji_facebook_1f9d1_1f3ff_200d_1f91d_200d_1f9d1_1f3fd),
        Emoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe), R.drawable.emoji_facebook_1f9d1_1f3ff_200d_1f91d_200d_1f9d1_1f3fe),
        Emoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3ff), R.drawable.emoji_facebook_1f9d1_1f3ff_200d_1f91d_200d_1f9d1_1f3ff)
      )),
      Emoji(0x1f46b, R.drawable.emoji_facebook_1f46b, arrayOf(
        Emoji(intArrayOf(0x1f46b, 0x1f3fb), R.drawable.emoji_facebook_1f46b_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f91d_200d_1f468_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f91d_200d_1f468_1f3fe),
        Emoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff), R.drawable.emoji_facebook_1f469_1f3fb_200d_1f91d_200d_1f468_1f3ff),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f46b, 0x1f3fc), R.drawable.emoji_facebook_1f46b_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f91d_200d_1f468_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f91d_200d_1f468_1f3fe),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f91d_200d_1f468_1f3ff),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f46b, 0x1f3fd), R.drawable.emoji_facebook_1f46b_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f91d_200d_1f468_1f3fe),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f91d_200d_1f468_1f3ff),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f468_1f3fd),
        Emoji(intArrayOf(0x1f46b, 0x1f3fe), R.drawable.emoji_facebook_1f46b_1f3fe),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f468_1f3ff),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f468_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f468_1f3fe),
        Emoji(intArrayOf(0x1f46b, 0x1f3ff), R.drawable.emoji_facebook_1f46b_1f3ff)
      )),
      Emoji(0x1f46d, R.drawable.emoji_facebook_1f46d, arrayOf(
        Emoji(intArrayOf(0x1f46d, 0x1f3fb), R.drawable.emoji_facebook_1f46d_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fc_200d_1f91d_200d_1f469_1f3fb),
        Emoji(intArrayOf(0x1f46d, 0x1f3fc), R.drawable.emoji_facebook_1f46d_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f91d_200d_1f469_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3fd_200d_1f91d_200d_1f469_1f3fc),
        Emoji(intArrayOf(0x1f46d, 0x1f3fd), R.drawable.emoji_facebook_1f46d_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f469_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f469_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3fe_200d_1f91d_200d_1f469_1f3fd),
        Emoji(intArrayOf(0x1f46d, 0x1f3fe), R.drawable.emoji_facebook_1f46d_1f3fe),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f469_1f3fb),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f469_1f3fc),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fd), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f469_1f3fd),
        Emoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fe), R.drawable.emoji_facebook_1f469_1f3ff_200d_1f91d_200d_1f469_1f3fe),
        Emoji(intArrayOf(0x1f46d, 0x1f3ff), R.drawable.emoji_facebook_1f46d_1f3ff)
      )),
      Emoji(0x1f46c, R.drawable.emoji_facebook_1f46c, arrayOf(
        Emoji(intArrayOf(0x1f46c, 0x1f3fb), R.drawable.emoji_facebook_1f46c_1f3fb),
        Emoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f468_1f3fc_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f46c, 0x1f3fc), R.drawable.emoji_facebook_1f46c_1f3fc),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f468_1f3fd_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f46c, 0x1f3fd), R.drawable.emoji_facebook_1f46c_1f3fd),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f468_1f3fe_200d_1f91d_200d_1f468_1f3fd),
        Emoji(intArrayOf(0x1f46c, 0x1f3fe), R.drawable.emoji_facebook_1f46c_1f3fe),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f91d_200d_1f468_1f3fb),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f91d_200d_1f468_1f3fc),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f91d_200d_1f468_1f3fd),
        Emoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe), R.drawable.emoji_facebook_1f468_1f3ff_200d_1f91d_200d_1f468_1f3fe),
        Emoji(intArrayOf(0x1f46c, 0x1f3ff), R.drawable.emoji_facebook_1f46c_1f3ff)
      )),
      Emoji(0x1f491, R.drawable.emoji_facebook_1f491, arrayOf(
        Emoji(intArrayOf(0x1f491, 0x1f3fb), R.drawable.emoji_facebook_1f491_1f3fb),
        Emoji(intArrayOf(0x1f491, 0x1f3fc), R.drawable.emoji_facebook_1f491_1f3fc),
        Emoji(intArrayOf(0x1f491, 0x1f3fd), R.drawable.emoji_facebook_1f491_1f3fd),
        Emoji(intArrayOf(0x1f491, 0x1f3fe), R.drawable.emoji_facebook_1f491_1f3fe),
        Emoji(intArrayOf(0x1f491, 0x1f3ff), R.drawable.emoji_facebook_1f491_1f3ff)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f468), R.drawable.emoji_facebook_1f469_200d_2764_fe0f_200d_1f468),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f469), R.drawable.emoji_facebook_1f469_200d_2764_fe0f_200d_1f469),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f468), R.drawable.emoji_facebook_1f468_200d_2764_fe0f_200d_1f468),
      Emoji(0x1f48f, R.drawable.emoji_facebook_1f48f, arrayOf(
        Emoji(intArrayOf(0x1f48f, 0x1f3fb), R.drawable.emoji_facebook_1f48f_1f3fb),
        Emoji(intArrayOf(0x1f48f, 0x1f3fc), R.drawable.emoji_facebook_1f48f_1f3fc),
        Emoji(intArrayOf(0x1f48f, 0x1f3fd), R.drawable.emoji_facebook_1f48f_1f3fd),
        Emoji(intArrayOf(0x1f48f, 0x1f3fe), R.drawable.emoji_facebook_1f48f_1f3fe),
        Emoji(intArrayOf(0x1f48f, 0x1f3ff), R.drawable.emoji_facebook_1f48f_1f3ff)
      )),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f468), R.drawable.emoji_facebook_1f469_200d_2764_fe0f_200d_1f48b_200d_1f468),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f469), R.drawable.emoji_facebook_1f469_200d_2764_fe0f_200d_1f48b_200d_1f469),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f468), R.drawable.emoji_facebook_1f468_200d_2764_fe0f_200d_1f48b_200d_1f468),
      Emoji(0x1f46a, R.drawable.emoji_facebook_1f46a),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f469_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f468_200d_1f469_200d_1f467),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f469_200d_1f467_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f469_200d_1f466_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f468_200d_1f469_200d_1f467_200d_1f467),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f469_200d_1f469_200d_1f466),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f469_200d_1f469_200d_1f467),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f469_200d_1f469_200d_1f467_200d_1f466),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f469_200d_1f469_200d_1f466_200d_1f466),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f469_200d_1f469_200d_1f467_200d_1f467),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f468_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f468_200d_1f468_200d_1f467),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f468_200d_1f467_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f466, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f468_200d_1f466_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f468_200d_1f468_200d_1f467_200d_1f467),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f469_200d_1f466),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f469_200d_1f467),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f469_200d_1f467_200d_1f466),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f469_200d_1f466_200d_1f466),
      Emoji(intArrayOf(0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f469_200d_1f467_200d_1f467),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f468_200d_1f467),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f467_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f466, 0x200d, 0x1f466), R.drawable.emoji_facebook_1f468_200d_1f466_200d_1f466),
      Emoji(intArrayOf(0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f467), R.drawable.emoji_facebook_1f468_200d_1f467_200d_1f467),
      Emoji(0x1f9f6, R.drawable.emoji_facebook_1f9f6),
      Emoji(0x1f9f5, R.drawable.emoji_facebook_1f9f5),
      Emoji(0x1f9e5, R.drawable.emoji_facebook_1f9e5),
      Emoji(0x1f97c, R.drawable.emoji_facebook_1f97c),
      Emoji(0x1f9ba, R.drawable.emoji_facebook_1f9ba),
      Emoji(0x1f45a, R.drawable.emoji_facebook_1f45a),
      Emoji(0x1f455, R.drawable.emoji_facebook_1f455),
      Emoji(0x1f456, R.drawable.emoji_facebook_1f456),
      Emoji(0x1fa72, R.drawable.emoji_facebook_1fa72),
      Emoji(0x1fa73, R.drawable.emoji_facebook_1fa73),
      Emoji(0x1f454, R.drawable.emoji_facebook_1f454),
      Emoji(0x1f457, R.drawable.emoji_facebook_1f457),
      Emoji(0x1f459, R.drawable.emoji_facebook_1f459),
      Emoji(0x1fa71, R.drawable.emoji_facebook_1fa71),
      Emoji(0x1f458, R.drawable.emoji_facebook_1f458),
      Emoji(0x1f97b, R.drawable.emoji_facebook_1f97b),
      Emoji(0x1f97f, R.drawable.emoji_facebook_1f97f),
      Emoji(0x1f460, R.drawable.emoji_facebook_1f460),
      Emoji(0x1f461, R.drawable.emoji_facebook_1f461),
      Emoji(0x1f462, R.drawable.emoji_facebook_1f462),
      Emoji(0x1f45e, R.drawable.emoji_facebook_1f45e),
      Emoji(0x1f45f, R.drawable.emoji_facebook_1f45f),
      Emoji(0x1f97e, R.drawable.emoji_facebook_1f97e),
      Emoji(0x1f9e6, R.drawable.emoji_facebook_1f9e6),
      Emoji(0x1f9e4, R.drawable.emoji_facebook_1f9e4),
      Emoji(0x1f9e3, R.drawable.emoji_facebook_1f9e3),
      Emoji(0x1f3a9, R.drawable.emoji_facebook_1f3a9),
      Emoji(0x1f9e2, R.drawable.emoji_facebook_1f9e2),
      Emoji(0x1f452, R.drawable.emoji_facebook_1f452),
      Emoji(0x1f393, R.drawable.emoji_facebook_1f393),
      Emoji(0x26d1, R.drawable.emoji_facebook_26d1),
      Emoji(0x1f451, R.drawable.emoji_facebook_1f451),
      Emoji(0x1f48d, R.drawable.emoji_facebook_1f48d),
      Emoji(0x1f45d, R.drawable.emoji_facebook_1f45d),
      Emoji(0x1f45b, R.drawable.emoji_facebook_1f45b),
      Emoji(0x1f45c, R.drawable.emoji_facebook_1f45c),
      Emoji(0x1f4bc, R.drawable.emoji_facebook_1f4bc),
      Emoji(0x1f392, R.drawable.emoji_facebook_1f392),
      Emoji(0x1f9f3, R.drawable.emoji_facebook_1f9f3),
      Emoji(0x1f453, R.drawable.emoji_facebook_1f453),
      Emoji(0x1f576, R.drawable.emoji_facebook_1f576),
      Emoji(0x1f97d, R.drawable.emoji_facebook_1f97d),
      Emoji(0x1f302, R.drawable.emoji_facebook_1f302)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_facebook_category_people
}
