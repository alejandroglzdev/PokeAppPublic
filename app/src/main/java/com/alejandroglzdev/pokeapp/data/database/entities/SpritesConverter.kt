package com.alejandroglzdev.pokeapp.data.database.entities

import androidx.room.TypeConverter
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite
import com.alejandroglzdev.pokeapp.data.model.PokemonStatDetail
import com.alejandroglzdev.pokeapp.data.model.PokemonStats
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
    fun stringToTypesList(data: String?): List<PokemonType> {
        if (data == null) {
            return emptyList()
        }
        val listType: Type = object : TypeToken<List<PokemonType>>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun typeListToString(someObjects: List<PokemonType>): String {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    fun stringToStatsList(data: String?): List<PokemonStats> {
        if (data == null) {
            return emptyList()
        }
        val listType: Type = object : TypeToken<List<PokemonStats>>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun statsListToString(someObjects: List<PokemonStats>): String {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    fun statsDetailToString(statsDetail: PokemonStatDetail): String {
        return statsDetail.name
    }

    @TypeConverter
    fun stringToStatsDetail(string: String): PokemonStatDetail {
        return PokemonStatDetail(string)
    }

}