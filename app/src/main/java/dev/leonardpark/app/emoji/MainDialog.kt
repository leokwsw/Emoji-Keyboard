package dev.leonardpark.app.emoji

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.leonardpark.emoji.emojicompat.EmojiEditText
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.EmojiPopup
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.listeners.*

class MainDialog : DialogFragment() {
  companion object {
    const val FRAGMENT_MANAGER_TAG = "dialog_main"
    const val TAG = "MainDialog"

    fun show(@NonNull activity: AppCompatActivity) {
      MainDialog().show(activity.supportFragmentManager, FRAGMENT_MANAGER_TAG)
    }
  }

  var chatAdapter: RecyclerAdapter? = null
  var emojiPopup: EmojiPopup? = null

  var editText: EmojiEditText? = null
  lateinit var rootView: ViewGroup
  var emojiButton: AppCompatImageButton? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    chatAdapter = RecyclerAdapter()
  }

  override fun onStop() {
    emojiPopup?.dismiss()
    super.onStop()
  }

  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
    return AlertDialog.Builder(context)
      .setView(buildView())
      .create()
  }

  private fun buildView(): View {
    val result = View.inflate(context, R.layout.dialog_main, null)
    editText = result.findViewById(R.id.main_dialog_chat_bottom_message_edittext)
    rootView = result.findViewById(R.id.main_dialog_root_view)
    emojiButton = result.findViewById(R.id.main_dialog_emoji)

    val sendButton = result.findViewById<AppCompatImageView>(R.id.main_dialog_send)

    emojiButton!!.setColorFilter(
      ContextCompat.getColor(requireContext(), R.color.emoji_icons),
      PorterDuff.Mode.SRC_IN
    )
    sendButton.setColorFilter(
      ContextCompat.getColor(requireContext(), R.color.emoji_icons),
      PorterDuff.Mode.SRC_IN
    )

    emojiButton!!.setOnClickListener { ignore: View? -> emojiPopup!!.toggle() }
    sendButton.setOnClickListener { ignore: View? ->
      val text = editText!!.text.toString().trim()
      if (text.isNotEmpty()) {
        chatAdapter!!.add(text)
        editText!!.setText("")
      }
    }

    val recyclerView: RecyclerView = result.findViewById(R.id.main_dialog_recycler_view)
    recyclerView.adapter = chatAdapter
    recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    setUpEmojiPopup()

    return rootView
  }

  private fun setUpEmojiPopup() {
    emojiPopup = EmojiPopup.Builder.fromRootView(rootView)
      .setOnEmojiBackspaceClickListener(object : OnEmojiBackspaceClickListener {
        override fun onEmojiBackspaceClick(v: View) {
          Log.d(TAG, "Clicked on Backspace")
        }
      })
      .setOnEmojiClickListener(object : OnEmojiClickListener {
        override fun onEmojiClick(emoji: EmojiImageView, imageView: Emoji) {
          Log.d(TAG, "Clicked on emoji")
        }
      })
      .setOnEmojiPopupShownListener(object : OnEmojiPopupShownListener {
        override fun onEmojiPopupShown() {
          emojiButton!!.setImageResource(R.drawable.ic_keyboard)
        }
      })
      .setOnSoftKeyboardOpenListener(object : OnSoftKeyboardOpenListener {
        override fun onKeyboardOpen(keyBoardHeight: Int) {
          Log.d(
            TAG,
            "Opened soft keyboard"
          )
        }
      })
      .setOnEmojiPopupDismissListener(object : OnEmojiPopupDismissListener {
        override fun onEmojiPopupDismiss() {
          emojiButton!!.setImageResource(R.drawable.emoji_ios_category_people)
        }
      })
      .setOnSoftKeyboardCloseListener(object : OnSoftKeyboardCloseListener {
        override fun onKeyboardClose() {
          Log.d(TAG, "Closed soft keyboard")
        }
      })
      .build(editText!!)
  }
}