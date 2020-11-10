package com.digitalturbine.dtproductlist.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalturbine.dtproductlist.R
import com.digitalturbine.dtproductlist.data.ads.AdData
import com.jakewharton.rxbinding4.view.clicks
import com.squareup.picasso.Picasso
import io.reactivex.rxjava3.subjects.PublishSubject
import kotlinx.android.synthetic.main.ad_list_item.view.*

class AdListAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    val onItemClickObservable: PublishSubject<String> = PublishSubject.create()

    var adList: MutableList<AdData> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return AdItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ad_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val ad = adList.get(position)

        (holder as AdItemViewHolder).bind(ad, onItemClickObservable)

    }

    override fun getItemCount(): Int {
        return adList.size
    }

    class AdItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(ad: AdData, onItemClickObservable: PublishSubject<String>)
        {
            val picasso = Picasso.get()

            itemView.adItemName.text = ad.productName
            itemView.adRating.text = ad.rating
            itemView.adDownloads.text = ad.numberOfDownloads

            picasso.load(ad.productThumbnail).placeholder(R.drawable.loading_image).into(itemView.adItemIcon)
            picasso.load(ad.avgRatingImgURL).placeholder(R.drawable.loading_image).into(itemView.adStarsImage)

            itemView.clicks()
                .subscribe{
                    onItemClickObservable.onNext(ad.campaignId)
                }
        }
    }
}