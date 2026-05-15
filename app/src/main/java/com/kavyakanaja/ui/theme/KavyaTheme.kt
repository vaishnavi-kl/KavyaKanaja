package com.kavyakanaja.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// ── New Elegant Blue Theme ───────────────────────────────────────
val Parchment        = Color(0xFFF5F5F5)
val ParchmentDark    = Color(0xFFE8EAF6)
val InkBrown         = Color(0xFF1A237E)
val InkLight         = Color(0xFF3949AB)
val SaffronGold      = Color(0xFF5C6BC0)
val SaffronDark      = Color(0xFF283593)
val DeepGreen        = Color(0xFF00695C)
val CrimsonRed       = Color(0xFFC62828)
val CardSurface      = Color(0xFFFFFFFF)
val StarGold         = Color(0xFF7986CB)

private val KavyaColorScheme = lightColorScheme(
    primary = SaffronDark,
    onPrimary = Color.White,
    primaryContainer = SaffronGold,
    onPrimaryContainer = Color.White,

    secondary = DeepGreen,
    onSecondary = Color.White,

    background = Parchment,
    onBackground = InkBrown,

    surface = CardSurface,
    onSurface = InkBrown,

    surfaceVariant = ParchmentDark,
    onSurfaceVariant = InkLight,

    error = CrimsonRed,
    onError = Color.White,

    outline = InkLight
)

@Composable
fun KavyaKanajaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = KavyaColorScheme,
        typography = KavyaTypography,
        content = content
    )
}

// ── Typography ───────────────────────────────────────────────────
val KavyaTypography = androidx.compose.material3.Typography(

    displayLarge = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 42.sp,
        letterSpacing = 0.5.sp,
        color = InkBrown
    ),

    displayMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        lineHeight = 36.sp,
        color = InkBrown
    ),

    headlineLarge = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 30.sp,
        color = InkBrown
    ),

    headlineMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 26.sp,
        color = InkBrown
    ),

    bodyLarge = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.3.sp,
        color = InkBrown
    ),

    bodyMedium = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 24.sp,
        color = InkLight
    ),

    labelLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        color = InkBrown
    ),

    labelMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = InkLight
    )
)