package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.runtime.Composable
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

@Composable
fun HomeScreen(pokemonList: List<PokemonModel>) {
    PokemonList(pokemonList)

}