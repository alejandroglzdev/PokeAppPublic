package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PokemonH2(text: String, fontSize: Int = 12, verticalPadding: Int = 0, horizontalPadding: Int = 0, textAlign: TextAlign = TextAlign.Start) {
    Text(
        text = text,
        fontSize = fontSize.sp,
        style = MaterialTheme.typography.h2,
        color = Color.Black,
        textAlign = textAlign,
        modifier = Modifier.padding(vertical = verticalPadding.dp, horizontal = horizontalPadding.dp)
    )
}