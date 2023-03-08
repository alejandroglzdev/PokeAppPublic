package com.alejandroglzdev.pokeapp.domain

import com.alejandroglzdev.pokeapp.data.PokemonRepository
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

class GetPokemonsUseCase {
    private val repository = PokemonRepository()

    suspend operator fun invoke(): List<PokemonModel> = repository.getTenPokemon()

}