package com.example.deportista

import java.util.*


open class Persona (var nombre: String, var estatura: Float, var peso: Int, var edad: Int){
    fun descanso () {
        var descansar: String = "Descansar"
        println(descansar)
    }
}
class Runner (nombre: String, estatura: Float, peso: Int, edad: Int, var estilo: String, var velocidad: Int): Persona(nombre ,estatura ,peso ,edad){
    fun correr() {
        println("Estilo : $estilo")
        println("Velocidad : $velocidad")
    }
}
class Ciclista (nombre: String, estatura: Float, peso: Int, edad: Int, var tipoDeBici: String, var velocidad: Int): Persona(nombre,estatura,peso,edad){
    fun peladear () {
        println("Tipo de Bicicleta : $tipoDeBici")
        println("Velocidad : $velocidad")
    }
}
class Nadador (nombre: String, estatura: Float, peso: Int, edad: Int, var estilo: String, var velocidad: Int): Persona(nombre,estatura,peso,edad){
    fun nadar () {
        println("Estilo : $estilo")
        println("Velocidad : $velocidad")
    }
}
fun competir () {
    var competicion : Array<String> = arrayOf("Voy a Correr","Voy a Peladear","Voy a Nadar")
    for (i in competicion) {
        println(i)
    }
}