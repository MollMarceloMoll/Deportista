package com.example.deportista


open class Persona (var nombre: String, var estatura: Float, var peso: Float, var edad: Int){
    fun descanso () {
        var descansar: String = "Descansar"
        println(descansar)
    }
}
class Runner (nombre: String, estatura: Float, peso: Float, edad: Int, var estilo: String, var velocidad: Int): Persona(nombre ,estatura ,peso ,edad){
    fun correr() {
        println("Estilo : $estilo")
        println("Velocidad : $velocidad")
    }
}/*
class Ciclista (var tipoDeBici: String, var velocidad: Int): Persona(nombre,estatura,peso,edad){
    fun peladear () {
        var tipoDeBici = "Todo terreno"
        var velocidad = 50
        println("Tipo de Bicicleta : $tipoDeBici")
        println("Velocidad : $velocidad")
    }
}
class Nadador (var estilo: String, var velocidad: Int): Persona(nombre,estatura,peso,edad){
    fun nadar () {
        var estilo = "Braza"
        var velocidad = 10
        println("Estilo : $estilo")
        println("Velocidad : $velocidad")
    }
}*/