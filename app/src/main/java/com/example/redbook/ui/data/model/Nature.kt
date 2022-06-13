package com.example.redbook.ui.data.model

import android.transition.CircularPropagation
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.security.Security

@Entity(tableName = "book")
data class Nature(
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "type")
    val type: String,

    @ColumnInfo(name = "nameUzb")
    val nameUzb: String,

    @ColumnInfo(name = "nameRus")
    val nameRus : String,

    @ColumnInfo(name = "nameEng")
    val nameEng : String,

    @ColumnInfo(name = "propagation")
    val propagation : String,

    @ColumnInfo(name = "habibat")
    val habibat : String,

    @ColumnInfo(name = "quantity")
    val quantity : String,

    @ColumnInfo(name = "lifestyle")
    val lifestyle : String,

    @ColumnInfo(name = "limitFactors")
    val limitFactorys : String,

    @ColumnInfo(name = "breeding")
    val breeding : String,

    @ColumnInfo(name = "security")
    val security : String



)
