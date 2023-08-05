package com.alejandroglzdev.pokeapp.data.model

import com.alejandroglzdev.pokeapp.data.network.PokemonApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PokemonService @Inject constructor(private val api: PokemonApiClient) {
    suspend fun getPokemonCount(): PokemonCount? {
        return withContext(Dispatchers.IO) {
            val response = api.getAllPokemonsCount()
            response.body()
        }

    }

    suspend fun getPokemonList(limit: Int, offSet: Int): MutableList<PokemonModel> {
        return withContext(Dispatchers.IO){
            val pokemons = mutableListOf<PokemonModel>()

            for (i in offSet..limit) {
                try {
                    val response = api.getPokemon(i)
                    val pokemonResponse = response.body()

                    if (pokemonResponse != null) {
                        pokemons.add(pokemonResponse)
                    }
                } catch (ex: Exception) {
                    println("response exception - ${ex.localizedMessage}")
                }
            }
            pokemons

        }

    }
}