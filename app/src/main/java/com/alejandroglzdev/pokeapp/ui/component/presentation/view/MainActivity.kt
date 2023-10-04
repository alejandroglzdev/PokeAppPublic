package com.alejandroglzdev.pokeapp.ui.component.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.alejandroglzdev.pokeapp.data.model.Paginable
import com.alejandroglzdev.pokeapp.navigation.AppNavigation
import com.alejandroglzdev.pokeapp.ui.component.presentation.viewmodel.PokemonViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity(), Paginable {
    private val pokemonViewModel : PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pokemonViewModel.onCreate()
            setContent{
                AppNavigation(pokemonViewModel, this)
            }

    }

    override fun paginate(lastItemIndex: Int) {
        pokemonViewModel.update(lastItemIndex)
    }
}
