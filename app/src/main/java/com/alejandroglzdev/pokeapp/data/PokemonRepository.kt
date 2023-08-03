package com.alejandroglzdev.pokeapp.data

import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider
import com.alejandroglzdev.pokeapp.data.model.PokemonService
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val api: PokemonService,
    private val pokemonProvider: PokemonProvider
    ){

    suspend fun getPokemonList(limit: Int, offset: Int): List<PokemonModel> {
        val response = api.getPokemonList(limit,offset)
        pokemonProvider.pokemon = response
        return response
    }
}