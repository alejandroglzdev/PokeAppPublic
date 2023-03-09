package com.alejandroglzdev.pokeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.domain.GetPokemonsUseCase
import kotlinx.coroutines.launch

class PokemonViewModel : ViewModel(){
    var getPokemonsUseCase = GetPokemonsUseCase()
    val items  = MutableLiveData<List<PokemonModel>>()
    fun onCreate() {
        viewModelScope.launch {
            val result = getPokemonsUseCase()

            if(!result.isNullOrEmpty()) {
                items.postValue(result)
            }
        }
    }
}