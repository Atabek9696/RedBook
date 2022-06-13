package com.example.redbook.ui.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.redbook.ui.data.dao.NatureDao
import com.example.redbook.ui.data.model.Nature

@Database(entities = [Nature::class], version = 1)
abstract class NatureDataBase : RoomDatabase() {

    companion object {
        private lateinit var INSTANCE: NatureDataBase

        fun genInstance(context: Context): NatureDataBase =
            Room.databaseBuilder(
                context, NatureDataBase::class.java,
                "book-database.db"
            )
                .createFromAsset("book-database.db")
                .build()
    }

    abstract fun dao(): NatureDao
}
