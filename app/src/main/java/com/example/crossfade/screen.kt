package com.example.crossfade

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class screen{
    object HomeScreen: screen()
    object SecondScreen : screen()
}


object AppRouter {
    val currentScreen : MutableState<screen>  = mutableStateOf(screen.HomeScreen)

    fun navigateTo(destination : screen){
        currentScreen.value = destination
    }


}
