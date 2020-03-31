package com.example.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        //value = "Witaj w aplikacji pomagającej dbać o zdrowie. Cieszę się, że Cię tu widzę :)"
    }

    val text: LiveData<String> = _text
}