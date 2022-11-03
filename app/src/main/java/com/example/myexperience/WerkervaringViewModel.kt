package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WerkervaringViewModel : ViewModel() {

    private var _detailGegevens: MutableLiveData<werkErvaring> = MutableLiveData()

    val detailGegevens: LiveData<werkErvaring>
        get() {
        return _detailGegevens
        }

    private var _navigeerNaarDetailWerkervaring : MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarwerkErvaring: LiveData<Boolean>
        get() {
            return _navigeerNaarDetailWerkervaring
        }

    fun naarWerkervaring() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    init {
        _detailGegevens.value = MockUpDB().getWerkervaring1()
        _navigeerNaarDetailWerkervaring.value = false
    }
}