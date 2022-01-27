package dev.leonardpark.emoji.emojicompat

import android.content.Context
import android.text.SpannableStringBuilder
import android.util.AttributeSet
import androidx.annotation.DimenRes
import androidx.annotation.Px
import androidx.appcompat.widget.AppCompatRadioButton
import dev.leonardpark.emoji.EmojiManager
import dev.leonardpark.emoji.R

class EmojiRadioButton: AppCompatRadioButton {
  private var emojiSize = 0f

  constructor(context: Context) : this(context, null)
  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
    if(!isInEditMode){
      EmojiManager.getInstance().verifyInstalled()
    }
    val fontMetrics = paint.fontMetrics
    val defaultEmojiSize = fontMetrics.descent - fontMetrics.ascent

    emojiSize = if (attrs == null) {
      defaultEmojiSize
    } else {
      val a = getContext().obtainStyledAttributes(attrs, R.styleable.EmojiRadioButton)
      try {
        a.getDimension(R.styleable.EmojiButton_emojiSize, defaultEmojiSize)
      } finally {
        a.recycle()
      }
    }
    text = text
  }

  override fun setText(rawText: CharSequence?, type: BufferType?) {
    val text: CharSequence = rawText ?: ""
    val spannableStringBuilder = SpannableStringBuilder(text)
    val fontMetrics = paint.fontMetrics
    val defaultEmojiSize = fontMetrics.descent - fontMetrics.ascent
    EmojiManager.replaceWithImages(context, spannableStringBuilder, emojiSize, defaultEmojiSize)
    super.setText(spannableStringBuilder, type)
  }

  fun setEmojiSize(@Px pixels: Int) {
    setEmojiSize(pixels, true)
  }

  fun setEmojiSize(@Px pixels: Int, shouldInvalidate: Boolean) {
    emojiSize = pixels.toFloat()

    if (shouldInvalidate) {
      text = text
    }
  }

  fun setEmojiSizeRes(@DimenRes res: Int) {
    setEmojiSizeRes(res, true)
  }

  fun setEmojiSizeRes(@DimenRes res: Int, shouldInvalidate: Boolean) {
    setEmojiSize(resources.getDimensionPixelSize(res), shouldInvalidate)
  }
}