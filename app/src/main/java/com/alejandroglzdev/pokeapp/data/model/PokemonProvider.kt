package com.alejandroglzdev.pokeapp.data.model

class PokemonProvider {
    companion object {
        fun getPokemonList(): List<PokemonModel>{
            return pokemon
        }

        private val pokemon = listOf<PokemonModel>(
            PokemonModel("Bulbasaur", "#1"),
            PokemonModel("Ivysaur", "#2"),
            PokemonModel("Venusaur", "#3"),
            PokemonModel("Charmander", "#4"),
            PokemonModel("Charmeleon", "#5"),
            PokemonModel("Charizard", "#6"),
            PokemonModel("Squirtle", "#7"),
            PokemonModel("Wartortle", "#8"),
            PokemonModel("Blastoise", "#9")
        )
    }
}