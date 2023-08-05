package com.alejandroglzdev.pokeapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite
import com.alejandroglzdev.pokeapp.domain.model.Pokemon

@Entity(tableName = "pokemon_table")
data class PokemonEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "pokedexNumber") val pokedexNumber: String,
    @ColumnInfo(name = "pokemonName") val pokemonName: String,
    @ColumnInfo(name = "sprites") val sprites: PokemonSprite
)

fun Pokemon.toDatabase() = PokemonEntity(pokemonName = pokemonName, pokedexNumber = pokedexNumber, sprites = sprites)
