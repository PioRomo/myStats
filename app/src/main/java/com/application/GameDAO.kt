package com.application

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GameDAO {
    @Insert
    suspend fun insertGame(game: Game)

    @Query("SELECT * FROM Games WHERE seasonID = :seasonID ORDER BY date ASC")
    fun getGamesForSeason(seasonID: Int): LiveData<List<Game>>

    @Query("SELECT SUM(hits) * 1.0 / SUM(atBats) FROM Games WHERE seasonID=  :seasonID")
    fun getBattingAverage(seasonID: Int): LiveData<Double>
}