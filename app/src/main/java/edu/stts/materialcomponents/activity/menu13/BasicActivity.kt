package edu.stts.materialcomponents.activity.menu13

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.BasicAdapter
import kotlinx.android.synthetic.main.activity_menu_13_basic.*

class BasicActivity: AppCompatActivity() {

    val basic_list: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_basic)

        addLists()

        rv_basic.layoutManager = LinearLayoutManager(this)
//        rv_basic.layoutManager = GridLayoutManager(this, 2)
        rv_basic.adapter = BasicAdapter(basic_list, this)
    }

    private fun addLists() {
        for (i in 1..20) {
            basic_list.add("List " + i.toString())
        }
    }
}