package com.example.shadowwalker.db

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson

@ProvidedTypeConverter
class LocationTypeConverter {

    @TypeConverter
    fun toJson(locationInfo: LocationInfos): String =
        Gson().toJson(locationInfo)

    @TypeConverter
    fun fromJson(locationJson: String): LocationInfos =
        Gson().fromJson(locationJson, LocationInfos::class.java)
}