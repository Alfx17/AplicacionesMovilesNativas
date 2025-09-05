package com.example.tarea1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class QuintoFragment : Fragment(R.layout.fragment_quinto) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val botonRegresar = view.findViewById<Button>(R.id.regresar)
        botonRegresar.setOnClickListener{
            requireActivity().finish()
        }
    }
}