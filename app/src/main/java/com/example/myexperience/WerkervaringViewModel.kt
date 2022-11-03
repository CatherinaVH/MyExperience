package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WerkervaringViewModel : ViewModel() {

    private var _detailGegevens: MutableLiveData<werkErvaring> = MutableLiveData()

    private var _ervaring1 : MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring1: LiveData<werkErvaring>
        get() {
            return _ervaring1
        }

    private var _navigeerNaarDetailWerkervaring : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarwerkErvaring: LiveData<Boolean>
        get() {
            return _navigeerNaarDetailWerkervaring
        }

    fun naarWerkervaringDetail() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    init {
        _ervaring1.value = MockUpDB().getWerkervaring1()
        _navigeerNaarDetailWerkervaring.value = false
    }
}