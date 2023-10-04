package com.alejandroglzdev.pokeapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonStatDetail(
    @SerializedName("name") val name: String
) : Parcelable
