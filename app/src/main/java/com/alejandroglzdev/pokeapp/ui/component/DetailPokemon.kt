package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
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

        //Nombre del Pokemon, hay que crear un nuevo Composable con el Text y reutilizarlo en la otra vista
        Text(
            text = pokemon.pokemonName.capitalizeFirst() + " #" + pokemon.pokedexNumber,
            fontSize = 24.sp,
            style = MaterialTheme.typography.h1,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.size(10.dp))

        //Row con el tipo, peso y altura
        Row {
            //Row con los tipos,hay que crear un nuevo Composable con la row y reutilizarlo en la otra vista
            LazyRow(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                items(pokemon.types.size) {
                    pokemon.types[it].typeDetail.name?.let { type ->
                        Surface(
                            shape = RoundedCornerShape(24.dp),
                            modifier = Modifier.wrapContentSize(),
                            color = Color(ColorHelper.getColorFromType(type))
                        ) {
                            Text(
                                text = type.capitalizeFirst(),
                                fontSize = 12.sp,
                                style = MaterialTheme.typography.h2,
                                color = Color.Black,
                                modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                    }
                }
            }

            Spacer(Modifier.weight(1f))

            //Row con peso y altura
            Row {
                Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
                    Icon(
                        painterResource(id = R.drawable.ic_weight),
                        contentDescription = "Weight icon",
                        Modifier.size(14.dp)
                    )
                    Text(
                        text = "Peso", fontSize = 12.sp,
                        style = MaterialTheme.typography.h2,
                        color = Color.Black
                    )
                }

                Row(Modifier.padding(start = 10.dp, end = 10.dp)) {
                    Icon(
                        painterResource(id = R.drawable.ic_height),
                        contentDescription = "Weight icon",
                        Modifier.size(14.dp)
                    )
                    Text(
                        text = "Altura", fontSize = 12.sp,
                        style = MaterialTheme.typography.h2,
                        color = Color.Black
                    )
                }

            }
        }

        Spacer(modifier = Modifier.size(25.dp))

        //Descripcion del Pokemon
        Text(
            text = "Bulbasaur es un Pokémon cuadrúpedo de color verde y manchas más oscuras de formas geométricas. Su cabeza representa cerca de un tercio de su cuerpo.",
            Modifier.padding(start = 10.dp, end = 10.dp),
            fontSize = 14.sp,
            style = MaterialTheme.typography.h2,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.size(30.dp))

        Text(
            text = "Base stats",
            fontSize = 18.sp,
            style = MaterialTheme.typography.h1,
            fontWeight = FontWeight.SemiBold
        )

        //Barras de estadisticas
        StatsBars()
    }

}

@Preview
@Composable
fun DetailPokemonPreview() {
    val pokemonTypeList: List<PokemonType> = listOf(
        PokemonType(
            slot = 1,
            typeDetail = PokemonTypeDetail(
                name = "grass",
                url = "https://pokeapi.co/api/v2/type/12/"
            )
        ),
        PokemonType(
            slot = 2,
            typeDetail = PokemonTypeDetail(
                name = "poison",
                url = "https://pokeapi.co/api/v2/type/10/"
            )
        )
    )
    DetailPokemon(
        pokemon = Pokemon(
            "Bulbasaur",
            "1",
            PokemonSprite("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgBAMAAAAQtmoLAAAAMFBMVEUAAAAQEBAYSkoxc3M5lJRSYili1bRzrDGD7sWk1UGsADG9/3PNzc3uIDn/amL///87EAzGAAAAAXRSTlMAQObYZgAAAZ1JREFUWMPtlL9Lw0AUx9NUce1JwMGlLUfbrdAGcVAkl0fI5iSloxiOrg4hiJuWcP+AlPwLASm4lWzB0dG9/0HAunbwpbjfq6PcZ/5+8n5weZZlMBgMhv/F4b75KaOHj5L4ZppMWuT8Y1Gssge6gPmiSLKYINjtukBRvJ0kK5IQPrXHyGhwWxTZyz1BUGOlUjlQOyHRlwhDpSCUKq2FBWFqX6k5hKmU0Wkt6Hs6xwKgdsIqW8Q0IVQpoJBlSawdojmYKRz6+aMHXrYgCPZnqubh7HJZgtdPiALUwmYnTLTCxTpUoObrfAtCUISrZYAzRMtqCz7040S7pbM8kLjSvHoHANHXCx35C/Da0D8NfiyDO8yPGLjQhY7+dV/nUt512DdgiS4X+tfK/bzGBYEdcWhrhYbjv1aVC54D2BRBQAOnBeaAK7CKR/hHPYagwz0cgiAcyAg3KiQIhyZYrsQoD6I9BPAYh1oQQDlMgYw8K0Ch4bouRWhGtSCjll2WJeXqDYe8ZfUC7IYx0qlsMGbZm83Xfqee+HGDwWAwGP7KD5Vqm0oTWykbAAAAAElFTkSuQmCC"),
            pokemonTypeList
        )
    )

}