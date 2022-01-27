package dev.leonardpark.emoji

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.AsyncTask
import android.widget.ImageView
import dev.leonardpark.emoji.emoji.Emoji
import java.lang.ref.WeakReference

class ImageLoadingTask(imageView: ImageView) : AsyncTask<Emoji, Void, Drawable?>() {
  private val imageViewReference: WeakReference<ImageView> = WeakReference(imageView)
  private val contextReference: WeakReference<Context> = WeakReference(imageView.context)

  override fun doInBackground(vararg emoji: Emoji): Drawable? {
    val context = contextReference.get()
    if (context != null && !isCancelled) {
      return emoji[0].getDrawable(context)
    }
    return null
  }

  override fun onPostExecute(drawable: Drawable?) {
    if (!isCancelled && drawable != null) {
      imageViewReference.get()?.setImageDrawable(drawable)
    }
  }
}