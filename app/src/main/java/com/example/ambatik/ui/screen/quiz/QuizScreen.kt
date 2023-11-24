package com.example.ambatik.ui.screen.quiz

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun QuizScreen(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
){
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Quiz Screen",
            color = Color.White
        )
    }
}

