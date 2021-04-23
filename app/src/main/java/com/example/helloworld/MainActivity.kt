package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val myButton: Button = findViewById(R.id.button);

        myButton.setOnClickListener {
            setContentView(R.layout.activity_child)
        }

        setContentView(R.layout.activity_main)
    }


}