package com.application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCreateSeason = findViewById<Button>(R.id.button_create_season)
        val buttonViewSeasons = findViewById<Button>(R.id.button_view_seasons)

        buttonCreateSeason.setOnClickListener {
            // Open CreateSeasonActivity to create a new season
            val intent = Intent(this, CreateSeasonActivity::class.java)
            startActivity(intent)
        }

        buttonViewSeasons.setOnClickListener {
            // TODO: Implement View Seasons functionality
        }
    }
}
