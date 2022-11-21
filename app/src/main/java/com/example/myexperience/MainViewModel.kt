package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _gebruiker : MutableLiveData<Gebruiker> = MutableLiveData()
    val gebruiker: LiveData<Gebruiker>
        get() {
            return _gebruiker
        }

    private var _ervaring1 : MutableLiveData<WerkErvaring> = MutableLiveData()
    val ervaring1: LiveData<WerkErvaring>
        get() {
            return _ervaring1
        }

    private var _navigeerNaarGebruikerGegevens : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarGebruikerGegevens: LiveData<Boolean>
        get() {
            return _navigeerNaarGebruikerGegevens
        }

    private var _navigeerNaarErvaringen : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarErvaringen: LiveData<Boolean>
        get() {
            return _navigeerNaarErvaringen
        }

    fun naarGebruikerGegevens() {
        _navigeerNaarGebruikerGegevens.value = true
    }

    fun naarErvaringen() {
        _navigeerNaarErvaringen.value = true
    }

    fun naarGebruikerGegevensFinishec() {
        _navigeerNaarGebruikerGegevens.value = false
    }

    fun naarErvaringenFinished() {
        _navigeerNaarErvaringen.value = false
    }

    init {
        _gebruiker.value = MockUpDB().getGebruiker()
        _ervaring1.value = MockUpDB().getWerkervaring1()
        _navigeerNaarGebruikerGegevens.value = false
        _navigeerNaarErvaringen.value = false
    }

}