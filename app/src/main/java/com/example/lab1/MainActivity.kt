package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumber = Random.nextInt(10)
        var but = findViewById<Button>(R.id.button)

        val randomNumberTextView = findViewById<TextView>(R.id.randomnumbersee)


        but.setOnClickListener(){
            var input = findViewById<EditText>(R.id.editTextNumber)
            val textView = findViewById<TextView>(R.id.textView)
            val number = Integer.parseInt(input.text.toString())

            randomNumberTextView.text = "Random number: $randomNumber"
            if (number > randomNumber)
                textView.text = "number is Greater : "
            else if (number < randomNumber)
                textView.text  = "number is smaller : "
            else
                textView.text = "number is equal"
        }

    }
}