package edu.stts.materialcomponents.activity.menu13.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_13_recyclerview_basic_row.view.*

class BasicAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<VHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        return VHolder(LayoutInflater.from(context).inflate(R.layout.activity_menu_13_recyclerview_basic_row, parent, false))
    }


    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.basic_text?.text = items.get(position)
    }
}

class VHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val basic_text = view.basic_textview
}