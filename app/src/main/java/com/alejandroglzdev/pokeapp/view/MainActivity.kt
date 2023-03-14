package com.alejandroglzdev.pokeapp.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.ui.component.HomeScreen
import com.alejandroglzdev.pokeapp.viewmodel.PokemonViewModel

class MainActivity : ComponentActivity() {
    private val pokemonViewModel : PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pokemonViewModel.onCreate()
            setContent{
                HomeScreen(pokemonViewModel)
            }

    }

    @Preview
    @Composable
    fun Preview(){
        //HomeScreen(pokemonViewModel.pokemonModel.value?.toList() ?: emptyList())
    }
}