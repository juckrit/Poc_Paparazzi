package com.example.dynamicfeature

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.pocpaparazzi.RCoreDrawable


@Composable
fun MyComposableInDynamicFeatureModule(text:String){
    Text(text)
    Image(
        painter = painterResource(RCoreDrawable.ic_launcher_background_in_app_module),
        contentDescription = null,
    )
}