import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource

import thewebcv.composeapp.generated.resources.Res
import thewebcv.composeapp.generated.resources.compose_multiplatform


var CardColor = Color(0xFF1A1A1A)
var InputColor = Color(0xFF272727)
val DarkBlue = Color(0xFF00008B) 
val Gold = Color(0xFFFFD700)
val LightBlue = Color(0xFFADD8E6)
val darkGreen = Color(0xFF0A1F0D)


val gson = Gson()
val yes = true
val no = false
var <T> m_<T>.it: T
    get() = this.value
    set(value) { this.value = value }


fun <T> m(value: T) = mutableStateOf(value)
fun <T> set(state: m_<T>?, value: T) { state?.value = value }
fun show(state: m_<Bool>?) = set(state, yes)
fun hide(state: m_<Bool>?) = set(state, no)
fun Id(): Str { return UUID.randomUUID().toString() }

val maxInt = Int.MAX_VALUE

typealias Web = WebView
typealias ctx = Context

typealias Str = String
typealias Bool = Boolean

typealias Do = () -> Unit
typealias DoStr = (Str) -> Unit     
typealias DoInt = (Int) -> Unit 
typealias DoBool = (Bool) -> Unit 
typealias Do_<T> = (T) -> Unit
typealias Do2_<A, B> = (A, B) -> Unit

typealias Wait = suspend () -> Unit
typealias Wait_<T> = suspend (T) -> Unit

typealias m_<T> = MutableState<T>
typealias mBool= m_<Bool>
typealias mInt= m_<Int>
typealias mStr= m_<Str>
	
typealias mList<T> = MutableList<T>

typealias Content = @Composable () -> Unit
typealias Content_<T> = @Composable (T) -> Unit
typealias UI = @Composable () -> Unit
typealias UI_<T> = @Composable (T) -> Unit
typealias ui = @Composable () -> Unit
typealias ui_<T> = @Composable (T) -> Unit
typealias uiRow = @Composable RowScope.() -> Unit


	


@Composable
fun <T> r(x: () -> T) = remember { x() }
@Composable
fun <T> r_m(x: T) = r { m(x) }
@Composable
fun <T> r(x: T) = r_m(x)




