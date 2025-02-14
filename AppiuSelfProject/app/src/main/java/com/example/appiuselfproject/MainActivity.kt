package com.example.appiuselfproject

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
data class Item(val name: String)
class MainActivity : AppCompatActivity() {
    private lateinit var btnskip: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val item = listOf("apple","mago","banana","guava","pineapple")
        val listView = findViewById<ListView>(R.id.ListViews)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)
        listView.adapter = adapter;
        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You clicked: $selectedItem", Toast.LENGTH_SHORT).show()
        }
        btnskip = findViewById(R.id.btnskip);
        btnskip.setOnClickListener {
            val intent = Intent(this, LastActivity::class.java)
            intent.putExtra("name","chaitanya");
            intent.putExtra("age",20);
            startActivity(intent)
        }

}}