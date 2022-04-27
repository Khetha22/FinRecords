package com.example.records.data

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class CashUpWithWeekly(

    @Embedded val cashUp: CashUp,

    @Relation(parentColumn = "cashUpId",
              entityColumn = "weeklyId",
              associateBy = Junction(CashUpWeeklyCrossRef::class))

    val weeklyCash:List<WeeklyCashUp>



)