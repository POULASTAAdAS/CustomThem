package com.poulastaa.customthem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poulastaa.customthem.ui.theme.Color_1_DarkColorScheme
import com.poulastaa.customthem.ui.theme.Color_2_DarkColorScheme
import com.poulastaa.customthem.ui.theme.Color_3_DarkColorScheme
import com.poulastaa.customthem.ui.theme.CustomThemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var color = mutableStateOf(Color_1_DarkColorScheme)

        setContent {
            CustomThemTheme(
                colorrrrr = {
                    color.value
                }
            ) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Body(
                        colorOne = {
                            color.value = it
                        },
                        colorTwo = {
                            color.value = it
                        },
                        colorThree = {
                            color.value = it
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Body(
    colorOne: (ColorScheme) -> Unit,
    colorTwo: (ColorScheme) -> Unit,
    colorThree: (ColorScheme) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Surface(
            modifier = Modifier.size(50.dp),
            color = MaterialTheme.colorScheme.primary
        ) {}

        Surface(
            modifier = Modifier.size(50.dp),
            color = MaterialTheme.colorScheme.secondary
        ) {}

        Surface(
            modifier = Modifier.size(50.dp),
            color = MaterialTheme.colorScheme.tertiary
        ) {}

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "Color 1" ,
            modifier = Modifier.clickable { colorOne.invoke(Color_1_DarkColorScheme) },
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Color 2" ,
            modifier = Modifier.clickable { colorTwo.invoke(Color_2_DarkColorScheme) },
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = "Color 3" ,
            modifier = Modifier.clickable { colorThree.invoke(Color_3_DarkColorScheme) },
            color = MaterialTheme.colorScheme.tertiary
        )

    }
}

@Preview
@Composable
private fun Preview() {
    Body(colorOne = { /*TODO*/ }, colorTwo = { /*TODO*/ }) {
//
    }
}