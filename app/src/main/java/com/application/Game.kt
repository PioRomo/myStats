package com.application

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Games")
data class Game(
    @PrimaryKey(autoGenerate=true) val id: Int=0,
    val seasonID: Int,
    val date: String,
    val ABatBats: Int,
    val ABhits: Int,
    val ABsingles: Int,
    val ABdoubles: Int,
    val ABtriples: Int,
    val ABhomeRuns: Int,
    val ABrbi: Int,
    val ABstrikeOuts: Int,
    val ABwalks: Int,
    val PtotalPitchCount: Int,
    val PinningsPitched: Double,
    val Pstrikes: Int,
    val Pballs: Int,
    val PstrikeOuts: Int,
    val Pwalks: Int,
    val Phits: Int,
    val Pruns: Int,
    val stolenBases: Int


)