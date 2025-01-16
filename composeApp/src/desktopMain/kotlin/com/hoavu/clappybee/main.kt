package com.hoavu.clappybee

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hoavu.clappybee.di.initializeKoin

fun main() = application {
    initializeKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "ClappyBee",
    ) {
        App()
    }
}