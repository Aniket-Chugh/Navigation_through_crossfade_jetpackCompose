package com.example.crossfade

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SecondScreen(){
    Button(onClick = {
        AppRouter.navigateTo(screen.HomeScreen)
    }) {
        Text(text = " Go to First Screen :)")
    }
}