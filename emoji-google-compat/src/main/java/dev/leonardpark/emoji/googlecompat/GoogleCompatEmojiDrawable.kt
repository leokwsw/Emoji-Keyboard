package dev.leonardpark.emoji.googlecompat

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import android.text.Spanned
import android.text.TextPaint
import androidx.emoji2.text.EmojiCompat
import androidx.emoji2.text.EmojiSpan

class GoogleCompatEmojiDrawable(unicode: String) : Drawable() {
  companion object {
    private const val TEXT_SIZE_FACTOR = 0.8f
    private const val BASELINE_OFFSET_FACTOR = 0.225f
  }

  private var emojiSpan: EmojiSpan? = null
  private var processed = false
  private var emojiCharSequence: CharSequence = unicode
  private val textPaint = TextPaint()

  init {
    textPaint.style = Paint.Style.FILL
    textPaint.color = -0x1
    textPaint.isAntiAlias = true
  }

  private fun process() {
    emojiCharSequence = EmojiCompat.get().process(emojiCharSequence)!!
    if (emojiCharSequence is Spanned) {
      val spans: Array<EmojiSpan> = (emojiCharSequence as Spanned).getSpans(
        0, emojiCharSequence.length,
        EmojiSpan::class.java
      )
      if (spans.isNotEmpty()) {
        emojiSpan = spans[0]
      }
    }
  }

  override fun draw(canvas: Canvas) {
    val bounds = bounds
    textPaint.textSize = bounds.height() * TEXT_SIZE_FACTOR
    val y = Math.round(bounds.bottom - bounds.height() * BASELINE_OFFSET_FACTOR)

    if (!processed && EmojiCompat.get().loadState != EmojiCompat.LOAD_STATE_LOADING) {
      processed = true
      if (EmojiCompat.get().loadState != EmojiCompat.LOAD_STATE_FAILED) {
        process()
      }
    }

    if (emojiSpan == null) {
      canvas.drawText(
        emojiCharSequence,
        0,
        emojiCharSequence.length,
        bounds.left.toFloat(),
        y.toFloat(),
        textPaint
      )
    } else {
      emojiSpan!!.draw(
        canvas, emojiCharSequence, 0, emojiCharSequence.length,
        bounds.left.toFloat(), bounds.top, y, bounds.bottom, textPaint
      )
    }
  }

  override fun setAlpha(alpha: Int) {
    textPaint.alpha = alpha
  }

  override fun setColorFilter(colorFilter: ColorFilter?) {
    textPaint.colorFilter = colorFilter
  }

  override fun getOpacity(): Int {
    return PixelFormat.UNKNOWN
  }
}