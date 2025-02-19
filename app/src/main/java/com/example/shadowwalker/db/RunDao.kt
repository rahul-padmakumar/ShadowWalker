package com.example.shadowwalker.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RunDao{

    @Insert
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM run_table ORDER BY dateOfRun")
    fun getAllRunsOrderedByDate(): Flow<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY duration")
    fun getAllRunsOrderedByDuration(): Flow<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distance")
    fun getAllRunsOrderedByDistance(): Flow<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY caloriesBurnt")
    fun getAllRunsOrderedByCaloriesBurnt(): Flow<List<Run>>

    @Query("SELECT SUM(duration) FROM run_table")
    fun getTotalDuration(): Flow<Long>

    @Query("SELECT SUM(caloriesBurnt) FROM run_table")
    fun getTotalCaloriesBurnt(): Flow<Long>

    @Query("SELECT SUM(distance) FROM run_table")
    fun getTotalDistance(): Flow<Long>

    @Query("SELECT AVG(avgSpeedInKMH) FROM run_table")
    fun getAvgSpeedOfRuns(): Flow<Long>
}