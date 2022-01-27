package dev.leonardpark.emoji.googlecompat

import android.content.Context
import android.graphics.drawable.Drawable
import dev.leonardpark.emoji.emoji.Emoji

class GoogleCompatEmoji : Emoji {
  constructor(codePoints: IntArray, variants: Array<Emoji> = arrayOf()) : super(
    codePoints,
    -1,
    variants
  )

  constructor(codePoints: Int, variants: Array<Emoji> = arrayOf()) : super(codePoints, -1, variants)

  override fun getDrawable(context: Context): Drawable {
    return GoogleCompatEmojiDrawable(getUnicode())
  }
}