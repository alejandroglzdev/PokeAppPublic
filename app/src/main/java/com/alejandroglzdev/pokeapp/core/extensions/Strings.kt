package com.alejandroglzdev.pokeapp.core.extensions

fun String.capitalizeFirst(): String {
    return this.replaceFirstChar(Char::titlecase)
}

fun String.normalizeStatsName(): String {
    return this.replaceFirstChar(Char::titlecase).replace("-", " ")
}


//TODO: Cambiar de clase este metodo a ColorHelper
fun Long.transformHexColor(newAlpha: Int): Long {
    val red = (this shr 16) and 0xFF
    val green = (this shr 8) and 0xFF
    val blue = this and 0xFF

    return (newAlpha.toLong() shl 24) or (red shl 16) or (green shl 8) or blue
}