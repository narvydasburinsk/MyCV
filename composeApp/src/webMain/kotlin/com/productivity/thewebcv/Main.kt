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


val black = Color.Black


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
    text: Str,
    onClick: Do
) {
    Button(onClick = onClick) {
        Text(text)
    }
}
@Composable
fun Btn(
    text: ui,
    onClick: Do
) {
    Button(onClick = onClick) {
        text()
    }
}

@Composable
fun LazzyRow(
    mod: Mod = Mod,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = mod,
        verticalAlignment = Alignment.CenterVertically,
        content = content
    )
}

@Composable
fun LazyScreen(ui: ui){
    Column(
        Mod.maxS().background(black),
        horizontalAlignment = Alignment.CenterHorizontally,   
    ) {
        ui()
    }
}




@Composable
fun App() {
    MaterialTheme {
        LazyScreen {
            LazzyRow {
                Text("Header")
            }
            
            

            
        }
    }
}








