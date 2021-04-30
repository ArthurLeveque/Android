package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.MainActivity.Companion.NOM_KEY
import com.example.helloworld.MainActivity.Companion.PRENOM_KEY
import com.example.helloworld.databinding.ActivityChildBinding

class ChildActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChildBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChildBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val prenom: String? = intent.extras?.getString(PRENOM_KEY)
        val nom: String? = intent.extras?.getString(NOM_KEY)

        binding.results.text = "Salut $prenom $nom !"
    }
}