package edu.stts.materialcomponents.activity.menu13

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.BasicAdapter
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_menu_13_basic.*

class BasicActivity: AppCompatActivity() {

    val basic_list: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_basic)
        val toolbar = findViewById<View>(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Basic"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        addLists()

        rv_basic.layoutManager = LinearLayoutManager(this)
//        rv_basic.layoutManager = GridLayoutManager(this, 2)
        rv_basic.adapter = BasicAdapter(basic_list, this)
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun addLists() {
        for (i in 1..70) {
            basic_list.add("List " + i.toString())
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}