package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.helloworld.databinding.FragmentFormularyBinding

private lateinit var binding: FragmentFormularyBinding

class FormularyFragment : Fragment(R.layout.fragment_formulary) {

    override fun onCreate(inflater: LayoutInflater,
                          container: ViewGroup?,
                          savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = FragmentFormularyBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {

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