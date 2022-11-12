package com.example.myexperience

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddErvaringViewModel : ViewModel() {
    private var _navigeerNaarVoegErvaringToe : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarVoegErvaringToe: LiveData<Boolean>
        get() {
            return _navigeerNaarVoegErvaringToe
        }

    var naamSchoolNieuw = MutableLiveData<String>()
    var datumVanNieuw = MutableLiveData<String>()
    var datumTotNieuw = MutableLiveData<String>()
    var functieNieuw = MutableLiveData<String>()
    var error = MutableLiveData<Boolean>()
    var errorText = MutableLiveData<String>()

    init {

        naamSchoolNieuw.value = ""
        datumVanNieuw.value = ""
        datumTotNieuw.value = ""
        functieNieuw.value = ""
        error.value = false
        errorText.value = ""

    }

    fun btnVoegErvaringToe() {
        if (naamSchoolNieuw.value !== "") {
            if (datumVanNieuw.value !== "") {
                if (datumTotNieuw.value !== "") {
                    if (functieNieuw.value !== "") {
                        //ervaring toegevoegen aan DB
                    } else {
                        errorText.value = "functie is leeg"
                    }
                } else {
                    errorText.value = "datum tot is leeg"
                }
            } else {
                errorText.value = "datum van is leeg"
            }
        } else {
            errorText.value = "naam school is leeg"
        }
    }

    fun errorMessageHandled() {
        error.value = false
        errorText.value = ""
    }

}