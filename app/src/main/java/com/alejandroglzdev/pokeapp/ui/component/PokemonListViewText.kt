package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun PokemonListViewText(data: String, textAlign: TextAlign? = TextAlign.Left) {
    Text(text = data,
    modifier = Modifier.fillMaxWidth(),
    textAlign = textAlign)
}