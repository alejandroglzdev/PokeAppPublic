package com.alejandroglzdev.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("name") val pokemonName: String,
    @SerializedName("id") val pokedexNumber: String,
    @SerializedName("height") val pokemonHeight: Int,
    @SerializedName("weight") val pokemonWeight: Int,
    @SerializedName("sprites") val sprites: PokemonSprite,
    @SerializedName("types") val types: List<PokemonType>,
    @SerializedName("stats") val stats: List<PokemonStats>,
    val flavorText: String?
)