package com.example.records.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.records.data.*
import com.example.records.data.daos.CashUpDao
import com.example.records.data.daos.ClerksCashDao


@Database(entities = [ClerksCash::class, CashUp::class,WeeklyCashUp::class,CashUpWeeklyCrossRef::class], version =1,
                      exportSchema = false
)
@TypeConverters(Converters::class)
abstract class CashUpDatabase: RoomDatabase() {


    abstract fun cashUpDao(): CashUpDao

    abstract fun clerksCashDao(): ClerksCashDao

    abstract fun weeklyCashUp(): com.example.records.data.daos.WeeklyCashUp


}

