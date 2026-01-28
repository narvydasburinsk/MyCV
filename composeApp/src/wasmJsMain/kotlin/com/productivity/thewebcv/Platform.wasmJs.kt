package com.productivity.thewebcv
import com.productivity.thewebcv.Imports.*

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()
