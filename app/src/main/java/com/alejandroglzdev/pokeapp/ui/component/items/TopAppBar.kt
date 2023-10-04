package com.alejandroglzdev.pokeapp.ui.component.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alejandroglzdev.pokeapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    CenterAlignedTopAppBar(
        title = { TitleTopAppBar() },
    )
}

@Composable
fun TitleTopAppBar() {
    Row {
        PokemonH1(text = "PokeApp")
        Image(
            painter = painterResource(id = R.drawable.ic_poke_ball),
            contentDescription = "PokeBall",
            alignment = Alignment.Center,
            modifier = Modifier.size(32.dp, 32.dp).padding(start = 5.dp)
        )
    }
}