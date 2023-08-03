package com.alejandroglzdev.pokeapp.ui.component.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alejandroglzdev.pokeapp.data.model.Paginable
import com.alejandroglzdev.pokeapp.ui.component.HomeScreen
import com.alejandroglzdev.pokeapp.ui.component.presentation.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity(), Paginable {
    private val pokemonViewModel : PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pokemonViewModel.onCreate()
            setContent{
                HomeScreen(pokemonViewModel, this)
            }

    }

    @Preview
    @Composable
    fun Preview(){
        //HomeScreen(pokemonViewModel.pokemonModel.value?.toList() ?: emptyList())
    }

    //TODO: Mirar si es correcto hacer el override aqui
    override fun paginate(lastItemIndex: Int) {
        pokemonViewModel.update(lastItemIndex)
    }
}
