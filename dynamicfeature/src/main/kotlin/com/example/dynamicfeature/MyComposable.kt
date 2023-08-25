package com.example.dynamicfeature

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource


@Composable
fun MyComposable(text:String,@DrawableRes drawableId: Int){
    Text(text)
    Image(
        painter = painterResource(drawableId),
        contentDescription = null,
    )
}