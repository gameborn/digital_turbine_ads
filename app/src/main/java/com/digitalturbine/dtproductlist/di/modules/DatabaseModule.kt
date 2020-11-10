package com.digitalturbine.dtproductlist.di.modules

import android.content.Context
import androidx.room.Room
import com.digitalturbine.dtproductlist.db.MainDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule
{
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): MainDatabase
    {
        return Room.databaseBuilder(
            context,
            MainDatabase::class.java,
            "maindb.db"
        )
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
}