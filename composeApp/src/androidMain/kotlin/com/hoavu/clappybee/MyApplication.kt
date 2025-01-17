package com.hoavu.clappybee

import android.app.Application
import com.hoavu.clappybee.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin {
            androidContext(this@MyApplication)
        }
    }
}