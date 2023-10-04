package com.alejandroglzdev.pokeapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PokemonSprite(@SerializedName("front_default") val frontDefault: String) : Parcelable
