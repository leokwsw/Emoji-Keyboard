package dev.leonardpark.emoji.listeners

import androidx.annotation.Px

interface OnSoftKeyboardOpenListener {
  fun onKeyboardOpen(@Px keyBoardHeight: Int)
}