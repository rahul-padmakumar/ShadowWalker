package com.example.shadowwalker.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "run_table")
data class Run(
    val dateOfRun: Date,
    val duration: Long,
    val distance: Long,
    val caloriesBurnt: Int,
    val avgSpeedInKMH: Float,
    val locations: LocationInfos
){
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null
}
