package com.alejandroglzdev.pokeapp.data.model

interface Paginable {
    fun paginate(lastItemIndex: Int)
}