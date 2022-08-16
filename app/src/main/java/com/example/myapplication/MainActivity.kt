package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybtnclick = findViewById<Button>(R.id.button)
        val mycount = findViewById<TextView>(R.id.textView)
        var timesClicked =0

       //setOnClickListener is waiting for the listener to click this button and do the action as given
        mybtnclick.setOnClickListener {
          timesClicked = timesClicked + 1
            mycount.text = timesClicked.toString()
        }








    }
}






