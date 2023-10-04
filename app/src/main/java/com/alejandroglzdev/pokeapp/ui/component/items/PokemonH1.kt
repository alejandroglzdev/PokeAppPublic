package com.alejandroglzdev.pokeapp.ui.component.items

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun PokemonH1(text: String, fontSize: Int = 24) {
    Text(
        text = text,
        fontSize = fontSize.sp,
        style = MaterialTheme.typography.h1,
        fontWeight = FontWeight.SemiBold
    )

}