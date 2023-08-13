package com.alejandroglzdev.pokeapp.data.network

import com.alejandroglzdev.pokeapp.data.model.PokemonCount
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface PokemonApiClient {
    @GET("pokemon")
    suspend fun getAllPokemonsCount():Response<PokemonCount>

    @GET("pokemon/{id}")
    suspend fun getPokemon(@Path("id") id: Int): Response<PokemonModel>
}