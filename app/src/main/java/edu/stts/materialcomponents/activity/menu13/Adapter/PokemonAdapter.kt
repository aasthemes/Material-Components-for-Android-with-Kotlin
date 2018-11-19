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
import edu.stts.materialcomponents.activity.menu13.Class.Pokemons

class PokemonAdapter(val list: MutableList<Pokemons>, private val mContext: Context)
    : RecyclerView.Adapter<PokemonHolder>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_menu_13_recyclerview_pokemon_row, parent, false)
        return PokemonHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: PokemonHolder, position: Int) {
        var pk : Pokemons = list.get(position)
        holder.index(pk.getImagePlace(), pk.getName())
    }
}

class PokemonHolder (itemView: View, private val mpContext: Context) : RecyclerView.ViewHolder(itemView) {
    // Holds the TextView that will add each animal to
    private val iview : ImageView = itemView.findViewById<View>(R.id.avatar) as ImageView
    private val tview : TextView = itemView.findViewById<View>(R.id.pokemon_name) as TextView

    fun index(item : Int, s : String) {
        Glide.with(mpContext).load(item).into(iview)
        tview.text = s.capitalize()
    }

}