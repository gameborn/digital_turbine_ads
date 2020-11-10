package com.digitalturbine.dtproductlist.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class AdDetailsFragmentArgs(
  val campaignId: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("campaignId", this.campaignId)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): AdDetailsFragmentArgs {
      bundle.setClassLoader(AdDetailsFragmentArgs::class.java.classLoader)
      val __campaignId : String?
      if (bundle.containsKey("campaignId")) {
        __campaignId = bundle.getString("campaignId")
        if (__campaignId == null) {
          throw IllegalArgumentException("Argument \"campaignId\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"campaignId\" is missing and does not have an android:defaultValue")
      }
      return AdDetailsFragmentArgs(__campaignId)
    }
  }
}
