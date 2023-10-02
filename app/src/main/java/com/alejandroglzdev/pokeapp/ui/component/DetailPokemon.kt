package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alejandroglzdev.pokeapp.R
import com.alejandroglzdev.pokeapp.core.ColorHelper
import com.alejandroglzdev.pokeapp.core.extensions.capitalizeFirst
import com.alejandroglzdev.pokeapp.data.model.PokemonSprite
import com.alejandroglzdev.pokeapp.data.model.PokemonType
import com.alejandroglzdev.pokeapp.data.model.PokemonTypeDetail
import com.alejandroglzdev.pokeapp.domain.model.Pokemon

@Composable
fun DetailPokemon(pokemon: Pokemon) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = ColorHelper.getGradientFromTypes(pokemon)
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.size(30.dp))

        //Imagen del Pokemon
        PokemonDetailImage(
            image = pokemon.sprites.frontDefault
        )

        Spacer(modifier = Modifier.size(10.dp))

        //Nombre del Pokemon y numero
        PokemonH1(text = pokemon.pokemonName.capitalizeFirst() + " #" + pokemon.pokedexNumber)

        Spacer(modifier = Modifier.size(10.dp))

        //Row con el tipo, peso y altura
        Row {
            //Row con los tipos
            TypesLazyRowDetail(pokemon)

            Spacer(Modifier.weight(1f))

            //Row con peso y altura
            Row {
                Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
                    Icon(
                        painterResource(id = R.drawable.ic_weight),
                        contentDescription = "Weight icon",
                        Modifier.size(14.dp)
                    )
                    PokemonH2(text = pokemon.weight.toString())
                }

                Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
                    Icon(
                        painterResource(id = R.drawable.ic_height),
                        contentDescription = "Height icon",
                        Modifier.size(14.dp)
                    )
                    PokemonH2(text = pokemon.height.toString())
                }

            }
        }

        Spacer(modifier = Modifier.size(25.dp))

        //Descripcion del Pokemon
        PokemonH2(
            text = "Bulbasaur es un Pokémon cuadrúpedo de color verde y manchas más oscuras de" +
                    " formas geométricas. Su cabeza representa cerca de un tercio de su cuerpo.",
            horizontalPadding = 10,
            fontSize = 14,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.size(30.dp))

        PokemonH1(text = "Base stats", fontSize = 18)

        Spacer(modifier = Modifier.size(10.dp))

        //Barras de estadisticas
        StatsBars()
    }

}
