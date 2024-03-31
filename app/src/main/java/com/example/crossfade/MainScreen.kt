package com.example.crossfade

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MainScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color =  Color.White
    ) {
        Crossfade(targetState = AppRouter.currentScreen, label = "") { currentState ->

            when(currentState.value) {
                is screen.HomeScreen -> {
                    HomeScreen()
                }

                is screen.SecondScreen -> {
                    SecondScreen()
                }


            }



        }
    }
}