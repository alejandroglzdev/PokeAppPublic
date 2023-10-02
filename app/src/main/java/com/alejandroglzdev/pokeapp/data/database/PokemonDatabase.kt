package com.alejandroglzdev.pokeapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.alejandroglzdev.pokeapp.data.database.dao.PokemonDao
import com.alejandroglzdev.pokeapp.data.database.entities.PokemonEntity
import com.alejandroglzdev.pokeapp.data.database.entities.SpritesConverter
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite

@Database(entities = [PokemonEntity::class],
    version = 3
)

@TypeConverters(SpritesConverter::class)

abstract class PokemonDatabase: RoomDatabase() {

    abstract fun getPokemonDao(): PokemonDao
}