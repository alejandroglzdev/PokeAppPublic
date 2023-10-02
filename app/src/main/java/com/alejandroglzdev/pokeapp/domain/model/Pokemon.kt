package com.alejandroglzdev.pokeapp.domain.model

import android.os.Parcelable
import com.alejandroglzdev.pokeapp.data.database.entities.PokemonEntity
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite
import com.alejandroglzdev.pokeapp.data.model.PokemonType
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pokemon(
    val pokemonName: String,
    val pokedexNumber: String,
    val height: Int,
    val weight: Int,
    val sprites: PokemonSprite,
    val types: List<PokemonType>
) : Parcelable

fun PokemonModel.toDomain() = Pokemon(pokemonName = pokemonName, pokedexNumber = pokedexNumber, height = pokemonHeight, weight = pokemonWeight,sprites = sprites, types = types)
fun PokemonEntity.toDomain() = Pokemon(pokemonName = pokemonName, pokedexNumber = pokedexNumber, height = pokemonHeight,weight = pokemonWeight, sprites = sprites, types = types)
