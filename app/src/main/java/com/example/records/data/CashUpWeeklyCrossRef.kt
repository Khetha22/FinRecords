package com.example.records.data

import androidx.room.Entity

@Entity(primaryKeys = ["cashUpId","weeklyId"])
data class CashUpWeeklyCrossRef(

    val cashUpId:Int,
    val weeklyId:Int
)