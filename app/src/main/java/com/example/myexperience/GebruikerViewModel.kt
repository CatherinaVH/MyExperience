package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GebruikerViewModel : ViewModel() {

    private var _gebruiker : MutableLiveData<Gebruiker> = MutableLiveData()
    val gebruiker: LiveData<Gebruiker>
        get() {
            return _gebruiker
        }

    private var _navigeerNaarGebruikerGegevens : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarGebruikerGegevens: LiveData<Boolean>
        get() {
            return _navigeerNaarGebruikerGegevens
        }

    // WAARVOOR DIENT DIT?
//    private var _wijzigGegevensGebruiker : MutableLiveData<Boolean> = MutableLiveData()
//    val wijzigGegevensGebruiker: LiveData<Boolean>
//        get() {
//            return _wijzigGegevensGebruiker
//        }

    // EN DIT?
//    fun naarGebruikerGegevens() {
//        _navigeerNaarGebruikerGegevens.value = true
//    }

    fun wijzigGegevens() {
        //_wijzigGegevensGebruiker.value = true
        _navigeerNaarGebruikerGegevens.value = true
    }

    init {
        _gebruiker.value = MockUpDB().getGebruiker()
        _navigeerNaarGebruikerGegevens.value = false
        //_wijzigGegevensGebruiker.value = false
    }


}