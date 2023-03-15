package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

@Composable
fun PokemonList(pokemonList: List<PokemonModel>?) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val circularProgressIndicator = createRef()
        if (pokemonList != null) {
            LazyColumn {
                items(pokemonList) { pokemon ->
                    PokemonListView(pokemon)
                }
            }
        }else{
            CircularProgressIndicator(modifier = Modifier.constrainAs(circularProgressIndicator){
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
        }
    }


}

