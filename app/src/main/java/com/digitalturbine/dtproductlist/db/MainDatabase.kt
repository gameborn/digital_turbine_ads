package com.digitalturbine.dtproductlist.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.digitalturbine.dtproductlist.data.ads.AdData
import com.digitalturbine.dtproductlist.data.auth.RecipientData
import com.digitalturbine.dtproductlist.db.dao.AdsDAO
import com.digitalturbine.dtproductlist.db.dao.RecipientDataDAO

@Database(entities = [(RecipientData::class), (AdData::class)], version = 3)
abstract class MainDatabase: RoomDatabase()
{
    abstract fun recipientDataDAO(): RecipientDataDAO
    abstract fun adsDAO(): AdsDAO
}