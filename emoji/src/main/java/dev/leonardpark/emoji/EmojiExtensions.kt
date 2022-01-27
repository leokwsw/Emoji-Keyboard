package dev.leonardpark.emoji

fun String.isOnlyEmojis() = EmojiUtils.isOnlyEmojis(this)

fun String.emojisCount() = EmojiUtils.emojisCount(this)

fun String.emojis() = EmojiUtils.emojis(this)

fun String.emojiInformation() = EmojiUtils.emojiInformation(this)
