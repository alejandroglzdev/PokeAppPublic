package com.alejandroglzdev.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonType(
    @SerializedName("slot") val slot: Long,
    @SerializedName("type") val typeDetail: PokemonTypeDetail
)