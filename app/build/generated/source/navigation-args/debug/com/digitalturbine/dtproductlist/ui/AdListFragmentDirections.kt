package com.digitalturbine.dtproductlist.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.digitalturbine.dtproductlist.R
import kotlin.Int
import kotlin.String

class AdListFragmentDirections private constructor() {
  private data class ActionShowAdDetails(
    val campaignId: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_show_ad_details

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("campaignId", this.campaignId)
      return result
    }
  }

  companion object {
    fun actionShowAdDetails(campaignId: String): NavDirections = ActionShowAdDetails(campaignId)
  }
}
