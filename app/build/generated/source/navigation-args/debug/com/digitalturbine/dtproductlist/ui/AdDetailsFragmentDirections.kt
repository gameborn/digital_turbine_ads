package com.digitalturbine.dtproductlist.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.digitalturbine.dtproductlist.R

class AdDetailsFragmentDirections private constructor() {
  companion object {
    fun actionGetBackToAdList(): NavDirections =
        ActionOnlyNavDirections(R.id.action_get_back_to_ad_list)
  }
}
