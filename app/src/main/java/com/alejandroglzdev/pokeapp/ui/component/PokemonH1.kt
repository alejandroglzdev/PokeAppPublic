package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun PokemonH1(text: String) {
    Text(
        text = text,
        fontSize = 24.sp,
        style = MaterialTheme.typography.h1,
        fontWeight = FontWeight.SemiBold
    )

}