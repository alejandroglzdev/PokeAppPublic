package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandroglzdev.pokeapp.core.extensions.capitalizeFirst

@Composable
fun PokemonH2(text: String) {
    Text(
        text = text.capitalizeFirst(),
        fontSize = 12.sp,
        style = MaterialTheme.typography.h2,
        color = Color.Black,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    )
}