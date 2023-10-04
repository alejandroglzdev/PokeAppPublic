package com.alejandroglzdev.pokeapp.ui.component.items

import android.graphics.BitmapFactory
import android.util.Base64
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PokemonDetailImage(image: String) {
    val byteArray = Base64.decode(image, Base64.DEFAULT)
    val bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)

    Image(bitmap = bitmap.asImageBitmap(),
        contentDescription = "An image of a Pokémon",
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(175.dp)
            .clip(CircleShape)                       // clip to the circle shape
            .border(6.dp, Color.LightGray, CircleShape)   // add a border (optional)
    )

}

@Preview
@Composable
fun PokemonDetailImagePreview(){
    PokemonDetailImage("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgBAMAAAAQtmoLAAAAMFBMVEUAAAAQEBAYSkoxc3M5lJRSYili1bRzrDGD7sWk1UGsADG9/3PNzc3uIDn/amL///87EAzGAAAAAXRSTlMAQObYZgAAAZ1JREFUWMPtlL9Lw0AUx9NUce1JwMGlLUfbrdAGcVAkl0fI5iSloxiOrg4hiJuWcP+AlPwLASm4lWzB0dG9/0HAunbwpbjfq6PcZ/5+8n5weZZlMBgMhv/F4b75KaOHj5L4ZppMWuT8Y1Gssge6gPmiSLKYINjtukBRvJ0kK5IQPrXHyGhwWxTZyz1BUGOlUjlQOyHRlwhDpSCUKq2FBWFqX6k5hKmU0Wkt6Hs6xwKgdsIqW8Q0IVQpoJBlSawdojmYKRz6+aMHXrYgCPZnqubh7HJZgtdPiALUwmYnTLTCxTpUoObrfAtCUISrZYAzRMtqCz7040S7pbM8kLjSvHoHANHXCx35C/Da0D8NfiyDO8yPGLjQhY7+dV/nUt512DdgiS4X+tfK/bzGBYEdcWhrhYbjv1aVC54D2BRBQAOnBeaAK7CKR/hHPYagwz0cgiAcyAg3KiQIhyZYrsQoD6I9BPAYh1oQQDlMgYw8K0Ch4bouRWhGtSCjll2WJeXqDYe8ZfUC7IYx0qlsMGbZm83Xfqee+HGDwWAwGP7KD5Vqm0oTWykbAAAAAElFTkSuQmCC")
}