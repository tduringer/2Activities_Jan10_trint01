package com.example.a2activities_jan10_trint01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity: AppCompatActivity() {
    private lateinit var mainBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        mainBtn = findViewById(R.id.btnMain)
        mainBtn.text = "First Screen"
        mainBtn.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
    }

    //the activity is coming into view
    override fun onStart() {
        super.onStart()
    }
    //when activity is on screen and user can interact
    override fun onResume() {
        super.onResume()
    }
    //pause starting to go in background
    override fun onPause() {
        super.onPause()
    }
    //application is in background
    override fun onStop() {
        super.onStop()
    }
    //if you leave app and come back
    override fun onRestart() {
        super.onRestart()
    }
    //kill the activity
    override fun onDestroy() {
        super.onDestroy()
    }
}