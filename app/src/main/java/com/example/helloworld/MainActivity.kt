package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button);

        myButton.setOnClickListener {
            val i = Intent(this, ChildActivity::class.java)
            var nom: EditText = findViewById(R.id.nom);
            val prenom: EditText = findViewById(R.id.prenom);

            i.putExtra ( "nom", nom.getText().toString() );
            i.putExtra ( "prenom", prenom.getText().toString() );
            startActivity(i)
        }
    }


}