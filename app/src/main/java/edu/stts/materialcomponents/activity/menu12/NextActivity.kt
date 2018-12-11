package edu.stts.materialcomponents.activity.menu12

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import edu.stts.materialcomponents.R

class NextActivity : AppCompatActivity() {

    private var tv: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_12_next_activity)

        tv = findViewById(R.id.tv) as TextView

        for (i in 0 until CustomAdapter.public_modelArrayList!!.size) {
            if (CustomAdapter.public_modelArrayList!!.get(i).getSelecteds()) {
                tv!!.text = tv!!.text.toString() + " " + CustomAdapter.public_modelArrayList!!.get(i).getAnimals()
            }
        }
    }
}