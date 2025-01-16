package com.hoavu.clappybee

import android.app.Application
import com.hoavu.clappybee.di.initializeKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }
}