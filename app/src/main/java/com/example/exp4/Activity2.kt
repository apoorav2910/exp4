package com.example.exp4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val intent = intent
        val nameS : TextView = findViewById(R.id.nameS)
        val placeS : TextView = findViewById(R.id.placeS)

        val nm: String = intent.getStringExtra("nm").toString()
        nameS.text = "Hello $nm"
        val pc : String = intent.getStringExtra("pc").toString()
        placeS.text = "Your Current Loc: $pc"
    }
}