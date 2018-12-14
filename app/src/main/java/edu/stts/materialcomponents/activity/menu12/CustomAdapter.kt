package edu.stts.materialcomponents.activity.menu12

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import edu.stts.materialcomponents.R

class CustomAdapter(private val context: Context, modelArrayList: ArrayList<Model>) : BaseAdapter() {

    private var modelArrayList: ArrayList<Model>

    init {
        this.modelArrayList = modelArrayList
    }

    override fun getViewTypeCount(): Int {
        return count
    }

    override fun getItemViewType(position: Int): Int {

        return position
    }

    override fun getCount(): Int {
        return modelArrayList.size
    }

    override fun getItem(position: Int): Any {
        return modelArrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.activity_menu_12_list_checkbox_with_dataadapter, null, true)

            holder.checkBox = convertView!!.findViewById(R.id.cb) as CheckBox
            holder.tvAnimal = convertView.findViewById(R.id.animal) as TextView

            convertView.tag = holder
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = convertView.tag as ViewHolder
        }

        holder.checkBox!!.text = "Checkbox $position"
        holder.tvAnimal!!.setText(modelArrayList[position].getAnimals())

        holder.checkBox!!.isChecked = modelArrayList[position].getSelecteds()

        holder.checkBox!!.setTag(R.integer.btnplusview, convertView)
        holder.checkBox!!.tag = position
        holder.checkBox!!.setOnClickListener {
            val tempview = holder.checkBox!!.getTag(R.integer.btnplusview) as View
            val tv = tempview.findViewById(R.id.animal) as TextView
            val pos = holder.checkBox!!.tag as Int
            Toast.makeText(context, "Checkbox $pos clicked!", Toast.LENGTH_SHORT).show()

            if (modelArrayList[pos].getSelecteds()) {
                modelArrayList[pos].setSelecteds(false)
                public_modelArrayList = modelArrayList
            } else {
                modelArrayList[pos].setSelecteds(true)
                public_modelArrayList = modelArrayList
            }
        }

        return convertView
    }

    private inner class ViewHolder {

        var checkBox: CheckBox? = null
        var tvAnimal: TextView? = null

    }

    companion object {
        lateinit var public_modelArrayList: ArrayList<Model>
    }
}