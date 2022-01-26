package com.example.dipractice.di

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor( private val engine: Engine,private val wheel: Wheel)
{
    //dependecy of car class done it is kept inside
    fun getcar()
    {
        engine.getEngine()
        wheel.wheel()
        Log.d("Deepak-->","Deepak-->")
    }
}