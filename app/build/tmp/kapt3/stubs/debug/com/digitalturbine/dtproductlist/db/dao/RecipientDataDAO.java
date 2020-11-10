package com.digitalturbine.dtproductlist.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/digitalturbine/dtproductlist/db/dao/RecipientDataDAO;", "", "insertData", "", "data", "Lcom/digitalturbine/dtproductlist/data/auth/RecipientData;", "load", "id", "", "app_debug"})
public abstract interface RecipientDataDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM recipientData WHERE id=:id")
    public abstract com.digitalturbine.dtproductlist.data.auth.RecipientData load(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertData(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.data.auth.RecipientData data);
}