package com.application

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch


class CreateSeasonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_season)

        val editTextSeasonYear = findViewById<EditText>(R.id.edit_text_season_year)
        val buttonSaveSeason = findViewById<Button>(R.id.button_save_season)

        buttonSaveSeason.setOnClickListener {
            val seasonYear = editTextSeasonYear.text.toString()

            // Save season to Room database
            val db = Room.databaseBuilder(applicationContext, SportsDatabase::class.java, "sports_database")
                .build()

            lifecycleScope.launch {
                val season = Season(year = seasonYear)
                db.seasonDAO().insertSeason(season)
                finish()  // Close activity after saving
            }
        }
    }
}
