package fe_andrd.github.com.fernandabotareli_rm94060.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dica(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val titulo: String,

    val descricao: String
)