package com.example.pocpaparazzi

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource


@Composable
fun MyComposableInAppModule(text: String) {
    Text(text)
    Image(
        painter = painterResource(R.drawable.ic_launcher_background_in_app_module),
        contentDescription = null,
    )
}