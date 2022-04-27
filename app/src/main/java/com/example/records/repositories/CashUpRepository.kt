package com.example.records.repositories

import com.example.records.data.CashUp
import com.example.records.data.CashUpWeeklyCrossRef
import com.example.records.data.CashUpWithWeekly
import com.example.records.data.daos.CashUpDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CashUpRepository @Inject constructor(private val cashDao: CashUpDao) {


    suspend  fun insertData(cashUp: CashUp)= cashDao.insertData(cashUp)

    fun getAllData(): Flow<List<CashUp>> = cashDao.getAllData()

    fun getCashUpWithWeekly(): Flow<List<CashUpWithWeekly>> = cashDao.getCashUpWithWeekly()

    suspend fun deleteData(cashUp: CashUp)= cashDao.deleteData(cashUp)


    suspend fun upDateData(cashUp: CashUp) = cashDao.upDateData(cashUp)






}