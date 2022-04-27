package com.example.records.data.daos

import androidx.room.*
import com.example.records.data.CashUp
import com.example.records.data.CashUpWeeklyCrossRef
import com.example.records.data.CashUpWithWeekly
import com.example.records.data.WeeklyCashUp
import kotlinx.coroutines.flow.Flow
import kotlin.collections.List as List


@Dao
interface CashUpDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend  fun insertData(cashUp: CashUp)

    @Query("SELECT * FROM CashUp_Table ORDER BY cashUpId DESC")
    fun getAllData(): Flow<List<CashUp>>


    @Delete
    suspend fun deleteData(cashUp: CashUp)

    @Update
    suspend fun upDateData(cashUp: CashUp)

    @Transaction
    @Query("SELECT * FROM CashUp_Table")
    fun getCashUpWithWeekly(): Flow<List<CashUpWithWeekly>>


}