package com.example.ambatik.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ambatik.ui.screen.articel.ArticelScreen
import com.example.ambatik.ui.screen.welcome.AmbatikApp
import com.example.ambatik.ui.screen.home.HomeScreen
import com.example.ambatik.ui.screen.login.LoginScreen
import com.example.ambatik.ui.screen.profile.ProfileScreen
import com.example.ambatik.ui.screen.quiz.QuizScreen
import com.example.ambatik.ui.screen.register.RegisterScreen
import com.example.ambatik.ui.screen.scan.ScanScreen
import com.example.ambatik.ui.screen.shopping.ShoppingScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = ScreenLandingPage.Welcome.route,
    ){
        composable(ScreenLandingPage.Welcome.route){
            AmbatikApp(navController = navController)
        }
        composable(ScreenLandingPage.Login.route){
            LoginScreen(navController = navController)
        }
        composable(ScreenLandingPage.Register.route){
            RegisterScreen(navController = navController)
        }
        composable(ScreenLandingPage.Home.route){
            HomeScreen()
        }
    }
}