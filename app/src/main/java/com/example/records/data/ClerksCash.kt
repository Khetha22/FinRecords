package com.example.records.data

import android.graphics.Insets.add
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity
data class ClerksCash(

    @PrimaryKey
    val clerkId: Int,
    val date: Date,
    val clerkName: String,
    val depositOne: Float,
    val depositTwo: Float,
    val Cards: Float,
    val Total: Float,
    )