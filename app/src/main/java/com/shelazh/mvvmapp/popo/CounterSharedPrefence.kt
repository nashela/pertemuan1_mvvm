package com.shelazh.mvvmapp.popo

import android.content.Context

class CounterSharedPrefence(context: Context) {
    private val prefence = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)

    var counter: Int
        set(value) {
            prefence.edit().apply(){
                putInt(KEY_COUNTER, value)
                apply()
            }
        }
        get() = prefence.getInt(KEY_COUNTER, 0)

    companion object{
        const val SHARED_PREF_NAME = "counter-data"
        const val KEY_COUNTER = "counter"
    }
}