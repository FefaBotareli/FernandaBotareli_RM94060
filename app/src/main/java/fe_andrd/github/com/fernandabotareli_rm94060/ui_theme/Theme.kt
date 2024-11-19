package fe_andrd.github.com.fernandabotareli_rm94060.ui_theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Verde80,
    secondary = VerdeEscuro80,
    tertiary = AzulCéu80
)

private val LightColorScheme = lightColorScheme(
    primary = Verde40,
    secondary = VerdeEscuro40,
    tertiary = AzulCéu40
)

@Composable
fun EcoDicasTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        //typography = Typography,
        content = content
    )
}