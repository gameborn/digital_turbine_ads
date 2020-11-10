package com.digitalturbine.dtproductlist.db;

import java.lang.System;

@androidx.room.Database(entities = {com.digitalturbine.dtproductlist.data.auth.RecipientData.class, com.digitalturbine.dtproductlist.data.ads.AdData.class}, version = 3)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/digitalturbine/dtproductlist/db/MainDatabase;", "Landroidx/room/RoomDatabase;", "()V", "adsDAO", "Lcom/digitalturbine/dtproductlist/db/dao/AdsDAO;", "recipientDataDAO", "Lcom/digitalturbine/dtproductlist/db/dao/RecipientDataDAO;", "app_debug"})
public abstract class MainDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.digitalturbine.dtproductlist.db.dao.RecipientDataDAO recipientDataDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.digitalturbine.dtproductlist.db.dao.AdsDAO adsDAO();
    
    public MainDatabase() {
        super();
    }
}