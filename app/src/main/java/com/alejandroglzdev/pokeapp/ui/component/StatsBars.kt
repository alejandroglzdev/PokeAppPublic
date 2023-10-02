package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.core.PokemonStats

@Composable
fun StatsBars(){
    Column {
        StatsBarsItem(value = 40 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStats.HP )
        StatsBarsItem(value = 50 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStats.ATK  )
        StatsBarsItem(value = 90 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStats.SPATK  )
        StatsBarsItem(value = 20 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStats.DEF  )
        StatsBarsItem(value = 30 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStats.SPDEF  )
        StatsBarsItem(value = 25 /* Aqui tendria que ir el valor del modelo de datos */ , pokemonStat = PokemonStats.SPEED  )
    }

}

@Preview
@Composable
fun StatsBarsPreview() {
    StatsBars()
}