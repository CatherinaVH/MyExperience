package com.example.myexperience

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailErvaringViewModel(__ervaring: werkErvaring) : ViewModel() {

    private var _ervaring : MutableLiveData<werkErvaring> = MutableLiveData()
    val ervaring: LiveData<werkErvaring>
        get() {
            return _ervaring
        }

    init {
        _ervaring.value = __ervaring
     }

}