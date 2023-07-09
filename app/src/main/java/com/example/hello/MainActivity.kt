package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnSkill)
        button.setOnClickListener{
            intent = Intent(this , Skills::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnAch)
        button2.setOnClickListener {
            intent = Intent(this, Achievement::class.java)
            startActivity(intent)
        }

            val button1 = findViewById<Button>(R.id.btnEdu)
            button1.setOnClickListener {
                intent = Intent(this, Education::class.java)
                startActivity(intent)
            }

            val button3 = findViewById<Button>(R.id.btnWork)
            button3.setOnClickListener {
                intent = Intent(this, work::class.java)
                startActivity(intent)
            }
    }
}