package com.example.dipractice.di

import android.util.Log
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
/*
class implement @Inject constructor() : one{
   /* override fun getname() {
        Log.d("Interface injectionn","Interface Injection")
    }

    */

}
class main @Inject constructor(private val one: one)
{
    fun getname()
    {
        one.getname()
    }
}

/*@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    fun binding() : one=implement()
}

interface one {
    fun getname()
}

 */
*/