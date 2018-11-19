package edu.stts.materialcomponents.activity.menu13.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import edu.stts.materialcomponents.R

class PokemonAdapter(val pokemon_image: IntArray, val pokemon_name: ArrayList<String>, val mContext: Context)
    : RecyclerView.Adapter<PokemonHolder>() {

    override fun getItemCount(): Int {
        return pokemon_name.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_menu_13_recyclerview_pokemon_row, parent, false)
        return PokemonHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: PokemonHolder, position: Int) {
        holder.index(pokemon_image[position], pokemon_name[position])
    }
}

class PokemonHolder (itemView: View, val mpContext: Context) : RecyclerView.ViewHolder(itemView) {
    // Holds the TextView that will add each animal to
    private val iview : ImageView
    private val tview : TextView

    init {
        iview = itemView.findViewById<View>(R.id.avatar) as ImageView
        tview = itemView.findViewById<View>(R.id.pokemon_name) as TextView
    }

    fun index(item : Int, s : String) {
        Glide.with(mpContext).load(item).into(iview)
        tview.text = s
    }

}