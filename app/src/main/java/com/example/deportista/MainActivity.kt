package com.example.deportista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a : Persona = Persona (nombre = "Marcelo", estatura = 1.90f, peso = 90, edad = 30)
        println("Nombre "+ a.nombre)
        println("Estatura "+ a.estatura)
        println("Peso "+ a.peso)
        println("Edad "+ a.edad)
        println(a.descanso())

        println("-------------")

        var b : Runner = Runner(nombre = "Marc", estatura =1.89f, peso = 88, edad = 28 ,estilo = "Maraton", velocidad = 25)
        println("Nombre "+ b.nombre)
        println("Estatura "+ b.estatura)
        println("Peso "+ b.peso)
        println("Edad "+ b.edad)
        println(b.correr())

        println("-------------")
    }
}