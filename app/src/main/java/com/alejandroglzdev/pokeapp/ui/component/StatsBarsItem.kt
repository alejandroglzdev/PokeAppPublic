package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandroglzdev.pokeapp.core.PokemonStats

@Composable
fun StatsBarsItem(value: Int, pokemonStat: PokemonStats) {
    val limit = 255f
    Column(
    ) {
        Text(
            text = pokemonStat.description, fontSize = 12.sp,
            style = MaterialTheme.typography.h2,
            color = Color.Black
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            when(pokemonStat){
                PokemonStats.ATK -> LinearProgressIndicator(value / limit, color = Color(0xFFFFA500))
                PokemonStats.HP -> LinearProgressIndicator(value / limit, color = Color.Red)
                PokemonStats.DEF -> LinearProgressIndicator(value / limit, color = Color(0xFF8B6969))
                PokemonStats.SPEED -> LinearProgressIndicator(value / limit, color = Color.Green)
                PokemonStats.SPATK -> LinearProgressIndicator(value / limit, color = Color(0xFF800080))
                PokemonStats.SPDEF -> LinearProgressIndicator(value / limit, color = Color(0xFFADD8E6))

            }

            Text(
                text = value.toString(), Modifier.padding(start = 5.dp),
                fontSize = 12.sp,
                style = MaterialTheme.typography.h2,
                color = Color.Black
            )
        }

    }

}

@Preview
@Composable
fun StatsBarsItems() {
    StatsBarsItem(40, PokemonStats.ATK)
}