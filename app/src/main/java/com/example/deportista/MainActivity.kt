package com.example.deportista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a : Persona = Persona ("Marcelo", 1.90f, 90, 30)
        println("Deportista")
        println("Nombre "+ a.nombre)
        println("Estatura "+ a.estatura)
        println("Peso "+ a.peso)
        println("Edad "+ a.edad)
        println(a.descanso())

        println("-------------")

        var b : Runner = Runner("Miguel", 1.89f, 88, 28, "Maraton", 25)
        println("Runner")
        println("Nombre "+ b.nombre)
        println("Estatura "+ b.estatura)
        println("Peso "+ b.peso)
        println("Edad "+ b.edad)
        println(b.correr())

        println("-------------")

        var c : Ciclista = Ciclista("Sebastian", 1.80f, 80, 25, "Todo Terreno", 50)
        println("Ciclista")
        println("Nombre "+ c.nombre)
        println("Estatura "+ c.estatura)
        println("Peso "+ c.peso)
        println("Edad "+ c.edad)
        println(c.peladear())

        println("-------------")

        var d : Nadador = Nadador("Mauricio", 1.85f, 82, 28, "Libre", 10)
        println("Nadador")
        println("Nombre "+ d.nombre)
        println("Estatura "+ d.estatura)
        println("Peso "+ d.peso)
        println("Edad "+ c.edad)
        println(d.nadar())

        println("-------------")

        var triatleta: Triatleta = Triatleta("Mack",1.90f,92,27,"Libre", 20, 50, 15,
        "Todo Terreno")

        println("Triatleta")
        println("Nombre "+ triatleta.nombre)
        println("Estatura "+ triatleta.estatura)
        println("Peso "+ triatleta.peso)
        println("Edad "+ triatleta.edad)
        println("Estilo "+ triatleta.estilo)
        println("Esta "+ triatleta.corriendo())
        println("Corre a pie "+ triatleta.corredorVelocidad)
        println("Esta "+ triatleta.ciclista())
        println("Corre en bicicleta a "+ triatleta.ciclismoVelocidad)
        println("Esta "+ triatleta.nadador())
        println("Nada a "+ triatleta.nadarVelocidad)

    }
}