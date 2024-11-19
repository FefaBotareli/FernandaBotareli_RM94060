package fe_andrd.github.com.fernandabotareli_rm94060.data
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import fe_andrd.github.com.fernandabotareli_rm94060.model.Dica

@Dao
interface DicaDao {

    @Query("SELECT * FROM Dica")
    fun obterTodas(): LiveData<List<Dica>>

    @Insert
    fun inserir(dica: Dica)

    @Delete
    fun deletar(dica: Dica)
}