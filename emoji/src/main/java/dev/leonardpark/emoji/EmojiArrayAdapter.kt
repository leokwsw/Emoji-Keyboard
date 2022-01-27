package dev.leonardpark.emoji

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.listeners.OnEmojiClickListener
import dev.leonardpark.emoji.listeners.OnEmojiLongClickListener

class EmojiArrayAdapter(
  @NonNull context: Context,
  @NonNull emoji: List<Emoji>,
  @Nullable private var variantManager: VariantEmoji?,
  @Nullable var listener: OnEmojiClickListener?,
  @Nullable var longListener: OnEmojiLongClickListener?
) : ArrayAdapter<Emoji>(context, 0, emoji) {

  override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
    var image = convertView as EmojiImageView?
    val context = context
    if (image == null) {
      image =
        LayoutInflater.from(context).inflate(R.layout.emoji_item, parent, false) as EmojiImageView
      image.setOnEmojiClickListener(listener!!)
      image.setOnEmojiLongClickListener(longListener!!)
    }

    val emoji = checkNotNull(getItem(position), { "emoji == null" })
    val variantToUse = if (variantManager == null) emoji else variantManager!!.getVariant(emoji)
    image.setEmoji(variantToUse)

    return image
  }

  fun updateEmojis(emojis: Collection<Emoji>) {
    clear()
    addAll(emojis)
    notifyDataSetChanged()
  }
}