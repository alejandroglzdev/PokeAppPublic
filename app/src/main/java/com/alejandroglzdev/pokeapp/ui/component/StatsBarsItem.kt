package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alejandroglzdev.pokeapp.core.PokemonStatsEnum
import com.alejandroglzdev.pokeapp.core.extensions.normalizeStatsName

@Composable
fun StatsBarsItem(value: Int, pokemonStat: PokemonStatsEnum) {
    val limit = 255f
    Column(
    ) {
        PokemonH2(text = pokemonStat.description.normalizeStatsName(), fontSize = 12)

        Row(verticalAlignment = Alignment.CenterVertically) {
            when (pokemonStat) {
                PokemonStatsEnum.ATK -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFFFFA500),
                    modifier = Modifier.height(5.dp)
                )

                PokemonStatsEnum.HP -> LinearProgressIndicator(
                    value / limit,
                    color = Color.Red,
                    modifier = Modifier.height(5.dp)
                )

                PokemonStatsEnum.DEF -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFF8B6969),
                    modifier = Modifier.height(5.dp)
                )

                PokemonStatsEnum.SPEED -> LinearProgressIndicator(
                    value / limit,
                    color = Color.Green,
                    modifier = Modifier.height(5.dp)
                )

                PokemonStatsEnum.SPATK -> LinearProgressIndicator(
                    value / limit,
                    color = Color(0xFF800080),
                    modifier = Modifier.height(5.dp)
                )

                PokemonStatsEnum.SPDEF -> LinearProgressIndicator(
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
    StatsBarsItem(40, PokemonStatsEnum.ATK)
}