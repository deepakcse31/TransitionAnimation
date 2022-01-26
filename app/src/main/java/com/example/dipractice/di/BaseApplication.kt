package com.example.dipractice.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//this is parent class this provide dependency to activity and fragment
@HiltAndroidApp
class BaseApplication : Application() {
}