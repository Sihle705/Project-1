package com.example.assigment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate .setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null )  {
                val results = when (age) {
                    in 0..12 -> "Mandela"
                    in 13..19 -> "Teenager"
                    in 20..59 -> "Adult"
                    else -> "Senior"
                }
                txtResult.text ="Age: $age\n${
                    when (result) {
                        "Mandela" -> "Mandela died at the age of 12"
                        "Teenager" -> "You are a Teenager ."
                        "Adult
                    }
                    
                    
                }
            }
        }


    }
}