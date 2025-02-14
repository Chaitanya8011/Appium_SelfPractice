package com.example.appiuselfproject

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_last)
        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", 0)
        val textView = findViewById<TextView>(R.id.lastTextView)
        textView.text = "Name: $name, Age: $age"
        textView.setTextIsSelectable(true)


    }
}