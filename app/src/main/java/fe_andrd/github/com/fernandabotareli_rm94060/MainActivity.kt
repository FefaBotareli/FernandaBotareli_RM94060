package fe_andrd.github.com.fernandabotareli_rm94060

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fe_andrd.github.com.fernandabotareli_rm94060.viewmodel.DicasAdapter
import fe_andrd.github.com.fernandabotareli_rm94060.viewmodel.DicasViewModel
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {

    private val dicasViewModel: DicasViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: DicasAdapter
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        //searchView = findViewById(R.id.searchView)

        dicasViewModel.dicasLiveData.observe(this) { dicas ->
            //adapter = DicasAdapter(dicas, this)
            recyclerView.adapter = adapter
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean = false

            override fun onQueryTextChange(newText: String?): Boolean {
                val textoFiltrado = newText?.lowercase() ?: ""
                val dicasFiltradas = dicasViewModel.dicasLiveData.value?.filter {
                    it.titulo.lowercase().contains(textoFiltrado) ||
                            it.descricao.lowercase().contains(textoFiltrado)
                } ?: emptyList()

                recyclerView.adapter = adapter
                return true
            }
        })
    }

    @Composable
    fun InformacoesEquipe() {
        Column {
            Text(text = "Integrantes da Equipe")
            Text(text = "Nome: Fernando Botareli")
            Text(text = "RM: 94060")
        }
    }

}