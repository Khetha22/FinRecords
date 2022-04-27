package com.example.records.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity (tableName = "CashUp_Table")
data  class CashUp(
    @PrimaryKey
    @ColumnInfo(name = "cashUpId")val cashUpId:Int,
    val date: Date,
    val clerksCashId:Int,
    val tillsDeposits: Float,
    val tillsCards: Float,
    val tillsTotals: Float,
)

