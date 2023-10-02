package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
        PokemonH2(text = pokemonStat.description, fontSize = 12)

        Row(verticalAlignment = Alignment.CenterVertically) {
            when (pokemonStat) {
                PokemonStats.ATK -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFFFFA500),
                    modifier = Modifier.height(5.dp)
                )

                PokemonStats.HP -> LinearProgressIndicator(
                    value / limit,
                    color = Color.Red,
                    modifier = Modifier.height(5.dp)
                )

                PokemonStats.DEF -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFF8B6969),
                    modifier = Modifier.height(5.dp)
                )

                PokemonStats.SPEED -> LinearProgressIndicator(
                    value / limit,
                    color = Color.Green,
                    modifier = Modifier.height(5.dp)
                )

                PokemonStats.SPATK -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFF800080),
                    modifier = Modifier.height(5.dp)
                )

                PokemonStats.SPDEF -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFFADD8E6),
                    modifier = Modifier.height(5.dp)
                )

            }

            PokemonH2(
                text = value.toString(), horizontalPadding = 5,
                fontSize = 14

            )
        }

    }

}

@Preview
@Composable
fun StatsBarsItems() {
    StatsBarsItem(40, PokemonStats.ATK)
}