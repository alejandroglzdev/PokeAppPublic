package com.alejandroglzdev.pokeapp.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.ui.component.HomeScreen
import com.alejandroglzdev.pokeapp.ui.theme.PokeAppTheme
import com.alejandroglzdev.pokeapp.viewmodel.PokemonViewModel

class MainActivity : ComponentActivity() {
    private val pokemonViewModel : PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            HomeScreen(pokemonViewModel.pokemonModel)
        }

    }

    @Preview
    @Composable
    fun Preview(){
        HomeScreen(pokemonViewModel.pokemonModel)
    }
}