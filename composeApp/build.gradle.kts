import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
    
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        binaries.executable()
    }
    
    sourceSets {

       val jsMain by getting {
            dependencies {
                implementation("org.jetbrains.compose.html:html-core:1.9.3")  // matches CMP version
                implementation("org.jetbrains.compose.html:html-css:1.9.3")   // matches CMP version      
                implementation(compose.runtime)      
            }
        }
        val wasmJsMain by getting {
            dependencies {
                implementation("org.jetbrains.compose.html:html-core:1.9.3")  // matches CMP version
                implementation("org.jetbrains.compose.html:html-css:1.9.3")   // matches CMP version      
                implementation(compose.runtime)
            }
        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}










