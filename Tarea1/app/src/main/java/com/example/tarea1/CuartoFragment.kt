package com.example.tarea1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
class CuartoFragment : Fragment(R.layout.fragment_cuarto) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val botonRegresar = view.findViewById<Button>(R.id.regresar)
        botonRegresar.setOnClickListener{
            requireActivity().finish()
        }

        //Vista de la lista
        val lista = view.findViewById<ListView>(R.id.Lista)
        //Elementos a mostrar en la lista
        val elementos = listOf("Dato 1", "Dato 2", "Dato 3", "Dato 4")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, elementos)
        lista.adapter = adapter
    }
}