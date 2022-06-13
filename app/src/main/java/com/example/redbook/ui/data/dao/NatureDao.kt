package com.example.redbook.ui.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.redbook.ui.data.model.Nature

@Dao
interface NatureDao {
    @Query("SELECT * FROM book")
    fun genNature() : List<Nature>
}