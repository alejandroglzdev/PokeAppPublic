package com.alejandroglzdev.pokeapp.data

import com.alejandroglzdev.pokeapp.data.database.dao.PokemonDao
import com.alejandroglzdev.pokeapp.data.database.entities.PokemonEntity
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonProvider
import com.alejandroglzdev.pokeapp.data.model.PokemonService
import com.alejandroglzdev.pokeapp.domain.model.Pokemon
import com.alejandroglzdev.pokeapp.domain.model.toDomain
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val api: PokemonService,
    private val pokemonDao: PokemonDao
    ){

    suspend fun getPokemonListFromApi(limit: Int, offset: Int): List<Pokemon> {
        val response = api.getPokemonList(limit,offset)
        return response.map { it.toDomain() }
    }

    suspend fun getPokemonListFromDatabase(limit: Int, offset: Int): List<Pokemon> {
        val response = pokemonDao.getAllPokemons()
        return response.map { it.toDomain() }
    }

    suspend fun insertPokemons(pokemons: List<PokemonEntity>) {
        pokemonDao.insertAll(pokemons = pokemons)
    }

    suspend fun clearPokemons() {
        pokemonDao.deleteAllPokemons()
    }
}