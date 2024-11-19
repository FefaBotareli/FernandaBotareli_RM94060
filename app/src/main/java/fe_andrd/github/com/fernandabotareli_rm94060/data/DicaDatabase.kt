package fe_andrd.github.com.fernandabotareli_rm94060.data

import androidx.room.Database
import androidx.room.RoomDatabase
import fe_andrd.github.com.fernandabotareli_rm94060.model.Dica


@Database(entities = [Dica::class], version = 1)
abstract class DicaDatabase : RoomDatabase() {


    abstract fun dicaDao(): DicaDao
}