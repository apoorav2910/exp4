package com.example.exp4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var name: TextInputEditText
    lateinit var place: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        place = findViewById(R.id.place)
        var btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener(){
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("nm", name.text.toString())
            intent.putExtra("no", 100)
            intent.putExtra("pc", place.text.toString())

            startActivity(intent)
        }
    }


}