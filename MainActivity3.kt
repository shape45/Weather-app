package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val temperature = intent.getIntArrayExtra("temperature") ?: intArrayOf()
        val day = intent.getStringArrayExtra("day") ?: intArrayOf()

        val mintemperature = temperature.sum()
        val maxtemperature = if (temperature. isNotEmpty())mintemperature / temperature.size else 0

        findViewById<TextView>(R.id.totaltemperature).text = "Total of min or max temp:$totaltemperature day"
        findViewById<TextView>(R.id.averagetemperature).text = "Average of day and temp:$averagetemperature"

        findViewById<Button>(R.id.buttonexit).setOnClickListener {
        }
    }
}