package com.alejandroglzdev.pokeapp.data.database.entities

import androidx.room.TypeConverter
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite
import com.alejandroglzdev.pokeapp.data.model.PokemonType
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class SpritesConverter {
    private val gson = Gson()

    @TypeConverter
    fun spritesToString(pokemonSprite: PokemonSprite): String {
        return pokemonSprite.frontDefault
    }

    @TypeConverter
    fun stringToSprites(string: String): PokemonSprite {
        return PokemonSprite(string)
    }

    @TypeConverter
    fun stringToList(data: String?): List<PokemonType> {
        if (data == null) {
            return emptyList()
        }
        val listType: Type = object : TypeToken<List<PokemonType>>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun listToString(someObjects: List<PokemonType>): String {
        return gson.toJson(someObjects)
    }
}