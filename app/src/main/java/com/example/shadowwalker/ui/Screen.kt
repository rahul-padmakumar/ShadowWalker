package com.example.shadowwalker.ui

sealed class Screen(
    val route: String
){
    data object SetUpScreen: Screen("set_up_screen")
}