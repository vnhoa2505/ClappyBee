package com.hoavu.clappybee

import androidx.compose.ui.window.ComposeUIViewController
import com.hoavu.clappybee.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }