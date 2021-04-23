package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        val prenom: String? = intent.extras?.getString("prenom")
        val nom: String? = intent.extras?.getString("nom")

//        results.text = "Salut $prenom $nom !"
    }
}