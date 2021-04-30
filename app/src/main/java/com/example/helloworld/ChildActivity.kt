package com.example.helloworld

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.MainActivity.Companion.NOM_KEY
import com.example.helloworld.MainActivity.Companion.PRENOM_KEY


class ChildActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        val results: TextView = findViewById(R.id.results);

        val prenom: String? = intent.extras?.getString(PRENOM_KEY)
        val nom: String? = intent.extras?.getString(NOM_KEY)

        results.text = "Salut $prenom $nom !"
    }
}