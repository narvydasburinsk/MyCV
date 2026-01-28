package com.productivity.thewebcv
import com.productivity.thewebcv.Imports.*

class JsPlatform: Platform {
    override val name: String = "Web with Kotlin/JS"
}

actual fun getPlatform(): Platform = JsPlatform()
