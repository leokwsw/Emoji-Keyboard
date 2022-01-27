package dev.leonardpark.app.emoji

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY
import dev.leonardpark.emoji.EmojiManager
import dev.leonardpark.emoji.ios.IosEmojiProvider

class EmojiApplication : Application() {
  override fun onCreate() {
    super.onCreate()

    AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_AUTO_BATTERY)
    EmojiManager.install(IosEmojiProvider())
  }
}