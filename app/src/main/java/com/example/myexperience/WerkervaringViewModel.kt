package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WerkervaringViewModel : ViewModel() {

    private var _ervaring1 : MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring1: LiveData<werkErvaring>
        get() {
            return _ervaring1
        }

    private var _ervaring2 : MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring2: LiveData<werkErvaring>
        get() {
            return _ervaring2
        }

    private var _navigeerNaarDetailWerkervaring : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarwerkErvaring: LiveData<Boolean>
        get() {
            return _navigeerNaarDetailWerkervaring
        }

    fun naarWerkervaringDetail1() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    fun naarWerkervaringDetail2() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    fun navigateToWerkErvaringenFinished() {
        _navigeerNaarDetailWerkervaring.value = false
    }

    init {
        _ervaring1.value = MockUpDB().getWerkervaring1()
        _ervaring2.value = MockUpDB().getWerkervaring2()
        _navigeerNaarDetailWerkervaring.value = false
    }
}