package com.example.helloworld

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ChildActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        val results: TextView = findViewById(R.id.results);

        val prenom: String? = intent.extras?.getString("prenom")
        val nom: String? = intent.extras?.getString("nom")

        results.text = "Salut $prenom $nom !"
    }
}