package edu.stts.materialcomponents.activity.menu4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_2.*

class Menu4Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_4)
        init()
    }

    private fun init() {

        button1.setOnClickListener(View.OnClickListener {

            val i = Intent(this, BasicCardViewActivity::class.java)
            startActivity(i)

        })

        button2.setOnClickListener(View.OnClickListener {

            val i = Intent(this, TimelineCardViewActivity::class.java)
            startActivity(i)

        })

        button3.setOnClickListener(View.OnClickListener {

            val i = Intent(this, OverlapCardViewActivity::class.java)
            startActivity(i)

        })

    }
}