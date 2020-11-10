package com.digitalturbine.dtproductlist.data.auth

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipientData")
data class RecipientData(
    @PrimaryKey @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "password") val password: String,
    @ColumnInfo(name = "siteId") val siteId: String,
    @ColumnInfo(name = "deviceId") val deviceId: String,
    @ColumnInfo(name = "sessionId") val sessionId: String)