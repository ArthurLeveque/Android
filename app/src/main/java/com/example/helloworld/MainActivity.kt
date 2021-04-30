package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

        companion object{
            const val NOM_KEY: String = "nom_key";
            const val PRENOM_KEY: String = "prenom_key";
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button);

        myButton.setOnClickListener {
            val i = Intent(this, ChildActivity::class.java)
            val nom: EditText = findViewById(R.id.nom);
            val prenom: EditText = findViewById(R.id.prenom);

            i.putExtra(NOM_KEY, nom.text.toString());
            i.putExtra(PRENOM_KEY, prenom.text.toString());

            if (nom.text.toString().isEmpty() || prenom.text.toString().isEmpty()) {
                Toast.makeText(this, "Vous devez renseigner tous les champs !", Toast.LENGTH_SHORT)
                    .show();
            } else {
                startActivity(i)
            }
        }
    }

}