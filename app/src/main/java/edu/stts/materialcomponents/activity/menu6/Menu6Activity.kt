package edu.stts.materialcomponents.activity.menu6

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_6.*

class Menu6Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_6)
        init()
    }

    private fun init() {

        buttonSlider.setOnClickListener(View.OnClickListener {

            val i = Intent(this, Menu6SliderActivity::class.java)
            startActivity(i)

        })

    }

}