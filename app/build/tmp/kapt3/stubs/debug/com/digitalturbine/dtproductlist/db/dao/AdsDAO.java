package com.digitalturbine.dtproductlist.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/digitalturbine/dtproductlist/db/dao/AdsDAO;", "", "insertAll", "", "ads", "", "Lcom/digitalturbine/dtproductlist/data/ads/AdData;", "load", "campaignId", "", "app_debug"})
public abstract interface AdsDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM adsData WHERE campaignId =:campaignId")
    public abstract com.digitalturbine.dtproductlist.data.ads.AdData load(@org.jetbrains.annotations.NotNull()
    java.lang.String campaignId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.digitalturbine.dtproductlist.data.ads.AdData> ads);
}