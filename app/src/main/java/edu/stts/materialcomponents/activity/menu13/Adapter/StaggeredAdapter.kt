package edu.stts.materialcomponents.activity.menu13.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Class.ItemObject

class StaggeredAdapter(val list: List<ItemObject>, private val mContext: Context)
    : RecyclerView.Adapter<StagHolder>() {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StagHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_menu_13_staggered_row, parent, false)
        return StagHolder(v, mContext)
    }

    override fun onBindViewHolder(holder: StagHolder, position: Int) {
        var pk : ItemObject = list[position]
        holder.index(pk.getImagePlace(), pk.getName())
    }
}

class StagHolder (itemView: View, private val mpContext: Context) : RecyclerView.ViewHolder(itemView) {

    private val iview : ImageView = itemView.findViewById<View>(R.id.img) as ImageView
    private val tview : TextView = itemView.findViewById<View>(R.id.name) as TextView

    fun index(item : Int, s : String) {
        Glide.with(mpContext).load(item).into(iview)
        tview.text = s.capitalize()
    }

}