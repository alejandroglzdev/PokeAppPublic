package com.alejandroglzdev.pokeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider

class PokemonViewModel : ViewModel(){
    val pokemonModel = MutableLiveData<PokemonModel>()

    fun randomPokemon(){
        val currentPokemon = PokemonProvider.random()
        pokemonModel.postValue(currentPokemon)
    }
}