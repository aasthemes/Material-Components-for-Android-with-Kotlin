package edu.stts.materialcomponents.activity.menu9

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_9.*
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.BottomNavigationView



class Menu9Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_9)
        init()


    }

    private fun init() {
        button1.setOnClickListener {
            setContentView(R.layout.activity_menu_9_style_text)
        }
        button2.setOnClickListener {
            setContentView(R.layout.activity_menu_9_style_icon)
        }
        button3.setOnClickListener {
            setContentView(R.layout.activity_menu_9_transition)

        }

    }

}