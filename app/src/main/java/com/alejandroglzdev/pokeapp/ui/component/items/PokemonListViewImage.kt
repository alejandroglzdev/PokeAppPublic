package com.alejandroglzdev.pokeapp.ui.component.items

import android.graphics.BitmapFactory
import android.util.Base64
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun PokemonImage(image: String, paddingBottom: Dp = 0.dp) {
    val byteArray = Base64.decode(image, Base64.DEFAULT)
    val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)

    Image(bitmap = bitmap.asImageBitmap(),
        contentDescription = "An image of a Pokémon",
        contentScale = ContentScale.Fit,
        modifier = Modifier.padding(bottom = paddingBottom)
    )


}