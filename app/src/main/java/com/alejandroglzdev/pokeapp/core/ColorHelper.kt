package com.alejandroglzdev.pokeapp.core

import androidx.compose.ui.graphics.Color
import com.alejandroglzdev.pokeapp.core.extensions.transformHexColor
import com.alejandroglzdev.pokeapp.domain.model.Pokemon

object ColorHelper {
    //TODO: Fetch total types list from API and store them in DB to get the ID
    fun getColorFromType(type: String): Long {
        return when(type.lowercase()){
            "normal"   -> 0xFFA8A77A
            "fighting" -> 0xFFC22E28
            "flying"   -> 0xFFA98FF3
            "poison"   -> 0xFFA33EA1
            "ground"   -> 0xFFE2BF65
            "rock"     -> 0xFFB6A136
            "bug"      -> 0xFFA6B91A
            "ghost"    -> 0xFF735797
            "steel"    -> 0xFFB7B7CE
            "fire"     -> 0xFFEE8130
            "water"    -> 0xFF6390F0
            "grass"    -> 0xFF7AC74C
            "electric" -> 0xFFF7D02C
            "psychic"  -> 0xFFF95587
            "ice"      -> 0xFF96D9D6
            "dragon"   -> 0xFF6F35FC
            "dark"     -> 0xFF705746
            "fairy"    -> 0xFFD685AD
            "unknown"  -> 0xFF2F4F4F
            "shadow"   -> 0xFF705746
            else       -> 0xFF909090
        }
    }

    fun getGradientFromTypes(model: Pokemon): List<Color> {
        model.types.map {
            Color(getColorFromType(it.typeDetail.name ?: "").transformHexColor(0xAA))
        }.also {
            return if (it.size < 2) {
                listOf(
                    it.first(),
                    it.first()
                )
            } else {
                it
            }
        }
    }
}