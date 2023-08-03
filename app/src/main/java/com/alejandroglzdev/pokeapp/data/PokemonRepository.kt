package com.alejandroglzdev.pokeapp.data

import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider
import com.alejandroglzdev.pokeapp.data.model.PokemonService

class PokemonRepository {

    private val api = PokemonService()

    suspend fun getPokemonList(limit: Int, offset: Int): List<PokemonModel> {
        val response = api.getPokemonList(limit,offset)
        PokemonProvider.pokemon = response
        return response
    }
}