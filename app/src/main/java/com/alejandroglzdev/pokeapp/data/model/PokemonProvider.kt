package com.alejandroglzdev.pokeapp.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonProvider @Inject constructor(private val api: PokemonService) {
    var pokemon = emptyList<PokemonModel>()
}
