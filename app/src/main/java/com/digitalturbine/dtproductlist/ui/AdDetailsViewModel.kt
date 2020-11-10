package com.digitalturbine.dtproductlist.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalturbine.dtproductlist.api.Repository
import com.digitalturbine.dtproductlist.data.ads.AdData
import javax.inject.Inject

/**
 * AdDetailsViewModel - view-model for AdDetailsFragment
 */
class AdDetailsViewModel @Inject constructor() : ViewModel()
{
    @Inject
    lateinit var repository: Repository

    var currentAd = MutableLiveData<AdData>()

    /**
     * loadAdDetails - load details for selected ad
     *
     * @param campaignId - identified using to find selected ad in database
     */
    fun loadAdDetails(campaignId: String)
    {
        repository.loadAdByCampaignId(campaignId).subscribe {
            ad -> currentAd.postValue(ad)
        }
    }
}