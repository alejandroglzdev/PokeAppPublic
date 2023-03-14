package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.alejandroglzdev.pokeapp.viewmodel.PokemonViewModel

@Composable
fun HomeScreen(viewModel: PokemonViewModel) {
    val items by viewModel.items.observeAsState()

    PokemonList(items)
}