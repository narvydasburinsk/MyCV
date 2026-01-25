package com.productivity.thewebcv

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
