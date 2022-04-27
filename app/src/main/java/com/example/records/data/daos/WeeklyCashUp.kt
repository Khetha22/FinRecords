package com.example.records.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.records.data.ClerksWithCashUpAndWeekly
import com.example.records.data.WeeklyCashUp
import kotlinx.coroutines.flow.Flow

@Dao
interface WeeklyCashUp {


    @Query("SELECT * FROM weeklycashup ORDER BY weeklyId DESC")
    fun getData():Flow<List<WeeklyCashUp>>

    @Insert
    suspend fun insertData(weeklyCashUp: WeeklyCashUp)

    @Transaction
    @Query("SELECT * FROM clerkscash ORDER BY clerkId DESC")
    fun getClerksWithCashUpAndWeekly():Flow<List<ClerksWithCashUpAndWeekly>>


}