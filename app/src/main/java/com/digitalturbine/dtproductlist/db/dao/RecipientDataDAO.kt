package com.digitalturbine.dtproductlist.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.digitalturbine.dtproductlist.data.auth.RecipientData

@Dao
interface RecipientDataDAO
{
    @Query("SELECT * FROM recipientData WHERE id=:id")
    fun load(id: String): RecipientData

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertData(data: RecipientData)
}