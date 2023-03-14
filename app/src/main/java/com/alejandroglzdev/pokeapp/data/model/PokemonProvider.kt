package com.alejandroglzdev.pokeapp.data.model

class PokemonProvider {
    companion object {
        private val api = PokemonService()

        var pokemon = emptyList<PokemonModel>()
    }
}