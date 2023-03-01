package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

@Composable
fun HomeScreen(pokemonList: List<PokemonModel>) {
    PokemonList(pokemonList)

}