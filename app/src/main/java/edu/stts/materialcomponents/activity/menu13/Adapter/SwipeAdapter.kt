package edu.stts.materialcomponents.activity.menu13.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Class.Webserviceclass
import kotlinx.android.synthetic.main.activity_menu_13_recyclerview_swipe_row.view.*

class SwipeAdapter(val list: MutableList<Webserviceclass>, private val mContext: Context): RecyclerView.Adapter<ViewsHolder>() {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewsHolder {
        return ViewsHolder(LayoutInflater.from(mContext).inflate(R.layout.activity_menu_13_recyclerview_swipe_row, parent, false))
    }


    override fun onBindViewHolder(holder: ViewsHolder, position: Int) {
        holder.title.text = list[position].title
        holder.body.text = list[position].body
    }
}

class ViewsHolder (view: View) : RecyclerView.ViewHolder(view) {
    val title = view.txt_title!!
    val body = view.txt_body!!
}
