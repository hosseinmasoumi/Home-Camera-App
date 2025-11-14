package com.example.cctvguard.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SocialDesignApp() {
    val navController = rememberNavController()
    Scaffold(
//        topBar = { TopNavBar() },
        modifier = Modifier.fillMaxSize(),
//        bottomBar = { BottomNavigationBar(navController) }
    )
    { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
        {

            NavHost(navController = navController, startDestination = "Splash") {
                composable("Splash") { SplashScreen(navController) }
                composable("Login") { LoginScreen(navController) }

            }
        }
    }
}