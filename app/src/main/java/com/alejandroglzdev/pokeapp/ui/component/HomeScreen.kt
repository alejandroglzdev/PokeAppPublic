package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.alejandroglzdev.pokeapp.data.model.Paginable
import com.alejandroglzdev.pokeapp.ui.component.presentation.viewmodel.PokemonViewModel

@Composable
fun HomeScreen(viewModel: PokemonViewModel, viewDelegate: Paginable) {
    val items by viewModel.items.observeAsState()

    PokemonList(items, viewDelegate)
}