package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.btn)
        btnIntent.setOnClickListener {

            // We have to open a new activity
            /* give two parameters to Intent function, first is the application context and second
            one is the name of the activity file which is to be opened.   */

            intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}