package com.example.pocpaparazzi

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource


@Composable
fun MyComposableInAppModule(text: String, @DrawableRes drawableId: Int) {
    Text(text)
    Image(
        painter = painterResource(drawableId),
        contentDescription = null,
    )
}