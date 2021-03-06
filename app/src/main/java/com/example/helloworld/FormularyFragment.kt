package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.helloworld.databinding.FragmentFormularyBinding

private lateinit var binding: FragmentFormularyBinding

class FormularyFragment : Fragment(R.layout.fragment_formulary) {

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            binding = FragmentFormularyBinding.inflate(inflater, container, false)

            binding.button.setOnClickListener {

                if (binding.nom.text!!.isEmpty()) {
                    binding.nom.error = getString(R.string.error_nom)
                } else if (binding.prenom.text!!.isEmpty()) {
                    binding.prenom.error = getString(R.string.error_prenom)
                } else {
//                    navigateToResultFragment()
                    val fragment = ResultFragment.newInstance(binding.nom.text.toString(), binding.prenom.text.toString())
                    activity.navigateToResult(fragment)
                }
            }

            val view = binding.root
            return view
        }
  }


