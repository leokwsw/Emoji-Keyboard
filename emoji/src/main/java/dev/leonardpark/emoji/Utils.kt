package dev.leonardpark.emoji

import android.annotation.TargetApi
import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Point
import android.graphics.Rect
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.view.View
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.widget.PopupWindow
import androidx.annotation.NonNull
import androidx.annotation.Nullable

class Utils {
  companion object {
    private const val DONT_UPDATE_FLAG = -1

    @TargetApi(VERSION_CODES.JELLY_BEAN)
    fun removeOnGlobalLayoutListener(v: View, listener: OnGlobalLayoutListener?) {
      if (VERSION.SDK_INT < VERSION_CODES.JELLY_BEAN) {
        v.viewTreeObserver.removeGlobalOnLayoutListener(listener)
      } else {
        v.viewTreeObserver.removeOnGlobalLayoutListener(listener)
      }
    }

    @NonNull
    fun <T> checkNotNull(@Nullable reference: T?, message: String): T {
      requireNotNull(reference) { message }
      return reference
    }

    fun dpToPx(@NonNull context: Context, dp: Float): Int {
      return (dp * context.resources.displayMetrics.density).toInt()
    }

    fun dpToPx(@NonNull context: Context, dp: Int): Int {
      return (dp * context.resources.displayMetrics.density).toInt()
    }

    fun screenHeight(@NonNull context: Activity): Int {
      val size = Point()
      context.windowManager.defaultDisplay.getSize(size)
      return size.y
    }

    @NonNull
    fun locationOnScreen(@NonNull view: View): Point {
      val location = IntArray(2)
      view.getLocationOnScreen(location)
      return Point(location[0], location[1])
    }

    @NonNull
    fun windowVisibleDisplayFrame(@NonNull context: Activity): Rect? {
      val result = Rect()
      context.window.decorView.getWindowVisibleDisplayFrame(result)
      return result
    }

    fun asActivity(@NonNull context: Context): Activity {
      var result: Context? = context
      while (result is ContextWrapper) {
        if (result is Activity) {
          return context as Activity
        }
        result = (context as ContextWrapper).baseContext
      }
      throw IllegalArgumentException("The passed Context is not an Activity.")
    }

    fun fixPopupLocation(@NonNull popupWindow: PopupWindow, @NonNull desiredLocation: Point) {
      popupWindow.contentView.post {
        val actualLocation: Point = locationOnScreen(popupWindow.contentView)
        if (!(actualLocation.x == desiredLocation.x && actualLocation.y == desiredLocation.y)) {
          val differenceX = actualLocation.x - desiredLocation.x
          val differenceY = actualLocation.y - desiredLocation.y
          val fixedOffsetX: Int = if (actualLocation.x > desiredLocation.x) {
            desiredLocation.x - differenceX
          } else {
            desiredLocation.x + differenceX
          }
          val fixedOffsetY: Int = if (actualLocation.y > desiredLocation.y) {
            desiredLocation.y - differenceY
          } else {
            desiredLocation.y + differenceY
          }
          popupWindow.update(
            fixedOffsetX,
            fixedOffsetY,
            DONT_UPDATE_FLAG,
            DONT_UPDATE_FLAG
          )
        }
      }
    }
  }

  private fun Utils() {
    throw AssertionError("No instances.")
  }


}