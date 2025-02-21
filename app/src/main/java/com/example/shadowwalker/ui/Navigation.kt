package com.example.shadowwalker.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shadowwalker.ui.Screens.SetUpScreen

@Composable
fun Navigation(
    paddingValues: PaddingValues,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController,
        startDestination = Screen.SetUpScreen.route,
        modifier = Modifier.padding(paddingValues)
    ){
        composable(Screen.SetUpScreen.route) {
            SetUpScreen()
        }
    }
}