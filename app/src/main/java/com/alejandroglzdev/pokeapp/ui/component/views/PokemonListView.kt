package com.alejandroglzdev.pokeapp.ui.component.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.alejandroglzdev.pokeapp.core.ColorHelper
import com.alejandroglzdev.pokeapp.core.extensions.capitalizeFirst
import com.alejandroglzdev.pokeapp.domain.model.Pokemon
import com.alejandroglzdev.pokeapp.navigation.AppScreens
import com.alejandroglzdev.pokeapp.ui.component.items.PokemonH1
import com.alejandroglzdev.pokeapp.ui.component.items.PokemonImage

@Composable
fun PokemonListView(pokemonModel: Pokemon, navController: NavController) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        modifier = Modifier
            .height(210.dp)
            .padding(10.dp)
            .clickable {
                navController.currentBackStackEntry?.savedStateHandle?.set(
                    key = "pokemon",
                    value = pokemonModel
                )
                navController.navigate(AppScreens.DetailScreen.route)
            },
        elevation = 10.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = ColorHelper.getGradientFromTypes(pokemonModel)
                    )
                )
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(2f),
                    verticalArrangement = Arrangement.Center
                ) {
                    LazyRow(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(2f)
                    ) {
                        items(pokemonModel.types.size) {
                            pokemonModel.types[it].typeDetail.name?.let { type ->
                                Surface(
                                    shape = RoundedCornerShape(24.dp),
                                    modifier = Modifier.wrapContentSize(),
                                    color = Color(ColorHelper.getColorFromType(type))
                                ) {
                                    Text(
                                        text = type.capitalizeFirst(),
                                        fontSize = 12.sp,
                                        style = MaterialTheme.typography.h2,
                                        color = Color.White,
                                        modifier = Modifier.padding(
                                            vertical = 4.dp,
                                            horizontal = 8.dp
                                        )
                                    )
                                }
                                Spacer(modifier = Modifier.width(5.dp))
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    PokemonH1(text = pokemonModel.pokemonName.capitalizeFirst())

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(text = "#" + pokemonModel.pokedexNumber)

                    Spacer(
                        modifier = Modifier
                            .height(6.dp)
                            .width(4.dp)
                    )

                    OutlinedButton(
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.Black,
                            backgroundColor = Color.White
                        ),
                        onClick = {
                            navController.currentBackStackEntry?.savedStateHandle?.set(
                                key = "pokemon",
                                value = pokemonModel
                            )
                            navController.navigate(AppScreens.DetailScreen.route)
                        }
                    ) {
                        Text(
                            text = "Read More",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            style = MaterialTheme.typography.h2
                        )
                    }
                }

                Surface(
                    shape = RoundedCornerShape(16.dp),
                    //El color este es duda si dejarlo o quitarlo
                    color = Color.Transparent,
                    modifier = Modifier.size(width = 130.dp, height = 170.dp)
                ) {
                    PokemonImage(
                        image = pokemonModel.sprites.frontDefault,
                        20.dp
                    )
                }
            }
        }

    }

}
