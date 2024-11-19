package fe_andrd.github.com.fernandabotareli_rm94060.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import fe_andrd.github.com.fernandabotareli_rm94060.model.Dica
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DicasViewModel(application: Application) : AndroidViewModel(application) {

    private val _dicasLiveData = MutableLiveData<List<Dica>>()
    val dicasLiveData: LiveData<List<Dica>> get() = _dicasLiveData

    init {
        // Lista de exemplo para popular a RecyclerView
        val dicasExemplo = listOf(
            Dica(titulo = "Desligue aparelhos que não estão em uso", descricao = "Aparelhos eletrônicos consomem energia mesmo em modo de espera. Desconecte quando não for usar."),
            Dica(titulo = "Use lâmpadas LED", descricao = "Lâmpadas LED consomem menos energia e duram mais do que lâmpadas incandescentes."),
            Dica(titulo = "Aproveite a luz natural", descricao = "Sempre que possível, aproveite a luz do dia para iluminar ambientes e economizar energia.")
        )

        _dicasLiveData.value = dicasExemplo
    }

    // Método para adicionar uma nova dica (caso precise adicionar dinamicamente)
    fun adicionarDica(dica: Dica) {
        val listaAtual = _dicasLiveData.value.orEmpty().toMutableList()
        listaAtual.add(dica)
        _dicasLiveData.value = listaAtual
    }
}