package com.poulastaa.customthem.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val Color_1_Purple80 = Color(0xFFD0BCFF)
val Color_1_PurpleGrey80 = Color(0xFFCCC2DC)
val Color_1_Pink80 = Color(0xFFEFB8C8)

val Color_1_Purple40 = Color(0xFF6650a4)
val Color_1_PurpleGrey40 = Color(0xFF625b71)
val Color_1_Pink40 = Color(0xFF7D5260)


val Color_3_Purple80 = Color(0xFFEB1974)
val Color_3_PurpleGrey80 = Color(0xFFD33F9A)
val Color_3_Pink80 = Color(0xFFF091D8)

val Color_3_Purple40 = Color(0xFF0AF3DE)
val Color_3_PurpleGrey40 = Color(0xFF62BEB6)
val Color_3_Pink40 = Color(0xFFB3E9DE)





val Color_1_DarkColorScheme = darkColorScheme(
    primary = Color_1_Purple80,
    secondary = Color_1_PurpleGrey80,
    tertiary = Color_1_Pink80
)

val Color_1_LightColorScheme = lightColorScheme(
    primary = Color_1_Purple40.copy(.3f),
    secondary = Color_1_PurpleGrey40.copy(.3f),
    tertiary = Color_1_Pink40.copy(.3f)
)

val Color_2_DarkColorScheme = darkColorScheme(
    primary = Color_1_Purple80.copy(.3f),
    secondary = Color_1_PurpleGrey80.copy(.3f),
    tertiary = Color_1_Pink80.copy(.3f)
)

val Color_2_LightColorScheme = lightColorScheme(
    primary = Color_1_Purple40,
    secondary = Color_1_PurpleGrey40,
    tertiary = Color_1_Pink40
)

val Color_3_DarkColorScheme = darkColorScheme(
    primary = Color_3_Purple80,
    secondary = Color_3_PurpleGrey80,
    tertiary = Color_3_Pink80
)

val Color_3_LightColorScheme = lightColorScheme(
    primary = Color_3_Purple40,
    secondary = Color_3_PurpleGrey40,
    tertiary = Color_3_Pink40
)