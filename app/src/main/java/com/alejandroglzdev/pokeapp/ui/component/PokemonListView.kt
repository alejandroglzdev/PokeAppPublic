package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.*
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
fun PokemonListView(pokemonModel: PokemonModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PokemonImage(image = R.drawable.ic_launcher_foreground, 10.dp)
        PokemonListViewText(pokemonModel.pokedexNumber, textAlign = TextAlign.Center)
        PokemonListViewText(pokemonModel.pokemonName, textAlign = TextAlign.Center)
    }

}

@Preview
@Composable
fun PreviewListView() {
    //PokemonListView(PokemonProvider.getPokemonList()[1])
}

