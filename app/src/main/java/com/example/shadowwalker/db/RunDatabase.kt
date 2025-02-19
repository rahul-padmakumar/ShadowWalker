package com.example.shadowwalker.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(DateTypeConverter::class, LocationTypeConverter::class)
abstract class RunDatabase: RoomDatabase() {
    abstract fun getRunDao(): RunDao
}