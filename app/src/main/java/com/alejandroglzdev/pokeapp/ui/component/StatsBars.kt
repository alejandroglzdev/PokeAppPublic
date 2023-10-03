package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.core.PokemonStatsEnum

@Composable
fun StatsBars(){
    Column {
        StatsBarsItem(value = 40 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStatsEnum.HP )
        StatsBarsItem(value = 50 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStatsEnum.ATK  )
        StatsBarsItem(value = 90 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStatsEnum.SPATK  )
        StatsBarsItem(value = 20 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStatsEnum.DEF  )
        StatsBarsItem(value = 30 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStatsEnum.SPDEF  )
        StatsBarsItem(value = 25 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStatsEnum.SPEED  )
    }

}

@Preview
@Composable
fun StatsBarsPreview() {
    StatsBars()
}