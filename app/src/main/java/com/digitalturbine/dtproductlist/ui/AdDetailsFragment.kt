package com.digitalturbine.dtproductlist.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.digitalturbine.dtproductlist.R
import com.digitalturbine.dtproductlist.data.ads.AdData
import com.digitalturbine.dtproductlist.databinding.AdDetailsFragmentBinding
import com.digitalturbine.dtproductlist.utils.OpenLink
import com.jakewharton.rxbinding4.view.clicks
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * AdDetailsFragment - selected ad details
 */

@AndroidEntryPoint
class AdDetailsFragment : Fragment() {


    @Inject
    lateinit var viewModel: AdDetailsViewModel

    val args: AdDetailsFragmentArgs by navArgs()

    private lateinit var binding: AdDetailsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = AdDetailsFragmentBinding.inflate(inflater)

        initialize()

        return binding.root
    }

    /**
     * initialize - init fragment
     */
    fun initialize()
    {
        binding.btnBackToList.clicks().subscribe { navigateBackToList() }

        viewModel.currentAd.observe(viewLifecycleOwner, Observer {
            ad -> ad?.let {
                showAdDetails(it)
            }
        })



        viewModel.loadAdDetails(args.campaignId)

    }

    /**
     * showAdDetails - show details of selected ad
     *
     * @param ad - retrieved data from database of selected ad
     */
    fun showAdDetails(ad: AdData)
    {
        val picasso = Picasso.get()

        binding.txtAdDetailsHeader.text = ad.categoryName
        binding.adName.text = ad.productName
        binding.adNameSmall.text = ad.productName
        binding.adDesc.text = ad.productDescription
        binding.adDownloads.text = ad.numberOfDownloads
        binding.btnInstall.text = ad.callToAction

        picasso.load(ad.productThumbnail).into(binding.adIcon)
        picasso.load(ad.avgRatingImgURL).into(binding.adStarsImage)

        binding.btnInstall.clicks().subscribe{
            OpenLink.openAppInPlayStore(requireContext(), ad.appPackageId)
        }
    }

    /**
     * navigateBackToList - return back to AdListFragment
     */
    fun navigateBackToList()
    {
        findNavController().popBackStack()
    }


}