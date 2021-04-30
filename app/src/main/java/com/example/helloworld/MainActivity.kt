package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val NOM_KEY: String = "nom_key"
        const val PRENOM_KEY: String = "prenom_key"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val i = Intent(this, ChildActivity::class.java)

            i.putExtra(NOM_KEY, binding.nom.text.toString());
            i.putExtra(PRENOM_KEY, binding.prenom.text.toString());

            if (binding.nom.text.isEmpty() || binding.prenom.text.isEmpty()) {
                Toast.makeText(this, "Vous devez renseigner tous les champs !", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(i)
            }
        }
    }

}