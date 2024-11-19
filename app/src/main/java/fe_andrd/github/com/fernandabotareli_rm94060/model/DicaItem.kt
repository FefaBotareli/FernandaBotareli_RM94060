package fe_andrd.github.com.fernandabotareli_rm94060.model

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DicaItem(dica: Dica) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(
            text = dica.titulo,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = dica.descricao,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}