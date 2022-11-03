package com.example.myexperience

class Gebruiker(var voorNaam : String, var familieNaam: String, var geboortedatum: String,
    var woonplaats : String, var behaaldDiploma: String) {

    fun getNaam(): String {
        return voorNaam + " " + familieNaam
    }

}