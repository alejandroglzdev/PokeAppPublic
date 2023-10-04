package com.alejandroglzdev.pokeapp.ui.component.views

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.core.PokemonStatsEnum
import com.alejandroglzdev.pokeapp.domain.model.Pokemon
import com.alejandroglzdev.pokeapp.ui.component.items.StatsBarsItem

@Composable
fun StatsBars(pokemon: Pokemon) {
    Column {
        pokemon.stats.forEach { stats ->
            when (stats.stat.name) {
                PokemonStatsEnum.ATK.description -> StatsBarsItem(
                    value = stats.base_stat,
                    pokemonStat = PokemonStatsEnum.ATK
                )

                PokemonStatsEnum.HP.description -> StatsBarsItem(
                    value = stats.base_stat,
                    pokemonStat = PokemonStatsEnum.HP
                )

                PokemonStatsEnum.DEF.description -> StatsBarsItem(
                    value = stats.base_stat,
                    pokemonStat = PokemonStatsEnum.DEF
                )

                PokemonStatsEnum.SPATK.description -> StatsBarsItem(
                    value = stats.base_stat,
                    pokemonStat = PokemonStatsEnum.SPATK
                )

                PokemonStatsEnum.SPDEF.description -> StatsBarsItem(
                    value = stats.base_stat,
                    pokemonStat = PokemonStatsEnum.SPDEF
                )

                PokemonStatsEnum.SPEED.description -> StatsBarsItem(
                    value = stats.base_stat,
                    pokemonStat = PokemonStatsEnum.SPEED
                )
            }
        }

    }

}

@Preview
@Composable
fun StatsBarsPreview() {
    //StatsBars()
}