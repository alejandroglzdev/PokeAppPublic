package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

@Composable
fun PokemonList(pokemonList: List<PokemonModel>?) {
    if (pokemonList != null) {
        LazyColumn {
            items(pokemonList) { pokemon ->
                PokemonListView(pokemon)
            }
        }
    }

}

@Preview
@Composable
fun PreviewList() {

}