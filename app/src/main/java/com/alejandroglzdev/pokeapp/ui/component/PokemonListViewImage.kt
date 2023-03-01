package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun PokemonImage(image: Int, paddingBottom: Dp = 0.dp) {
    Image(painter = painterResource(id = image),
        contentDescription = "An image of a Pokémon",
        contentScale = ContentScale.Fit,
        modifier = Modifier.padding(bottom = paddingBottom))

}