package com.alejandroglzdev.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonFlavorText(
    @SerializedName("flavor_text") val flavorText: String
)
