package com.alejandroglzdev.pokeapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonType(
    @SerializedName("slot") val slot: Long,
    @SerializedName("type") val typeDetail: PokemonTypeDetail
) : Parcelable