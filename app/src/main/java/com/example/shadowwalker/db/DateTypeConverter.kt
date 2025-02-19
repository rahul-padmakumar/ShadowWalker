package com.example.shadowwalker.db

import androidx.room.TypeConverter
import java.util.Date

class DateTypeConverter {

    @TypeConverter
    fun fromTimeStamp(timestamp: Long?): Date? =
        timestamp?.let { Date(it) }

    @TypeConverter
    fun toTimeStamp(date: Date?): Long? = date?.time
}