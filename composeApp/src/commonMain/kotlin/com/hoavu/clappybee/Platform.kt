package com.hoavu.clappybee

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform