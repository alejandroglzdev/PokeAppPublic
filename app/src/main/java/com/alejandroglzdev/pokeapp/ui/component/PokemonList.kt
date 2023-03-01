package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun PokemonList(pokemonList: List<String>) {
    LazyColumn{
        items(pokemonList) { pokemon ->
            PokemonListView(pokemonImage = , pokedexNumber = , pokemonName = )
        }
    }

}