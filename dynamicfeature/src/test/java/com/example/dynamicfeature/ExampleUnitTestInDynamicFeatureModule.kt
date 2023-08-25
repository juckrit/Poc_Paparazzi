package com.example.dynamicfeature

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import com.example.pocpaparazzi.MyComposableInAppModule
import org.junit.Test

import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTestInDynamicFeatureModule {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar"
        // ...see docs for more options
    )

    @Test
    fun launchComposable() {
        paparazzi.snapshot {
            MyComposableInAppModule(
                text = paparazzi.context.getString(R.string.example_string_in_dynamic_feature_module),
                drawableId = R.drawable.ic_apple_flat_24
            )
        }
    }


}