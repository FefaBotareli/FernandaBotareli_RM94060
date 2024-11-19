package fe_andrd.github.com.fernandabotareli_rm94060.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fe_andrd.github.com.fernandabotareli_rm94060.R
import fe_andrd.github.com.fernandabotareli_rm94060.model.Dica

class DicasAdapter(private val dicas: List<Dica>) : RecyclerView.Adapter<DicasAdapter.DicaViewHolder>() {

    inner class DicaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tituloTextView: TextView = itemView.findViewById(R.id.textTitulo)
        val descricaoTextView: TextView = itemView.findViewById(R.id.textDescricao)

        fun bind(dica: Dica) {
            tituloTextView.text = dica.titulo
            descricaoTextView.text = dica.descricao
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DicaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dica, parent, false)
        return DicaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DicaViewHolder, position: Int) {
        holder.bind(dicas[position])
    }

    override fun getItemCount(): Int = dicas.size
}