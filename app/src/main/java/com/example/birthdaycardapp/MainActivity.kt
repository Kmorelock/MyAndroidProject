package com.example.birthdaycardapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Connects to activity_main.xml

        // Find the button in the layout
        val showToastButton: Button = findViewById(R.id.showToastButton)

        // Set a click listener to show a toast message
        showToastButton.setOnClickListener {
            Toast.makeText(this, "🎉 Happy Birthday! 🎂", Toast.LENGTH_LONG).show()
        }
    }
}


