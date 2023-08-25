package com.example.dynamicfeature

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource


@Composable
fun MyComposable(text:String){
    Text(text)
    Image(
        painter = painterResource(R.drawable.ic_apple_flat_24_in_dynamic_feature_module),
        contentDescription = null,
    )
}