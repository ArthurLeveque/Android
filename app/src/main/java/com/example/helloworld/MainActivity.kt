package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.helloworld.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val NOM_KEY: String = "nom_key"
        const val PRENOM_KEY: String = "prenom_key"
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

//        button.setOnClickListener {
//            val i = Intent(this, ChildActivity::class.java)
//
//            i.putExtra(NOM_KEY, nom.text.toString());
//            i.putExtra(PRENOM_KEY, prenom.text.toString());
//
//            if (nom.text!!.isEmpty()) {
//                nom.error = getString(R.string.error_nom)
//            } else if (prenom.text!!.isEmpty()) {
//                prenom.error = getString(R.string.error_prenom)
//            } else {
//                startActivity(i)
//            }
//        }
    }

}