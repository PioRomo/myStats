package com.application

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SeasonDAO{
    @Insert
    suspend fun insertSeason(season: Season)

    @Query("SELECT * FROM Seasons ORDER BY year DESC")
    fun getAllSeasons():  LiveData<List<Season>>
}