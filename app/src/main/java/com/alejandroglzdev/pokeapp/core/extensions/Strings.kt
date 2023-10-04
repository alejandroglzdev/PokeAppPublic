package com.alejandroglzdev.pokeapp.core.extensions

fun String.capitalizeFirst(): String {
    return this.replaceFirstChar(Char::titlecase)
}

fun String.normalizeStatsName(): String {
    return this.replaceFirstChar(Char::titlecase).replace("-", " ")
}

fun String.removeBreakLine(): String {
    return this.replace("\n", "")
}