package com.example.deportista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a : Persona = Persona (nombre = "Marcelo", estatura = 1.90f, peso = 90, edad = 30)
        println("Deportista")
        println("Nombre "+ a.nombre)
        println("Estatura "+ a.estatura)
        println("Peso "+ a.peso)
        println("Edad "+ a.edad)
        println(a.descanso())

        println("-------------")

        var b : Runner = Runner(nombre = "Miguel", estatura =1.89f, peso = 88, edad = 28 ,estilo = "Maraton", velocidad = 25)
        println("Runner")
        println("Nombre "+ b.nombre)
        println("Estatura "+ b.estatura)
        println("Peso "+ b.peso)
        println("Edad "+ b.edad)
        println(b.correr())

        println("-------------")

        var c : Ciclista = Ciclista(nombre = "Sebastian", estatura = 1.80f, peso = 80, edad = 25, tipoDeBici = "Todo Terreno", velocidad = 50)
        println("Ciclista")
        println("Nombre "+ c.nombre)
        println("Estatura "+ c.estatura)
        println("Peso "+ c.peso)
        println("Edad "+ c.edad)
        println(c.peladear())

        println("-------------")

        var d : Nadador = Nadador(nombre = "Mauricio", estatura = 1.85f, peso = 82, edad = 28, estilo = "Libre", velocidad = 10)
        println("Nadador")
        println("Nombre "+ d.nombre)
        println("Estatura "+ d.estatura)
        println("Peso "+ d.peso)
        println("Edad "+ c.edad)
        println(d.nadar())
    }
}