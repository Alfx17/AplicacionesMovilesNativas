package com.example.tarea1

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.tarea1.databinding.ActivityFragmentsBinding
import androidx.fragment.app.Fragment
class FragmentsActivity : AppCompatActivity() {
    companion object{
        const val FragmentTipo = "Fragment_Tipo"
        const val Fragment1 = "Fragment1"
        const val Fragment2 = "Fragment2"
        const val Fragment3 = "Fragment3"
        const val Fragment4 = "Fragment4"
        const val Fragment5 = "Fragment5"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments)

        val FragmentSel = intent.getStringExtra(FragmentTipo)
        val fragment: Fragment = when(FragmentSel) {
            Fragment1 -> PrimerFragment()
            Fragment2 -> SegundoFragment()
            Fragment3 -> TercerFragment()
            Fragment4 -> CuartoFragment()
            Fragment5 -> QuintoFragment()
            else -> PrimerFragment() // default por si algo falla

        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.ContenedorFrag, fragment)
            .commit()
    }
}