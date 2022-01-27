package dev.leonardpark.app.emoji

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.leonardpark.emoji.emojicompat.EmojiTextView
import dev.leonardpark.emoji.EmojiUtils

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

  private val texts: MutableList<String> = arrayListOf()

  fun add(text: String) {
    texts.add(text)
    notifyDataSetChanged()
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(
      LayoutInflater.from(parent.context)
        .inflate(R.layout.adapter_chat, parent, false)
    )
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val text = texts[position]
    val emojiInfo = EmojiUtils.emojiInformation(text)
    val res = if (emojiInfo.isOnlyEmojis && emojiInfo.emojis.size == 1) {
      R.dimen.emoji_size_single_emoji
    } else if (emojiInfo.isOnlyEmojis && emojiInfo.emojis.size > 1) {
      R.dimen.emoji_size_only_emojis
    } else {
      R.dimen.emoji_size_default
    }
    holder.textView.apply {
      val resValue = resources.getDimension(res).toInt()
      setEmojiSize(resValue, false)
      setText(text)
    }
  }

  override fun getItemCount(): Int = texts.size

  class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: EmojiTextView = view.findViewById(R.id.adapter_chat_text_view)
  }
}