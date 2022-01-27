package dev.leonardpark.app.emoji

import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.emoji2.bundled.BundledEmojiCompatConfig
import androidx.emoji2.text.EmojiCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.leonardpark.app.emoji.databinding.ActivityMainBinding
import dev.leonardpark.emoji.emojicompat.EmojiEditText
import dev.leonardpark.emoji.emojicompat.EmojiImageView
import dev.leonardpark.emoji.EmojiManager
import dev.leonardpark.emoji.EmojiPopup
import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.facebook.FacebookEmojiProvider
import dev.leonardpark.emoji.google.GoogleEmojiProvider
import dev.leonardpark.emoji.googlecompat.GoogleCompatEmojiProvider
import dev.leonardpark.emoji.ios.IosEmojiProvider
import dev.leonardpark.emoji.listeners.*
import dev.leonardpark.emoji.one.EmojiOneProvider
import dev.leonardpark.emoji.samsung.SamsungEmojiProvider
import dev.leonardpark.emoji.twitter.TwitterEmojiProvider
import dev.leonardpark.emoji.windows.WindowsEmojiProvider

class MainActivity : AppCompatActivity() {

  companion object {
    const val TAG = "MainActivity"
  }

  private lateinit var binding: ActivityMainBinding

  private lateinit var chatAdapter: RecyclerAdapter
  private var emojiPopup: EmojiPopup? = null

  private lateinit var editText: EmojiEditText
  private lateinit var rootView: ViewGroup
  lateinit var emojiButton: AppCompatImageButton

  private var emojiCompat: EmojiCompat? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    setSupportActionBar(binding.toolbar)

    chatAdapter = RecyclerAdapter()

    binding.emojiButton.text = "Button: \uD83D\uDE18\uD83D\uDE02\uD83E\uDD8C"
    binding.emojiTextview.text = "TextView: \uD83D\uDE18\uD83D\uDE02\uD83E\uDD8C"
    binding.emojiCheckbox.text = "CheckBox: \uD83D\uDE18\uD83D\uDE02\uD83E\uDD8C"
    binding.emojiToggleButton.textOn = "On: \uD83D\uDE18"
    binding.emojiToggleButton.textOff = "Off: \uD83D\uDE02"
    binding.emojiToggleButton.text = binding.emojiToggleButton.textOff

    editText = binding.mainActivityChatBottomMessageEdittext
    rootView = binding.mainActivityRootView
    emojiButton = binding.mainActivityEmoji

    val sendButton: AppCompatImageView = binding.mainActivitySend

    emojiButton.setColorFilter(
      ContextCompat.getColor(this, R.color.emoji_icons),
      PorterDuff.Mode.SRC_IN
    )
    sendButton.setColorFilter(
      ContextCompat.getColor(this, R.color.emoji_icons),
      PorterDuff.Mode.SRC_IN
    )

    emojiButton.setOnClickListener { emojiPopup!!.toggle() }

    sendButton.setOnClickListener {
      val text = editText.text.toString().trim()
      if (text.isNotEmpty()) {
        chatAdapter.add(text)
        editText.setText("")
      }
    }

    val recyclerView: RecyclerView = binding.mainActivityRecyclerView
    recyclerView.adapter = chatAdapter
    recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    setUpEmojiPopup()
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    return when (item.itemId) {
      R.id.show_dialog -> {
        MainDialog.show(this)
        true
      }
      R.id.variantFacebook -> {
        EmojiManager.install(FacebookEmojiProvider())
        recreate()
        true
      }
      R.id.variantGoogle -> {
        EmojiManager.install(GoogleEmojiProvider())
        recreate()
        true
      }
      R.id.variantGoogleCompat -> {
        if (emojiCompat == null) {
          val config: EmojiCompat.Config = BundledEmojiCompatConfig(this)
          config.setReplaceAll(true)
          emojiCompat = EmojiCompat.init(config)
        }
        EmojiManager.install(GoogleCompatEmojiProvider(emojiCompat))
        recreate()
        true
      }
      R.id.variantIos -> {
        EmojiManager.install(IosEmojiProvider())
        recreate()
        true
      }
      R.id.variantEmojiOne -> {
        EmojiManager.install(EmojiOneProvider())
        recreate()
        true
      }
      R.id.variantSamsung -> {
        EmojiManager.install(SamsungEmojiProvider())
        recreate()
        true
      }
      R.id.variantTwitter -> {
        EmojiManager.install(TwitterEmojiProvider())
        recreate()
        true
      }
      R.id.variantWindows -> {
        EmojiManager.install(WindowsEmojiProvider())
        recreate()
        true
      }
      else -> super.onOptionsItemSelected(item)
    }
  }

  override fun onBackPressed() {
    if (emojiPopup != null && emojiPopup!!.isShowing()) {
      emojiPopup!!.dismiss()
    } else {
      super.onBackPressed()
    }
  }

  override fun onStop() {
    emojiPopup?.dismiss()
    super.onStop()
  }


  private fun setUpEmojiPopup() {
    emojiPopup = EmojiPopup.Builder.fromRootView(rootView)
      .setOnEmojiBackspaceClickListener(object : OnEmojiBackspaceClickListener {
        override fun onEmojiBackspaceClick(v: View) {
          Log.d(TAG, "Clicked on Backspace")
        }
      })
      .setOnEmojiClickListener(object : OnEmojiClickListener {
        override fun onEmojiClick(imageView: EmojiImageView, emoji: Emoji) {
          Log.d(TAG, "Clicked on emoji")
        }
      })
      .setOnEmojiPopupShownListener(object : OnEmojiPopupShownListener {
        override fun onEmojiPopupShown() {
          emojiButton.setImageResource(R.drawable.ic_keyboard)
        }
      })
      .setOnSoftKeyboardOpenListener(object : OnSoftKeyboardOpenListener {
        override fun onKeyboardOpen(keyBoardHeight: Int) {
          Log.d(TAG, "Opened soft keyboard"
          )
        }
      })
      .setOnEmojiPopupDismissListener(object : OnEmojiPopupDismissListener {
        override fun onEmojiPopupDismiss() {
          emojiButton.setImageResource(R.drawable.emoji_ios_category_people)
        }
      })
      .setOnSoftKeyboardCloseListener(object : OnSoftKeyboardCloseListener {
        override fun onKeyboardClose() {
          Log.d(TAG, "Closed soft keyboard")
        }
      })
      .build(editText)
  }
}