package com.example.deportista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a : Persona = Persona (nombre = "Marcelo", estatura = 1.90f, peso = 90f, edad = 30)
        println("Nombre "+ a.nombre)
        println(a.estatura)
        println(a.peso)
        println(a.edad)
        println(a.descanso())

        println("-------------")

        var b : Runner = Runner(estilo = "Maraton", velocidad = 25)
        println(b.correr())
    }
}