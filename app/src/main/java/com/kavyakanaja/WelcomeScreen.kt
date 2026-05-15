package com.kavyakanaja

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kavyakanaja.ui.theme.KavyaKanajaTheme
import kotlinx.coroutines.delay

class WelcomeScreen : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            KavyaKanajaTheme {

                LaunchedEffect(Unit) {

                    delay(2000)

                    startActivity(
                        Intent(
                            this@WelcomeScreen,
                            MainActivity::class.java
                        )
                    )

                    finish()
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color(0xFF283593),
                                    Color(0xFF5C6BC0)
                                )
                            )
                        ),

                    verticalArrangement =
                        Arrangement.Center,

                    horizontalAlignment =
                        Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "🪶 Kavya Kanaja",

                        style =
                            MaterialTheme.typography.displayMedium.copy(
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                    )

                    Text(
                        text = "Welcome to Kannada Poetry",

                        color = Color.White.copy(alpha = 0.9f),

                        fontSize = 18.sp
                    )

                    Text(
                        text = ".......................📜",

                        color = Color.White.copy(alpha = 0.75f),

                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}