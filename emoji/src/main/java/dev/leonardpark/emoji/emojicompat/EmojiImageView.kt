package dev.leonardpark.emoji.emojicompat

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Point
import android.util.AttributeSet
import android.view.View.OnLongClickListener
import androidx.annotation.NonNull
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import dev.leonardpark.emoji.ImageLoadingTask
import dev.leonardpark.emoji.R
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.listeners.OnEmojiClickListener
import dev.leonardpark.emoji.listeners.OnEmojiLongClickListener

class EmojiImageView(context: Context, attrs: AttributeSet) : AppCompatImageView(context, attrs) {
  companion object {
    private const val VARIANT_INDICATOR_PART_AMOUNT = 6
    private const val VARIANT_INDICATOR_PART = 5
  }

  var currentEmoji: Emoji? = null

  var clickListener: OnEmojiClickListener? = null
  var longClickListener: OnEmojiLongClickListener? = null

  private val variantIndicatorPaint = Paint()
  private val variantIndicatorPath = Path()

  private val variantIndicatorTop = Point()
  private val variantIndicatorBottomRight = Point()
  private val variantIndicatorBottomLeft = Point()

  private var imageLoadingTask: ImageLoadingTask? = null

  private var hasVariants = false

  init {
    variantIndicatorPaint.color = ContextCompat.getColor(context, R.color.emoji_divider)
    variantIndicatorPaint.style = Paint.Style.FILL
    variantIndicatorPaint.isAntiAlias = true
  }

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec)

    val measuredWidth = measuredWidth

    setMeasuredDimension(measuredWidth, measuredWidth)
  }

  override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
    super.onSizeChanged(w, h, oldw, oldh)

    variantIndicatorTop.x = w
    variantIndicatorTop.y = h / VARIANT_INDICATOR_PART_AMOUNT * VARIANT_INDICATOR_PART
    variantIndicatorBottomRight.x = w
    variantIndicatorBottomRight.y = h
    variantIndicatorBottomLeft.x = w / VARIANT_INDICATOR_PART_AMOUNT * VARIANT_INDICATOR_PART
    variantIndicatorBottomLeft.y = h

    variantIndicatorPath.rewind()
    variantIndicatorPath.moveTo(variantIndicatorTop.x.toFloat(), variantIndicatorTop.y.toFloat())
    variantIndicatorPath.lineTo(
      variantIndicatorBottomRight.x.toFloat(),
      variantIndicatorBottomRight.y.toFloat()
    )
    variantIndicatorPath.lineTo(
      variantIndicatorBottomLeft.x.toFloat(),
      variantIndicatorBottomLeft.y.toFloat()
    )
    variantIndicatorPath.close()
  }

  override fun onDraw(canvas: Canvas) {
    super.onDraw(canvas)

    if (hasVariants && drawable != null) {
      canvas.drawPath(variantIndicatorPath, variantIndicatorPaint)
    }
  }

  override fun onDetachedFromWindow() {
    super.onDetachedFromWindow()

    imageLoadingTask?.let {
      it.cancel(true)
      imageLoadingTask = null
    }
  }

  fun setEmoji(@NonNull emoji: Emoji) {
    if (emoji != currentEmoji) {
      setImageDrawable(null)
      currentEmoji = emoji
      hasVariants = emoji.getBase().hasVariants()
      imageLoadingTask?.cancel(true)
      setOnClickListener {
        clickListener?.onEmojiClick(this, currentEmoji!!)
      }
      setOnLongClickListener(if (hasVariants) OnLongClickListener {
        longClickListener!!.onEmojiLongClick(this@EmojiImageView, currentEmoji!!)
        true
      } else null)
      imageLoadingTask = ImageLoadingTask(this)
      imageLoadingTask!!.execute(emoji)
    }
  }

  fun updateEmoji(@NonNull emoji: Emoji) {
    if (emoji != currentEmoji) {
      currentEmoji = emoji
      setImageDrawable(emoji.getDrawable(this.context))
    }
  }

  fun setOnEmojiClickListener(@NonNull listener: OnEmojiClickListener) {
    this.clickListener = listener
  }

  fun setOnEmojiLongClickListener(@NonNull listener: OnEmojiLongClickListener) {
    this.longClickListener = listener
  }
}