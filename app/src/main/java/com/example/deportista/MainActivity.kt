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

        var b : Runner = Runner(nombre = "Marc", estatura =1.89f, peso = 88f, edad = 28 ,estilo = "Maraton", velocidad = 25)
        println(b.nombre)
        println(b.estatura)
        println(b.peso)
        println(b.edad)
        println(b.correr())
    }
}