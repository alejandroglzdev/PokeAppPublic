package com.alejandroglzdev.pokeapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.alejandroglzdev.pokeapp.data.database.dao.PokemonDao
import com.alejandroglzdev.pokeapp.data.database.entities.PokemonEntity
import com.alejandroglzdev.pokeapp.data.database.entities.SpritesConverter

@Database(entities = [PokemonEntity::class],
    version = 5
)

@TypeConverters(SpritesConverter::class)

abstract class PokemonDatabase: RoomDatabase() {

    abstract fun getPokemonDao(): PokemonDao
}