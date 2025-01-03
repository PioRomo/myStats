package com.application

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Seasons")
data class Season (
    @PrimaryKey(autoGenerate=true) val id: Int = 0,
    val year: String,
    val sport: String="Baseball"
)