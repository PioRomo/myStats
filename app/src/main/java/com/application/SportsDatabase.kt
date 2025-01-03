package com.application

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities=[Season::class, Game::class], version=1, exportSchema = false)
abstract class SportsDatabase : RoomDatabase(){
    abstract fun seasonDAO(): SeasonDAO
    abstract fun gameDAO(): GameDAO

    companion object {
        @Volatile
        private var INSTANCE: SportsDatabase? = null

        fun getDatabase(context: Context): SportsDatabase {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SportsDatabase::class.java,
                    "sports_database"
                ).build()
                INSTANCE = instance
                instance
            }

        }    }
}
