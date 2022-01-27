package dev.leonardpark.emoji.emoji

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import java.io.Serializable

open class Emoji : Serializable {
  @NonNull
  private var unicode: String = ""

  @DrawableRes
  private var resource = 0

  @NonNull
  private var variants: List<Emoji>

  @Nullable
  private var base: Emoji? = null

  constructor(codePoints: Int, @DrawableRes resource: Int) :
    this(intArrayOf(codePoints), resource, arrayOf<Emoji>())

  constructor(codePoints: Int, @DrawableRes resource: Int, variants: Array<Emoji>) :
    this(intArrayOf(codePoints), resource, variants)

  constructor(codePoints: IntArray, @DrawableRes resource: Int) :
    this(codePoints, resource, arrayOf<Emoji>())

  constructor(@NonNull codePoints: IntArray, @DrawableRes resource: Int, variants: Array<Emoji>) {
    unicode = String(codePoints, 0, codePoints.size)
    this.resource = resource
    // asList seems to always allocate a new object, even for empty lists.
    this.variants = if (variants.isEmpty()) emptyList() else listOf(*variants)
    for (variant in variants) {
      variant.base = this
    }
  }

  @NonNull
  fun getUnicode(): String = unicode

  @NonNull
  open fun getDrawable(context: Context): Drawable? = ContextCompat.getDrawable(context, resource)

  @NonNull
  fun getVariants(): MutableList<Emoji> = variants.toMutableList()

  @NonNull
  fun getBase(): Emoji {
    var result = this
    while (result.base != null) {
      result = result.base!!
    }
    return result
  }

  fun getLength(): Int = unicode.length

  fun hasVariants(): Boolean = variants.isNotEmpty()

  override fun equals(other: Any?): Boolean {
    if (this === other) {
      return true
    }
    if (other == null || javaClass != other.javaClass) {
      return false
    }

    val emoji = other as Emoji

    return resource == emoji.resource && unicode == emoji.unicode && variants == emoji.variants
  }

  override fun hashCode(): Int {
    var result = unicode.hashCode()
    result = 31 * result + resource
    result = 31 * result + variants.hashCode()
    return result
  }
}