package com.digitalturbine.dtproductlist.ui


import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.digitalturbine.dtproductlist.adapters.AdListAdapter
import com.digitalturbine.dtproductlist.databinding.AdListFragmentBinding
import com.digitalturbine.dtproductlist.ext.TOTAL_CAMPAIGNS_PER_REQUEST
import com.jakewharton.rxbinding4.view.clicks
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.ad_list_fragment.*
import javax.inject.Inject


@AndroidEntryPoint
class AdListFragment : Fragment() {

    @Inject
    lateinit var viewModel: AdListViewModel

    private var adListAdapter: AdListAdapter = AdListAdapter()

    lateinit var binding: AdListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = AdListFragmentBinding.inflate(inflater)

        initialize()

        return binding.root
    }

    /**
     * initialize - init all bindings and provide listeners before fragment inited
     */
    private fun initialize()
    {
        viewModel.authorize()

        initViews()
        subscribeLocalEvents()
        subscribeUIChanges()
    }

    /**
     * initViews - initialize all views in this fragment
     */
    private fun initViews()
    {
        binding.adListView.layoutManager = LinearLayoutManager(context)
        binding.adListView.adapter = adListAdapter
        binding.adListView.setHasFixedSize(true)
    }

    /**
     * subscribeLocalEvents - provide listeners to user actions
     */
    private fun subscribeLocalEvents()
    {
        binding.btnLoadAds.clicks().subscribe(
            {
                val total = binding.txtTotalCampaigns.text.toString()
                if (total.isNotEmpty()) {
                    viewModel.loadAds(total)
                } else {
                    viewModel.loadAds(TOTAL_CAMPAIGNS_PER_REQUEST)
                }

                hideSoftKeyboard(requireActivity())

            },
            {
                Log.i("MYDATA", "Button LoadAds Click Error: ${it.message}")
            }
        )
    }

    /**
     * subscribeUIChanges - subscribe to data changes in ViewModel which will be applied to the current fragment
     */
    private fun subscribeUIChanges()
    {
        viewModel.loadAdsButtonText.observe(viewLifecycleOwner, Observer
        { buttonLabel ->
            btnLoadAds.text = buttonLabel
        })

        adListAdapter.onItemClickObservable
            .subscribeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { campaignId -> navigateToItemDetails(campaignId) },
                { error -> Log.i("MYDATA", "RecyclerView Item Click Error: ${error.message}") }
            )

        viewModel.adListData.observe(viewLifecycleOwner, Observer {
            it?.let { adList ->
                adListAdapter.adList = adList
            }
        })
    }

    /**
     * navigateToItemDetails - navigate to AdDetailsFragment
     *
     * @param campaignId - provides by Item clicked in adListView
     */
    private fun navigateToItemDetails(campaignId: String)
    {
        val action = AdListFragmentDirections.actionShowAdDetails(campaignId)
        findNavController().navigate(action)
    }

    /**
     * hideSoftKeyboard - Hide soft keyboard
     */
    fun hideSoftKeyboard(activity: Activity) {
        val inputMethodManager: InputMethodManager =
            activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
    }

}