package com.alejandroglzdev.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonFlavorTextEntries(
    @SerializedName("flavor_text_entries") val flavorTextEntries: List<PokemonFlavorText>
)
