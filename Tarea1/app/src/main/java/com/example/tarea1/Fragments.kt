package com.example.tarea1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
class Fragments : AppCompatActivity() {
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