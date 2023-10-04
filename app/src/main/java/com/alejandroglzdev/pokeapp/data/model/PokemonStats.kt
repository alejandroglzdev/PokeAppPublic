package com.alejandroglzdev.pokeapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonStats(
    @SerializedName("base_stat") val base_stat: Int,
    @SerializedName("effort") val effort: Int,
    @SerializedName("stat") val stat: PokemonStatDetail
) : Parcelable
