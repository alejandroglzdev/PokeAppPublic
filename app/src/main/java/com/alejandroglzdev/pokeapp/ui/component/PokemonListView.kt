package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alejandroglzdev.pokeapp.R

@Composable
fun PokemonListView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PokemonImage(image = R.drawable.ic_launcher_foreground, 10.dp)
        PokemonListViewText("#100", textAlign = TextAlign.Center)
        PokemonListViewText("PokemonName", textAlign = TextAlign.Center)
    }

}

@Preview
@Composable
fun PreviewListView() {
    PokemonListView()
}

