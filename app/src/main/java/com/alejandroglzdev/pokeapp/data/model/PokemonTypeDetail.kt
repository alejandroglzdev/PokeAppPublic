package com.alejandroglzdev.pokeapp.data.model

import com.google.gson.annotations.SerializedName

data class PokemonTypeDetail(
    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?
)
