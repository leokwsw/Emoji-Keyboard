package dev.leonardpark.emoji.googlecompat.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.googlecompat.GoogleCompatEmoji
import dev.leonardpark.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class PeopleCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      GoogleCompatEmoji(0x1f600),
      GoogleCompatEmoji(0x1f603),
      GoogleCompatEmoji(0x1f604),
      GoogleCompatEmoji(0x1f601),
      GoogleCompatEmoji(0x1f606),
      GoogleCompatEmoji(0x1f605),
      GoogleCompatEmoji(0x1f602),
      GoogleCompatEmoji(0x1f923),
      GoogleCompatEmoji(0x263a),
      GoogleCompatEmoji(0x1f60a),
      GoogleCompatEmoji(0x1f607),
      GoogleCompatEmoji(0x1f642),
      GoogleCompatEmoji(0x1f643),
      GoogleCompatEmoji(0x1f609),
      GoogleCompatEmoji(0x1f60c),
      GoogleCompatEmoji(0x1f972),
      GoogleCompatEmoji(0x1f60d),
      GoogleCompatEmoji(0x1f970),
      GoogleCompatEmoji(0x1f618),
      GoogleCompatEmoji(0x1f617),
      GoogleCompatEmoji(0x1f619),
      GoogleCompatEmoji(0x1f61a),
      GoogleCompatEmoji(0x1f60b),
      GoogleCompatEmoji(0x1f61b),
      GoogleCompatEmoji(0x1f61d),
      GoogleCompatEmoji(0x1f61c),
      GoogleCompatEmoji(0x1f92a),
      GoogleCompatEmoji(0x1f928),
      GoogleCompatEmoji(0x1f9d0),
      GoogleCompatEmoji(0x1f913),
      GoogleCompatEmoji(0x1f60e),
      GoogleCompatEmoji(0x1f929),
      GoogleCompatEmoji(0x1f973),
      GoogleCompatEmoji(0x1f60f),
      GoogleCompatEmoji(0x1f612),
      GoogleCompatEmoji(0x1f61e),
      GoogleCompatEmoji(0x1f614),
      GoogleCompatEmoji(0x1f61f),
      GoogleCompatEmoji(0x1f615),
      GoogleCompatEmoji(0x1f641),
      GoogleCompatEmoji(0x2639),
      GoogleCompatEmoji(0x1f623),
      GoogleCompatEmoji(0x1f616),
      GoogleCompatEmoji(0x1f62b),
      GoogleCompatEmoji(0x1f629),
      GoogleCompatEmoji(0x1f97a),
      GoogleCompatEmoji(0x1f622),
      GoogleCompatEmoji(0x1f62d),
      GoogleCompatEmoji(0x1f624),
      GoogleCompatEmoji(0x1f620),
      GoogleCompatEmoji(0x1f621),
      GoogleCompatEmoji(0x1f92c),
      GoogleCompatEmoji(0x1f92f),
      GoogleCompatEmoji(0x1f633),
      GoogleCompatEmoji(0x1f975),
      GoogleCompatEmoji(0x1f976),
      GoogleCompatEmoji(0x1f631),
      GoogleCompatEmoji(0x1f628),
      GoogleCompatEmoji(0x1f630),
      GoogleCompatEmoji(0x1f625),
      GoogleCompatEmoji(0x1f613),
      GoogleCompatEmoji(0x1f917),
      GoogleCompatEmoji(0x1f914),
      GoogleCompatEmoji(0x1f92d),
      GoogleCompatEmoji(0x1f971),
      GoogleCompatEmoji(0x1f92b),
      GoogleCompatEmoji(0x1f925),
      GoogleCompatEmoji(0x1f636),
      GoogleCompatEmoji(0x1f610),
      GoogleCompatEmoji(0x1f611),
      GoogleCompatEmoji(0x1f62c),
      GoogleCompatEmoji(0x1f644),
      GoogleCompatEmoji(0x1f62f),
      GoogleCompatEmoji(0x1f626),
      GoogleCompatEmoji(0x1f627),
      GoogleCompatEmoji(0x1f62e),
      GoogleCompatEmoji(0x1f632),
      GoogleCompatEmoji(0x1f634),
      GoogleCompatEmoji(0x1f924),
      GoogleCompatEmoji(0x1f62a),
      GoogleCompatEmoji(0x1f635),
      GoogleCompatEmoji(0x1f910),
      GoogleCompatEmoji(0x1f974),
      GoogleCompatEmoji(0x1f922),
      GoogleCompatEmoji(0x1f92e),
      GoogleCompatEmoji(0x1f927),
      GoogleCompatEmoji(0x1f637),
      GoogleCompatEmoji(0x1f912),
      GoogleCompatEmoji(0x1f915),
      GoogleCompatEmoji(0x1f911),
      GoogleCompatEmoji(0x1f920),
      GoogleCompatEmoji(0x1f978),
      GoogleCompatEmoji(0x1f608),
      GoogleCompatEmoji(0x1f47f),
      GoogleCompatEmoji(0x1f479),
      GoogleCompatEmoji(0x1f47a),
      GoogleCompatEmoji(0x1f921),
      GoogleCompatEmoji(0x1f4a9),
      GoogleCompatEmoji(0x1f47b),
      GoogleCompatEmoji(0x1f480),
      GoogleCompatEmoji(0x2620),
      GoogleCompatEmoji(0x1f47d),
      GoogleCompatEmoji(0x1f47e),
      GoogleCompatEmoji(0x1f916),
      GoogleCompatEmoji(0x1f383),
      GoogleCompatEmoji(0x1f63a),
      GoogleCompatEmoji(0x1f638),
      GoogleCompatEmoji(0x1f639),
      GoogleCompatEmoji(0x1f63b),
      GoogleCompatEmoji(0x1f63c),
      GoogleCompatEmoji(0x1f63d),
      GoogleCompatEmoji(0x1f640),
      GoogleCompatEmoji(0x1f63f),
      GoogleCompatEmoji(0x1f63e),
      GoogleCompatEmoji(0x1f932, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f932, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f932, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f932, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f932, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f932, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f450, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f450, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f450, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f450, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f450, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f450, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f64c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f64c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f64c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f64c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f64c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f44f, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f44f, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f44f, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f44f, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f44f, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f44f, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f91d),
      GoogleCompatEmoji(0x1f44d, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f44d, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f44d, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f44d, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f44d, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f44d, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f44e, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f44e, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f44e, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f44e, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f44e, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f44e, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f44a, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f44a, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f44a, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f44a, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f44a, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f44a, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x270a, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x270a, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x270a, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x270a, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x270a, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x270a, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f91b, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f91b, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f91b, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f91b, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f91b, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f91b, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f91c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f91c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f91c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f91c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f91c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f91c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f91e, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f91e, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f91e, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f91e, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f91e, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f91e, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x270c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x270c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x270c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x270c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x270c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x270c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f91f, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f91f, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f91f, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f91f, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f91f, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f91f, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f918, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f918, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f918, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f918, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f918, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f918, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f44c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f44c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f44c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f44c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f44c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f44c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f90f, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f90f, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f90f, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f90f, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f90f, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f90f, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f90c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f90c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f90c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f90c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f90c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f90c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f448, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f448, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f448, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f448, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f448, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f448, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f449, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f449, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f449, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f449, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f449, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f449, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f446, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f446, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f446, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f446, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f446, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f446, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f447, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f447, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f447, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f447, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f447, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f447, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x261d, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x261d, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x261d, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x261d, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x261d, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x261d, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x270b, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x270b, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x270b, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x270b, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x270b, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x270b, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f91a, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f91a, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f91a, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f91a, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f91a, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f91a, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f590, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f590, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f590, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f590, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f590, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f590, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f596, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f596, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f596, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f596, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f596, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f596, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f44b, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f44b, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f44b, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f44b, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f44b, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f44b, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f919, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f919, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f919, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f919, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f919, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f919, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f4aa, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f4aa, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f4aa, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f4aa, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f4aa, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f4aa, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9be),
      GoogleCompatEmoji(0x1f595, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f595, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f595, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f595, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f595, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f595, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x270d, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x270d, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x270d, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x270d, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x270d, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x270d, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f64f, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64f, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f64f, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f64f, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f64f, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f64f, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9b6, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b6, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9b6, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9b6, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9b6, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9b6, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9b5, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b5, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9b5, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9b5, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9b5, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9b5, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9bf),
      GoogleCompatEmoji(0x1f484),
      GoogleCompatEmoji(0x1f48b),
      GoogleCompatEmoji(0x1f444),
      GoogleCompatEmoji(0x1f9b7),
      GoogleCompatEmoji(0x1f445),
      GoogleCompatEmoji(0x1f442, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f442, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f442, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f442, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f442, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f442, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9bb, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9bb, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9bb, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9bb, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9bb, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9bb, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f443, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f443, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f443, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f443, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f443, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f443, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f463),
      GoogleCompatEmoji(0x1f441),
      GoogleCompatEmoji(0x1f440),
      GoogleCompatEmoji(0x1f9e0),
      GoogleCompatEmoji(0x1fac0),
      GoogleCompatEmoji(0x1fac1),
      GoogleCompatEmoji(0x1f9b4),
      GoogleCompatEmoji(0x1f5e3),
      GoogleCompatEmoji(0x1f464),
      GoogleCompatEmoji(0x1f465),
      GoogleCompatEmoji(0x1fac2),
      GoogleCompatEmoji(0x1f476, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f476, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f476, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f476, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f476, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f476, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f467, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f467, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f467, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f467, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f467, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f467, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9d2, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d2, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d2, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d2, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d2, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d2, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f466, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f466, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f466, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f466, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f466, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f466, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f469, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3ff, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9b2))
      )),
      GoogleCompatEmoji(0x1f9d1, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f9d4, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d4, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d4, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d4, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d4, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f468, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b1)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b0)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f471, 0x1f3ff, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b3)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9b2)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9b2))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9b1)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9b1)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9b1)),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9b0)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9b0)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9b0)),
      GoogleCompatEmoji(intArrayOf(0x1f471, 0x200d, 0x2640, 0xfe0f)),
      GoogleCompatEmoji(0x1f471),
      GoogleCompatEmoji(intArrayOf(0x1f471, 0x200d, 0x2642, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9b3)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9b3)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9b3)),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9b2)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9b2)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9b2)),
      GoogleCompatEmoji(0x1f9d4),
      GoogleCompatEmoji(0x1f475, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f475, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f475, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f475, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f475, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f475, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9d3, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d3, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d3, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d3, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d3, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d3, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f474, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f474, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f474, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f474, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f474, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f474, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f472, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f472, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f472, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f472, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f472, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f472, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f473, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f473, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f473, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f473, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9d5, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d5, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d5, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d5, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d5, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d5, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f46e, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f46e, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f46e, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f46e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f477, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f477, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f477, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f477, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f482, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f482, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f482, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f482, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f575, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f575, 0xfe0f, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f575, 0xfe0f, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f575, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x2695, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x2695, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2695, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x2695, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x2695, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x2695, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x2695, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f33e), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f33e))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f33e), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f33e))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f33e), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f33e)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f33e))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f373), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f373))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f373), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f373))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f373), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f373)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f373))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f393), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f393))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f393), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f393))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f393), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f393)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f393))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f3a4), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f3a4))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f3a4), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3a4))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f3a4), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3a4)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3a4))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f3eb), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f3eb))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f3eb), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3eb))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f3eb), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3eb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3eb))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f3ed), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f3ed))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f3ed), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3ed))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f3ed), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3ed)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3ed))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f4bb), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f4bb))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f4bb), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f4bb))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f4bb), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f4bb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f4bb))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f4bc), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f4bc))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f4bc), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f4bc))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f4bc), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f4bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f4bc))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f527), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f527))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f527), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f527))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f527), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f527)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f527))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f52c), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f52c))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f52c), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f52c))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f52c), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f52c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f52c))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f3a8), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f3a8))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f3a8), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f3a8))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f3a8), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f3a8)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f3a8))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f692), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f692))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f692), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f692))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f692), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f692)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f692))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x2708, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x2708, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2708, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x2708, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x2708, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x2708, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x2708, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f680), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f680))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f680), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f680))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f680), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f680)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f680))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x2696, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x2696, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2696, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x2696, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x2696, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x2696, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x2696, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f470, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f470, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f470, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f470, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f935, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f935, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f935, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f935, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f478, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f478, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f478, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f478, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f478, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f478, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f934, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f934, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f934, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f934, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f934, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f934, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9b8, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b8, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9b9, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9b9, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f977, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f977, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f977, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f977, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f977, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f977, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f384), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f384)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f384)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f384)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f384)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f384))
      )),
      GoogleCompatEmoji(0x1f936, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f936, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f936, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f936, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f936, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f936, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f385, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f385, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f385, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f385, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f385, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f385, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f9d9, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d9, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9dd, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dd, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9db, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9db, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9db, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9db, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9df),
      GoogleCompatEmoji(intArrayOf(0x1f9df, 0x200d, 0x2640, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f9df, 0x200d, 0x2642, 0xfe0f)),
      GoogleCompatEmoji(0x1f9de),
      GoogleCompatEmoji(intArrayOf(0x1f9de, 0x200d, 0x2640, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f9de, 0x200d, 0x2642, 0xfe0f)),
      GoogleCompatEmoji(0x1f9dc, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9dc, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9da, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9da, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9da, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9da, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f47c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f47c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f47c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f47c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f47c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f47c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f930, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f930, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f930, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f930, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f930, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f930, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f931, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f931, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f931, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f931, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f931, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f931, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f37c), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f37c))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f37c), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f37c))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f37c), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f37c)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f37c))
      )),
      GoogleCompatEmoji(0x1f647, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f647, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f647, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f647, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f481, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f481, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f481, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f481, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f645, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f645, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f645, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f645, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f646, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f646, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f646, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f646, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f64b, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f64b, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f64b, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64b, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9cf, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cf, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f926, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f926, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f926, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f926, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f937, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f937, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f937, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f937, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f64e, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f64e, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f64e, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f64d, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f64d, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f64d, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f64d, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f487, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f487, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f487, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f487, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f486, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f486, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f486, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f486, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9d6, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9d6, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f485, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f485, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f485, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f485, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f485, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f485, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f933, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f933, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f933, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f933, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f933, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f933, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f483, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f483, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f483, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f483, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f483, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f483, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f57a, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f57a, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f57a, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f57a, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f57a, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f57a, 0x1f3fe))
      )),
      GoogleCompatEmoji(0x1f46f),
      GoogleCompatEmoji(intArrayOf(0x1f46f, 0x200d, 0x2640, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f46f, 0x200d, 0x2642, 0xfe0f)),
      GoogleCompatEmoji(0x1f574, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f574, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f574, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f574, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f574, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f574, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9bd), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9bd))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9bd), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9bd))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9bd), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9bd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9bd))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9bc), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9bc))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9bc), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9bc))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9bc), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9bc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9bc))
      )),
      GoogleCompatEmoji(0x1f6b6, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f6b6, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f9af), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f9af))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f9af), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f9af))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f9af), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f9af)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f9af))
      )),
      GoogleCompatEmoji(0x1f9ce, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9ce, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f3c3, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f3c3, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(0x1f9cd, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x200d, 0x2640, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fb, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fc, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fd, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fe, 0x200d, 0x2640, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3ff, 0x200d, 0x2640, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x200d, 0x2642, 0xfe0f), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fb, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fc, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fd, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3fe, 0x200d, 0x2642, 0xfe0f)),
        GoogleCompatEmoji(intArrayOf(0x1f9cd, 0x1f3ff, 0x200d, 0x2642, 0xfe0f))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x200d, 0x1f91d, 0x200d, 0x1f9d1), arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f9d1, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f9d1, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f46b, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f46b, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f46b, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f46b, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f46b, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f46b, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f46d, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f46d, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f46d, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f46d, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f46d, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f469, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f469, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f46d, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f46c, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f46c, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fb, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f46c, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fc, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f46c, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fd, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f46c, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3fe, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3ff)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f468, 0x1f3ff, 0x200d, 0x1f91d, 0x200d, 0x1f468, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f46c, 0x1f3ff))
      )),
      GoogleCompatEmoji(0x1f491, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f491, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f491, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f491, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f491, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f491, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f468)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f469)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f468)),
      GoogleCompatEmoji(0x1f48f, arrayOf(
        GoogleCompatEmoji(intArrayOf(0x1f48f, 0x1f3fb)),
        GoogleCompatEmoji(intArrayOf(0x1f48f, 0x1f3fc)),
        GoogleCompatEmoji(intArrayOf(0x1f48f, 0x1f3fd)),
        GoogleCompatEmoji(intArrayOf(0x1f48f, 0x1f3fe)),
        GoogleCompatEmoji(intArrayOf(0x1f48f, 0x1f3ff))
      )),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f468)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f469)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f468)),
      GoogleCompatEmoji(0x1f46a),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f466, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f467)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f466, 0x200d, 0x1f466)),
      GoogleCompatEmoji(intArrayOf(0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f467)),
      GoogleCompatEmoji(0x1f9f6),
      GoogleCompatEmoji(0x1f9f5),
      GoogleCompatEmoji(0x1f9e5),
      GoogleCompatEmoji(0x1f97c),
      GoogleCompatEmoji(0x1f9ba),
      GoogleCompatEmoji(0x1f45a),
      GoogleCompatEmoji(0x1f455),
      GoogleCompatEmoji(0x1f456),
      GoogleCompatEmoji(0x1fa72),
      GoogleCompatEmoji(0x1fa73),
      GoogleCompatEmoji(0x1f454),
      GoogleCompatEmoji(0x1f457),
      GoogleCompatEmoji(0x1f459),
      GoogleCompatEmoji(0x1fa71),
      GoogleCompatEmoji(0x1f458),
      GoogleCompatEmoji(0x1f97b),
      GoogleCompatEmoji(0x1f97f),
      GoogleCompatEmoji(0x1f460),
      GoogleCompatEmoji(0x1f461),
      GoogleCompatEmoji(0x1f462),
      GoogleCompatEmoji(0x1f45e),
      GoogleCompatEmoji(0x1f45f),
      GoogleCompatEmoji(0x1f97e),
      GoogleCompatEmoji(0x1fa74),
      GoogleCompatEmoji(0x1f9e6),
      GoogleCompatEmoji(0x1f9e4),
      GoogleCompatEmoji(0x1f9e3),
      GoogleCompatEmoji(0x1f3a9),
      GoogleCompatEmoji(0x1f9e2),
      GoogleCompatEmoji(0x1f452),
      GoogleCompatEmoji(0x1f393),
      GoogleCompatEmoji(0x26d1),
      GoogleCompatEmoji(0x1fa96),
      GoogleCompatEmoji(0x1f451),
      GoogleCompatEmoji(0x1f48d),
      GoogleCompatEmoji(0x1f45d),
      GoogleCompatEmoji(0x1f45b),
      GoogleCompatEmoji(0x1f45c),
      GoogleCompatEmoji(0x1f4bc),
      GoogleCompatEmoji(0x1f392),
      GoogleCompatEmoji(0x1f9f3),
      GoogleCompatEmoji(0x1f453),
      GoogleCompatEmoji(0x1f576),
      GoogleCompatEmoji(0x1f97d),
      GoogleCompatEmoji(0x1f302)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_googlecompat_category_people
}
