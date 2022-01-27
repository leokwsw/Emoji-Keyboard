package dev.leonardpark.emoji

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.style.DynamicDrawableSpan
import dev.leonardpark.emoji.emoji.Emoji

class EmojiSpan(
  private var context: Context,
  private var emoji: Emoji,
  private var size: Float
) : DynamicDrawableSpan() {
  private var deferredDrawable: Drawable? = null

  override fun getDrawable(): Drawable {
    if (deferredDrawable == null) {
      deferredDrawable = emoji.getDrawable(context)
      deferredDrawable!!.setBounds(0, 0, size.toInt(), size.toInt())
    }
    return deferredDrawable!!
  }

  override fun getSize(
    paint: Paint,
    text: CharSequence?,
    start: Int,
    end: Int,
    fontMetrics: Paint.FontMetricsInt?
  ): Int {
    if (fontMetrics != null) {
      val paintFontMetrics = paint.fontMetrics
      val fontHeight = paintFontMetrics.descent - paintFontMetrics.ascent
      val centerY = paintFontMetrics.ascent + fontHeight / 2

      fontMetrics.ascent = (centerY - size / 2).toInt()
      fontMetrics.top = fontMetrics.ascent
      fontMetrics.bottom = (centerY + size / 2).toInt()
      fontMetrics.descent = fontMetrics.bottom
    }
    return size.toInt()
  }

  override fun draw(
    canvas: Canvas,
    text: CharSequence?,
    start: Int,
    end: Int,
    x: Float,
    top: Int,
    y: Int,
    bottom: Int,
    paint: Paint
  ) {
    val drawable = drawable
    val paintFontMetrics = paint.fontMetrics
    val fontHeight = paintFontMetrics.descent - paintFontMetrics.ascent
    val centerY = y + paintFontMetrics.descent - fontHeight / 2
    val transitionY = centerY - size / 2

    canvas.save()
    canvas.translate(x, transitionY)
    drawable.draw(canvas)
    canvas.restore()
  }
}