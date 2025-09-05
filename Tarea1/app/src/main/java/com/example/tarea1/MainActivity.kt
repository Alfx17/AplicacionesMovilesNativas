package com.example.tarea1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.graphics.LinearGradient
import android.widget.TextView
import android.graphics.Color
import android.graphics.Shader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Botón 1 para el primer fragmento
        val boton1 = findViewById<Button>(R.id.botonAbrirFragment1)
        boton1.setOnClickListener {
            //Mostrar el fragmento
            val intent = Intent(this, FragmentsActivity::class.java)
            intent.putExtra(FragmentsActivity.FragmentTipo, FragmentsActivity.Fragment1)
            startActivity(intent)
        }

        // Botón 2 → SegundoFragment
        val boton2 = findViewById<Button>(R.id.botonAbrirFragment2)
        boton2.setOnClickListener {
            val intent = Intent(this, FragmentsActivity::class.java)
            intent.putExtra(FragmentsActivity.FragmentTipo, FragmentsActivity.Fragment2)
            startActivity(intent)
        }

        // Botón 3 → SegundoFragment
        val boton3 = findViewById<Button>(R.id.botonAbrirFragment3)
        boton3.setOnClickListener {
            val intent = Intent(this, FragmentsActivity::class.java)
            intent.putExtra(FragmentsActivity.FragmentTipo, FragmentsActivity.Fragment3)
            startActivity(intent)
        }

        // Botón 4 → SegundoFragment
        val boton4 = findViewById<Button>(R.id.botonAbrirFragment4)
        boton4.setOnClickListener {
            val intent = Intent(this, FragmentsActivity::class.java)
            intent.putExtra(FragmentsActivity.FragmentTipo, FragmentsActivity.Fragment4)
            startActivity(intent)
        }

        // Botón 5 → SegundoFragment
        val boton5 = findViewById<Button>(R.id.botonAbrirFragment5)
        boton5.setOnClickListener {
            val intent = Intent(this, FragmentsActivity::class.java)
            intent.putExtra(FragmentsActivity.FragmentTipo, FragmentsActivity.Fragment5)
            startActivity(intent)
        }

        val tituloCampos = findViewById<TextView>(R.id.tituloCamp)
        val shaderCampos = LinearGradient(
            0f, 0f, 0f, tituloCampos.textSize,
            intArrayOf(Color.WHITE, Color.BLACK, Color.DKGRAY),
            null,
            Shader.TileMode.CLAMP
        )

        tituloCampos.paint.shader = shaderCampos
        tituloCampos.setShadowLayer(8f, 0f, 0f, Color.BLACK)


        val tituloListas = findViewById<TextView>(R.id.tituloListas)
        val shaderListas = LinearGradient(
            0f, 0f, 0f, tituloListas.textSize,
            intArrayOf(Color.WHITE, Color.BLACK, Color.DKGRAY),
            null,
            Shader.TileMode.CLAMP
        )

        tituloListas.paint.shader = shaderListas
        tituloListas.setShadowLayer(8f, 0f, 0f, Color.BLACK)

        val tituloSel = findViewById<TextView>(R.id.tituloSel)
        val shaderSel = LinearGradient(
            0f, 0f, 0f, tituloSel.textSize,
            intArrayOf(Color.WHITE, Color.BLACK, Color.DKGRAY),
            null,
            Shader.TileMode.CLAMP
        )

        tituloSel.paint.shader = shaderSel
        tituloSel.setShadowLayer(8f, 0f, 0f, Color.BLACK)


        val tituloBotones = findViewById<TextView>(R.id.tituloBotones)
        val shaderBotones = LinearGradient(
            0f, 0f, 0f, tituloBotones.textSize,
            intArrayOf(Color.WHITE, Color.BLACK, Color.DKGRAY),
            null,
            Shader.TileMode.CLAMP
        )

        tituloBotones.paint.shader = shaderBotones
        tituloBotones.setShadowLayer(8f, 0f, 0f, Color.BLACK)

        val tituloInf = findViewById<TextView>(R.id.tituloInf)
        val shaderInf = LinearGradient(
            0f, 0f, 0f, tituloInf.textSize,
            intArrayOf(Color.WHITE, Color.BLACK, Color.DKGRAY),
            null,
            Shader.TileMode.CLAMP
        )

        tituloInf.paint.shader = shaderInf
        tituloInf.setShadowLayer(8f, 0f, 0f, Color.BLACK)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}