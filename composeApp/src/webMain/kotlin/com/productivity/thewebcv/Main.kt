package com.productivity.thewebcv

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import org.jetbrains.compose.resources.painterResource
import com.productivity.thewebcv.Imports.Utils.*
import com.productivity.thewebcv.Imports.*
import com.productivity.thewebcv.*
import thewebcv.composeapp.generated.resources.Res
import thewebcv.composeapp.generated.resources.compose_multiplatform

@Composable
fun <T> r(value: T) = remember { mutableStateOf(value) }
val no = false
val yes = true
typealias Mod = Modifier
typealias ui = @Composable () -> Unit
typealias ui_<T> = @Composable (T) -> Unit


fun Mod.maxS() = fillMaxSize()
fun Mod.maxW() = fillMaxWidth()
fun Mod.maxH() = fillMaxHeight()

@Composable
fun Btn(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(text)
    }
}



@Composable
fun App() {
    MaterialTheme {
        Column(
            Mod.maxS(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me I AM A SECRET BUTTON!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}
