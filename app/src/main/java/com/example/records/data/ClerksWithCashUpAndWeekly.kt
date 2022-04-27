package com.example.records.data

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class ClerksWithCashUpAndWeekly(

    @Embedded val clerksCash: ClerksCash,

    @Relation(
              entity = CashUp::class,
              parentColumn = "clerkId",
              entityColumn = "clerksCashId",
    )

    val cashUpss:List<CashUpWithWeekly> = emptyList()



)
