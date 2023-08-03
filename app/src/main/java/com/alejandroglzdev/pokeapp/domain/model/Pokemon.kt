package com.alejandroglzdev.pokeapp.domain.model

import com.alejandroglzdev.pokeapp.data.database.entities.PokemonEntity
import com.alejandroglzdev.pokeapp.data.model.PokemonModel
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite
import com.google.gson.annotations.SerializedName

data class Pokemon(
    val pokemonName: String,
    val pokedexNumber: String,
    val sprites: PokemonSprite
)

fun PokemonModel.toDomain() = Pokemon(pokemonName = pokemonName, pokedexNumber = pokedexNumber, sprites = sprites)
fun PokemonEntity.toDomain() = Pokemon(pokemonName = pokemonName, pokedexNumber = pokedexNumber, sprites = sprites)
