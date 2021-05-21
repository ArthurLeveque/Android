package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FormularyFragment : Fragment(R.layout.fragment_formulary) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        button.setOnClickListener {
            val i = Intent(this, ChildActivity::class.java)

            i.putExtra(NOM_KEY, nom.text.toString());
            i.putExtra(PRENOM_KEY, prenom.text.toString());

            if (nom.text!!.isEmpty()) {
                nom.error = getString(R.string.error_nom)
            } else if (prenom.text!!.isEmpty()) {
                prenom.error = getString(R.string.error_prenom)
            } else {
                startActivity(i)
            }
        }
    }



}