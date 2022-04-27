package com.example.records.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.records.data.database.CashUpDatabase
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

     @Singleton
     @Provides
     fun provideDatabase(@ApplicationContext context:Context)= Room.databaseBuilder(
        context,
        CashUpDatabase::class.java,
        "Financial_database"
    ).build()

    @Singleton
    @Provides
    fun provideDao(cashUpDatabase: CashUpDatabase)= cashUpDatabase.cashUpDao()


    @Singleton
    @Provides
    fun provideCleDao(cashUpDatabase: CashUpDatabase)= cashUpDatabase.clerksCashDao()









}