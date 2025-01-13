package com.hoavu.clappybee.util

enum class Platform {
    Android,
    IOS,
    Desktop,
    Web
}

expect fun getPlatform(): Platform