package com.shelazh.mvvmapp.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shelazh.mvvmapp.popo.CounterSharedPrefence
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val counterSharedPrefence: CounterSharedPrefence) : ViewModel() {

    val counter = ObservableField(0)

    fun increaseCounter() {
        counterSharedPrefence.counter += 1
        counter.set(counterSharedPrefence.counter)
    }

    fun decreaseCounter() {
        counterSharedPrefence.counter -= 1
        counter.set(counterSharedPrefence.counter)
    }
}