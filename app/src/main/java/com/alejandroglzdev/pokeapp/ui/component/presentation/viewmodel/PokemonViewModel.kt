package com.alejandroglzdev.pokeapp.ui.component.presentation.viewmodel

import androidx.compose.ui.text.capitalize
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.viewModelScope
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.domain.GetPokemonsUseCase
import com.alejandroglzdev.pokeapp.domain.model.Pokemon
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    val getPokemonsUseCase: GetPokemonsUseCase
) : ViewModel() {

    val items = MutableLiveData<List<Pokemon>>()
    fun onCreate() {
        viewModelScope.launch {
            val result = getPokemonsUseCase(20, 1)
            val pokemonsCapitalized = capitalize(result)

            if (!pokemonsCapitalized.isNullOrEmpty()) {
                items.postValue(pokemonsCapitalized)
            }
        }
    }

    fun update(lastItemIndex: Int) {
        viewModelScope.launch {
            val result = getPokemonsUseCase(limit = lastItemIndex + 20, offSet = lastItemIndex)
            val pokemonsCapitalized = capitalize(result)

            if (!pokemonsCapitalized.isNullOrEmpty()) {
                items.value?.let { currentList ->
                    val updatedList = currentList + pokemonsCapitalized


                    items.postValue(updatedList.distinctBy { it.pokedexNumber })
                }
            }
        }
    }

    fun capitalize(pokemons: List<Pokemon>): List<Pokemon> {
        var newList : MutableList<Pokemon> = mutableListOf()

        for(pokemon in pokemons) {
            var newPokemon = Pokemon(
                pokemonName = pokemon.pokemonName.replaceFirstChar(Char::titlecase),
                pokedexNumber = pokemon.pokedexNumber,
                sprites = pokemon.sprites)

            newList.add(newPokemon)
        }

        return newList
    }

}