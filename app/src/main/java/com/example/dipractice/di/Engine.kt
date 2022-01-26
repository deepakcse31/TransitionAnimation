package com.example.dipractice.di

import android.util.Log
import javax.inject.Inject

class Engine {
    @Inject
    constructor()
    fun getEngine()
    {
        Log.d("Engine","Engine")
    }
}