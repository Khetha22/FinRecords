package com.example.records.data.daos

import androidx.room.*
import com.example.records.data.ClerksCash
import kotlinx.coroutines.flow.Flow


@Dao
interface ClerksCashDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addData(clerksCash: ClerksCash)

    @Query("SELECT * FROM clerkscash ORDER By date DESC ")
    fun getData():Flow<List<ClerksCash>>



    @Delete
    suspend fun delete(clerksCash: ClerksCash)





}