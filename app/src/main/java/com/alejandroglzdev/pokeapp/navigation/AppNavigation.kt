package com.alejandroglzdev.pokeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alejandroglzdev.pokeapp.ui.component.HomeScreen
import com.alejandroglzdev.pokeapp.ui.component.SplashScreen
import com.alejandroglzdev.pokeapp.ui.component.presentation.view.MainActivity
import com.alejandroglzdev.pokeapp.ui.component.presentation.viewmodel.PokemonViewModel

@Composable
fun AppNavigation(pokemonViewModel: PokemonViewModel, viewDelegate: MainActivity) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.SplasScreen.route)
    {
        composable(AppScreens.SplasScreen.route) {
            SplashScreen(navController)
        }
        composable(AppScreens.HomeScreen.route) {
            HomeScreen(pokemonViewModel,viewDelegate)
        }

    }
}