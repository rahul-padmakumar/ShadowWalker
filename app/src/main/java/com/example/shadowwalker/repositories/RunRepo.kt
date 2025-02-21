package com.example.shadowwalker.repositories

import com.example.shadowwalker.db.Run
import com.example.shadowwalker.db.RunDao
import javax.inject.Inject

class RunRepo @Inject constructor(private val runDao: RunDao) {

    suspend fun addRun(run: Run){
        runDao.insertRun(run)
    }

    suspend fun deleteRun(run: Run){
        runDao.deleteRun(run)
    }

    fun getAllRunSortedByDate() = runDao.getAllRunsOrderedByDate()
    fun getAllRunSortedByDistance() = runDao.getAllRunsOrderedByDistance()
    fun getAllRunSortedByTDuration() = runDao.getAllRunsOrderedByDuration()
    fun getAllRunSortedByCaloriesBurnt() = runDao.getAllRunsOrderedByCaloriesBurnt()

    fun getTotalAvgSpeed() = runDao.getAvgSpeedOfRuns()
    fun getTotalDistance() = runDao.getTotalDistance()
    fun getTotalCaloriesBurnt() = runDao.getTotalCaloriesBurnt()
    fun getTotalDuration() = runDao.getTotalDuration()
}