package com.alejandroglzdev.pokeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider

class PokemonViewModel : ViewModel(){
    //Creamos un mutableLiveData, donde le pasaremos el arrayList(metodo postValue), gracias al provider
    val pokemonModel = PokemonProvider.getPokemonList()

    /*
    fun getPokemonList(){
        val currentPokemon = PokemonProvider.getPokemonList()
        pokemonModel.postValue(currentPokemon)
    }
     */
}