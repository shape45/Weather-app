package com.example.weatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Arrays

class MainActivity2 : AppCompatActivity() {
    val weather = arrayListOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //get the weather text view
        val weatherTextView = findViewById<TextView>(R.id.tempTextview)

        //set the text views text to the first day
        weatherTextView.text = weatherTextView [0]

        //change the  value of element 0


        //set the text views text to the string representation to the Days

        val MondayInput = findViewById<EditText>(R.id.MondayInput)
        val TuesdayInput = findViewById<EditText>(R.id.TuesdayInput)
        val FridayInput = findViewById<EditText>(FridayInput)

        findViewById<Button>(R.id.btnMenu).setOnClickListener {
            weatherTextView

        }


    }
}