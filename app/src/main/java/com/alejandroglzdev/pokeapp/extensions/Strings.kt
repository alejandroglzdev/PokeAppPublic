package com.alejandroglzdev.pokeapp.extensions

fun String.capitalizeFirst() : String {
    return this.replaceFirstChar(Char::titlecase)
}