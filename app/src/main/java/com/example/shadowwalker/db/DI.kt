package com.example.shadowwalker.db

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DBModule{

    @Provides
    @Singleton
    fun provideRunDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        RunDatabase::class.java,
        "run_db"
    ).addTypeConverter(LocationTypeConverter())
        .build()

    @Provides
    @Singleton
    fun provideRunDao(runDatabase: RunDatabase) = runDatabase.getRunDao()
}