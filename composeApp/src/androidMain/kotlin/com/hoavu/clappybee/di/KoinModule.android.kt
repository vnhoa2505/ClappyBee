package com.hoavu.clappybee.di

import com.hoavu.clappybee.domain.AudioPlayer
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual val targetModule: Module = module {
    single<AudioPlayer> { AudioPlayer(context = androidContext()) }
}