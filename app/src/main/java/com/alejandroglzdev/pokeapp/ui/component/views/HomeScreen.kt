package com.alejandroglzdev.pokeapp.ui.component.views

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alejandroglzdev.pokeapp.data.model.Paginable
import com.alejandroglzdev.pokeapp.ui.component.items.AdmobBanner
import com.alejandroglzdev.pokeapp.ui.component.items.TopAppBar
import com.alejandroglzdev.pokeapp.ui.component.presentation.viewmodel.PokemonViewModel

@Composable
fun HomeScreen(viewModel: PokemonViewModel, viewDelegate: Paginable, navController: NavController) {
    val items by viewModel.items.observeAsState()
    Scaffold(topBar = { TopAppBar() }, bottomBar = { AdmobBanner(padding = 10.dp) }) { padding ->
        PokemonList(items, viewDelegate, navController)

    }
}