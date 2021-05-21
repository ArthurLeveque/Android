package com.example.helloworld

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.helloworld.MainActivity.Companion.NOM_KEY
import com.example.helloworld.MainActivity.Companion.PRENOM_KEY

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ResultFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(lastname: String, firstname: String) =
            ResultFragment().apply {
                arguments = Bundle().apply {
                    putString(NOM_KEY, lastname)
                    putString(PRENOM_KEY, firstname)
                }
            }
    }
}