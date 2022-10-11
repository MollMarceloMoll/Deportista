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
interface Corredor {
    var estilo: String
    var corredorVelocidad: Int
    fun corriendo ()  : String {
        return "Corriendo"
    }
}
interface Ciclismo {
    var tipoDeBici: String
    var ciclismoVelocidad: Int
    fun ciclista (): String {
        return "Peladeando"
    }
}
interface Nadar {
    var estilo: String
    var nadarVelocidad: Int
    fun nadador (): String {
        return "Nadando"
    }
}

class Triatleta (nombre: String, estatura: Float, peso: Int, edad: Int,
                 override var estilo: String,
                 override var corredorVelocidad: Int,
                 override var ciclismoVelocidad: Int,
                 override var nadarVelocidad: Int,
                 override var tipoDeBici: String,
                ) :Persona(nombre,estatura,peso,edad), Corredor, Ciclismo,Nadar{
    override fun corriendo(): String {
        return super.corriendo()
    }

    override fun ciclista(): String {
        return super.ciclista()
    }

    override fun nadador(): String {
        return super.nadador()
    }
}