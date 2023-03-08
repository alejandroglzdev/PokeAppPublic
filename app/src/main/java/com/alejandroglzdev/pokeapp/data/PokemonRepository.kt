package com.alejandroglzdev.pokeapp.data

import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider
import com.alejandroglzdev.pokeapp.data.model.PokemonService

class PokemonRepository {

    private val api = PokemonService()

    suspend fun getTenPokemon(): List<PokemonModel> {
        val response = api.getTenPokemons()
        PokemonProvider.pokemon = response
        return response
    }
}