package com.example.dipractice.di

import android.util.Log
import javax.inject.Inject

class Wheel {
    @Inject
    constructor()
    fun wheel(){
        Log.d("Wheel is moving","Wheel is moving")
    }
}