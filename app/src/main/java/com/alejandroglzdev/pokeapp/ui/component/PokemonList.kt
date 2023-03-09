package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alejandroglzdev.pokeapp.R
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider

@Composable
fun PokemonList(pokemonList: List<PokemonModel>?) {
    if (pokemonList != null) {
        LazyColumn {
            items(pokemonList) { pokemon ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PokemonImage(image = R.drawable.ic_launcher_foreground,
                        10.dp)
                    PokemonListViewText(pokemon.pokedexNumber,
                        textAlign = TextAlign.Center,
                        )
                    PokemonListViewText(pokemon.pokemonName, textAlign = TextAlign.Center)
                }
            }
        }
    }

}

@Preview
@Composable
fun PreviewList() {

}