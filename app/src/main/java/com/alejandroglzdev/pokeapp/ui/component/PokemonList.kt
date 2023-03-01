package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

@Composable
fun PokemonList(pokemonList: List<PokemonModel>) {
    LazyColumn{
        items(pokemonList) { pokemon ->
            PokemonListView(pokemon)
        }
    }

}