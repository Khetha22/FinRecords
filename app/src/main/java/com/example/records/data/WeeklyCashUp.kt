package com.example.records.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class WeeklyCashUp(

    @PrimaryKey
    @ColumnInfo(name = "weeklyId")
    val weeklyId: Int,
    val weeklyDeposits: Float,
    val weeklyCards: Float,
    val weeklySales: Float






)