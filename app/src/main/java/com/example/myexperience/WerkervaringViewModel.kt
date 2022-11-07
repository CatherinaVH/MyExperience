package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WerkervaringViewModel : ViewModel() {

    private var _ervaring1: MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring1: LiveData<werkErvaring>
        get() {
            return _ervaring1
        }

    private var _ervaring2: MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring2: LiveData<werkErvaring>
        get() {
            return _ervaring2
        }

    private var _ervaring3: MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring3: LiveData<werkErvaring>
        get() {
            return _ervaring3
        }

    private var _ervaring4: MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring4: LiveData<werkErvaring>
        get() {
            return _ervaring4
        }

    private var _navigeerNaarDetailWerkervaring: MutableLiveData<Boolean> = MutableLiveData()
    val navigeerNaarwerkErvaring: LiveData<Boolean>
        get() {
            return _navigeerNaarDetailWerkervaring
        }

    private var _voegNieuweErvaringToe: MutableLiveData<Boolean> = MutableLiveData()
    val voegNieuweErvaringToe: LiveData<Boolean>
        get() {
            return _voegNieuweErvaringToe
        }


    fun naarVoegNieuweToe() {
        _voegNieuweErvaringToe.value = true
    }

    fun naarWerkervaringDetail1() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    fun naarWerkervaringDetail2() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    fun naarWerkervaringDetail3() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    fun naarWerkervaringDetail4() {
        _navigeerNaarDetailWerkervaring.value = true
    }

    fun navigateToWerkErvaringenFinished() {
        _navigeerNaarDetailWerkervaring.value = false
    }

    fun navigateToAddWerkervaringFinished() {
        _voegNieuweErvaringToe.value = false
    }

    init {
        _ervaring1.value = MockUpDB().getWerkervaring1()
        _ervaring2.value = MockUpDB().getWerkervaring2()
        _ervaring3.value = MockUpDB().getWerkervaring3()
        _ervaring4.value = MockUpDB().getWerkervaring4()
        _navigeerNaarDetailWerkervaring.value = false
    }
}