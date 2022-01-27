package dev.leonardpark.emoji.listeners

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.view.MotionEvent
import android.view.View

class RepeatListener(
  private var initialInterval: Long,
  var normalInterval: Long,
  var clickListener: View.OnClickListener?
) : View.OnTouchListener {

  val handler = Handler(Looper.getMainLooper())
  var downView: View? = null

  private val handlerRunnable: Runnable = object : Runnable {
    override fun run() {
      if (downView != null) {
        handler.removeCallbacksAndMessages(downView)
        handler.postAtTime(this, downView, SystemClock.uptimeMillis() + normalInterval)
        clickListener!!.onClick(downView)
      }
    }
  }

  init {
    requireNotNull(clickListener) { "null runnable" }
    require(!(initialInterval < 0 || normalInterval < 0)) { "negative interval" }
  }

  @SuppressLint("ClickableViewAccessibility")
  override fun onTouch(view: View, motionEvent: MotionEvent): Boolean {
    when (motionEvent.action) {
      MotionEvent.ACTION_DOWN -> {
        handler.removeCallbacks(handlerRunnable)
        handler.postAtTime(handlerRunnable, downView, SystemClock.uptimeMillis() + initialInterval)
        downView = view
        downView!!.isPressed = true
        clickListener!!.onClick(view)
        return true
      }
      MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_OUTSIDE -> {
        handler.removeCallbacksAndMessages(downView)
        downView!!.isPressed = false
        downView = null
        return true
      }
      else -> {
      }
    }

    return false
  }
}