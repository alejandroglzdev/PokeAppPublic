package com.alejandroglzdev.pokeapp.ui.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import com.alejandroglzdev.pokeapp.data.model.Paginable
import com.alejandroglzdev.pokeapp.data.model.PokemonModel

@Composable
fun PokemonList(pokemonList: List<PokemonModel>?, viewDelegate: Paginable) {
    val listState = rememberLazyListState()
    ConstraintLayout(Modifier.fillMaxSize()) {
        val circularProgressIndicator = createRef()
        if (pokemonList != null) {
            LazyColumn (state = listState){
                items(pokemonList) { pokemon ->
                    PokemonListView(pokemon)
                }
            }

            listState.OnBottomReached {
                viewDelegate.paginate(listState.layoutInfo.totalItemsCount)
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

@Composable
fun LazyListState.OnBottomReached(loadMore : () -> Unit) {
    //state object which tells us if we should load more
    val shouldLoadMore = remember {
        derivedStateOf {

            //get last visible item
            val lastVisibleItem = layoutInfo.visibleItemsInfo.lastOrNull()
                ?:
                //list is empty
                return@derivedStateOf true

            //Check if last visible item is the last item in the list
            lastVisibleItem.index == layoutInfo.totalItemsCount - 1
        }

    }

    LaunchedEffect(shouldLoadMore) {
        snapshotFlow { shouldLoadMore.value }
            .collect {
                //uf should load more, then invoke loadMore
                if(it) loadMore()
            }
    }

}

