package com.alejandroglzdev.pokeapp.data.database.entities

import androidx.room.TypeConverter
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite

class SpritesConverter {

    @TypeConverter
    fun spritesToString(pokemonSprite: PokemonSprite): String {
        return pokemonSprite.frontDefault
    }

    @TypeConverter
    fun stringToSprites(string: String): PokemonSprite {
        return PokemonSprite(string)
    }
}