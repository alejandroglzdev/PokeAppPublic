package com.alejandroglzdev.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonModel (@SerializedName("name")val pokemonName: String, @SerializedName("id")val pokedexNumber: String)