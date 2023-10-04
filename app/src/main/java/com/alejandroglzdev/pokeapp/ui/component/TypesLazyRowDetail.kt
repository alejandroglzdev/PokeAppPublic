package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alejandroglzdev.pokeapp.core.ColorHelper
import com.alejandroglzdev.pokeapp.core.extensions.capitalizeFirst
import com.alejandroglzdev.pokeapp.domain.model.Pokemon

@Composable
fun TypesLazyRowDetail(pokemon: Pokemon) {
    LazyRow(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
        items(pokemon.types.size) {
            pokemon.types[it].typeDetail.name?.let { type ->
                Surface(
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier.wrapContentSize(),
                    color = Color(ColorHelper.getColorFromType(type))
                ) {
                    PokemonH2(text = type.capitalizeFirst(), horizontalPadding = 8, verticalPadding = 4)
                }
                Spacer(modifier = Modifier.width(5.dp))
            }
        }
    }
}