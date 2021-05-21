package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.helloworld.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val NOM_KEY: String = "nom_key"
        const val PRENOM_KEY: String = "prenom_key"

        const val DATA_KEY: String = "fsdlkmjsfdmjklfsqdkml";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FormularyFragment>(R.id.fragment_container_view)
            }
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

}

fun FragmentActivity?.navigateToResult(fragment: ResultFragment) {
    this?.supportFragmentManager?.commit {
        setReorderingAllowed(true)
        add(R.id.fragment_container_view, fragment)
    }
}