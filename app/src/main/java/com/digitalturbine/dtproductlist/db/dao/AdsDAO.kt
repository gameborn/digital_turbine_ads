package com.digitalturbine.dtproductlist.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.digitalturbine.dtproductlist.data.ads.AdData
import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

@Dao
interface AdsDAO
{
    @Query("SELECT * FROM adsData WHERE campaignId =:campaignId")
    fun load(campaignId: String): AdData

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAll(ads: MutableList<AdData>)
}