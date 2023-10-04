package com.alejandroglzdev.pokeapp.data.model

import android.util.Base64
import com.alejandroglzdev.pokeapp.data.network.PokemonApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL
import javax.inject.Inject

class PokemonService @Inject constructor(private val api: PokemonApiClient) {
    suspend fun getPokemonCount(): PokemonCount? {
        return withContext(Dispatchers.IO) {
            val response = api.getAllPokemonsCount()
            response.body()
        }

    }

    suspend fun getPokemonList(limit: Int, offSet: Int): MutableList<PokemonModel> {
        return withContext(Dispatchers.IO) {
            val pokemons = mutableListOf<PokemonModel>()

            for (i in offSet..limit) {
                try {
                    val response = api.getPokemon(i)
                    val pokemonResponse = response.body()

                    val flavourTextResponse = api.getPokemonFlavourText(i)
                    val flavourText = flavourTextResponse.body()?.flavorTextEntries?.get(1)?.flavorText

                    //Parse sprite to Base 64
                    val pokemonSpriteImage =
                        downloadImageToBase64(pokemonResponse?.sprites?.frontDefault)

                    if (pokemonResponse != null) {
                        pokemons.add(
                            PokemonModel(
                                pokemonName = pokemonResponse.pokemonName,
                                pokedexNumber = pokemonResponse.pokedexNumber,
                                pokemonHeight = pokemonResponse.pokemonHeight,
                                pokemonWeight = pokemonResponse.pokemonWeight,
                                sprites = PokemonSprite(frontDefault = pokemonSpriteImage),
                                types = pokemonResponse.types,
                                stats = pokemonResponse.stats,
                                flavorText = flavourText

                            )
                        )
                    }
                } catch (ex: Exception) {
                    println("response exception - ${ex.localizedMessage}")
                }
            }
            pokemons

        }

    }

    suspend fun downloadImageToBase64(url: String?): String {
        return withContext(Dispatchers.IO) {
            try {
                val image = URL(url).readBytes()
                Base64.encodeToString(image, Base64.DEFAULT)
            } catch (ex: Exception) {
                //TODO: Imagen por defecto
                ""
            }
        }
    }
}