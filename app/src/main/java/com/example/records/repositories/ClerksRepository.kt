package com.example.records.repositories

import com.example.records.data.ClerksCash
import com.example.records.data.daos.ClerksCashDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ClerksRepository @Inject constructor( private val clerksCashDao: ClerksCashDao) {




       suspend fun addData(clerksCash: ClerksCash) = clerksCashDao.addData(clerksCash)

       fun getData(): Flow<List<ClerksCash>> = clerksCashDao.getData()

       suspend fun delete(clerksCash: ClerksCash)= clerksCashDao.delete(clerksCash)





}