package com.alejandroglzdev.pokeapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonTypeDetail(
    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String?
) : Parcelable
