package com.alejandroglzdev.pokeapp.data.network

import com.alejandroglzdev.pokeapp.data.model.PokemonCount
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiClient {
    @GET("pokemon")
    suspend fun getAllPokemonsCount():Response<PokemonCount>

    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path("id") id: Int): Response<PokemonModel>
}