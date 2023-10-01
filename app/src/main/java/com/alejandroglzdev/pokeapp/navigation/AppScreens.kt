package com.alejandroglzdev.pokeapp.navigation

sealed class AppScreens (val route:String) {
    object SplasScreen: AppScreens("splash_screen")
    object HomeScreen: AppScreens("home_screen")
}