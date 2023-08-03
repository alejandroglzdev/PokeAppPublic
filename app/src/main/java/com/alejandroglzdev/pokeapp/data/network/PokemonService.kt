package com.alejandroglzdev.pokeapp.data.model

import com.alejandroglzdev.pokeapp.core.RetrofitHelper
import com.alejandroglzdev.pokeapp.data.network.PokemonApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PokemonService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getPokemonCount(): PokemonCount? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(PokemonApiClient::class.java).getAllPokemonsCount()
            response.body()
        }

    }

    suspend fun getPokemonList(limit: Int, offSet: Int): MutableList<PokemonModel> {
        return withContext(Dispatchers.IO){
            val pokemons = mutableListOf<PokemonModel>()

            for (i in offSet..limit) {
                val response = retrofit.create(PokemonApiClient::class.java).getPokemon(i)
                val pokemonResponse = response.body()

                if (pokemonResponse != null) {
                    pokemons.add(pokemonResponse)
                }
            }
            pokemons

        }

    }
}