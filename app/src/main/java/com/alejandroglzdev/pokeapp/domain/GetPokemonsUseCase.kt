package com.alejandroglzdev.pokeapp.domain

import com.alejandroglzdev.pokeapp.data.PokemonRepository
import com.alejandroglzdev.pokeapp.data.database.entities.toDatabase
import com.alejandroglzdev.pokeapp.domain.model.Pokemon
import javax.inject.Inject

class GetPokemonsUseCase @Inject constructor(
    private val repository: PokemonRepository
    ) {

    suspend operator fun invoke(limit: Int, offSet: Int): List<Pokemon> {
        val pokemons = repository.getPokemonListFromApi(limit = limit, offset = offSet)

        return if (pokemons.isNotEmpty()) {
            //repository.clearPokemons()
            repository.insertPokemons(pokemons = pokemons.map { it.toDatabase() })
            pokemons
        }else {
            repository.getPokemonListFromDatabase(limit = limit, offset = offSet)

        }

    }

}