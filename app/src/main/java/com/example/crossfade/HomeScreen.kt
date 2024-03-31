package com.example.crossfade

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(){
    
    Column {
        Text(text = "First Screen")
        Button(onClick = {
            AppRouter.navigateTo(screen.SecondScreen)
        }) {
            Text(text = "SecondScreen")
        }
    }
    }
    
    
  