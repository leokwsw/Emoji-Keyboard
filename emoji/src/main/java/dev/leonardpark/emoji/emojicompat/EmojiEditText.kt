package dev.leonardpark.emoji.emojicompat

import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import androidx.annotation.CallSuper
import androidx.annotation.DimenRes
import androidx.annotation.Px
import androidx.appcompat.widget.AppCompatEditText
import dev.leonardpark.emoji.EmojiManager
import dev.leonardpark.emoji.R
import dev.leonardpark.emoji.emoji.Emoji

class EmojiEditText : AppCompatEditText {
  private var emojiSize = 0f

  constructor(context: Context) : this(context, null)
  constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
    if (!isInEditMode) {
      EmojiManager.getInstance().verifyInstalled()
    }
    val fontMetrics = paint.fontMetrics
    val defaultEmojiSize = fontMetrics.descent - fontMetrics.ascent

    emojiSize = if (attrs == null) {
      defaultEmojiSize
    } else {
      val a = getContext().obtainStyledAttributes(attrs, R.styleable.EmojiEditText)
      try {
        a.getDimension(R.styleable.EmojiEditText_emojiSize, defaultEmojiSize)
      } finally {
        a.recycle()
      }
    }
  }

  override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
    val fontMetrics = paint.fontMetrics
    val defaultEmojiSize = fontMetrics.descent - fontMetrics.ascent
    EmojiManager.replaceWithImages(context, getText(), emojiSize, defaultEmojiSize)
  }

  @CallSuper
  fun backspace() {
    val event = KeyEvent(0, 0, 0, KeyEvent.KEYCODE_DEL, 0, 0, 0, 0, KeyEvent.KEYCODE_ENDCALL)
    dispatchKeyEvent(event)
  }

  @CallSuper
  fun input(emoji: Emoji?) {
    if (emoji != null) {
      val start = selectionStart
      val end = selectionEnd
      if (start < 0) {
        append(emoji.getUnicode())
      } else {
        text!!.replace(
          start.coerceAtMost(end),
          start.coerceAtLeast(end),
          emoji.getUnicode(),
          0,
          emoji.getUnicode().length
        )
      }
    }
  }

  fun setEmojiSize(@Px pixels: Int) {
    setEmojiSize(pixels, true)
  }


  fun setEmojiSize(@Px pixels: Int, shouldInvalidate: Boolean) {
    emojiSize = pixels.toFloat()
    if (shouldInvalidate) {
      setText(text)
    }
  }

  fun setEmojiSizeRes(@DimenRes res: Int) {
    setEmojiSizeRes(res, true)
  }

  fun setEmojiSizeRes(@DimenRes res: Int, shouldInvalidate: Boolean) {
    setEmojiSize(resources.getDimensionPixelSize(res), shouldInvalidate)
  }

}