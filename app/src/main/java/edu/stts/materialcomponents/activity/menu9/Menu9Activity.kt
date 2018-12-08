package edu.stts.materialcomponents.activity.menu9

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_9.*
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.BottomNavigationView
import android.view.View
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_menu_9_functional.*
import android.support.annotation.NonNull
import android.support.v4.app.Fragment
import android.view.MenuItem
import android.widget.Toast


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
            setContentView(R.layout.activity_menu_9_functional)
            val views = findViewById<View>(R.id.bottom_navigation) as BottomNavigationView
            views.setOnNavigationItemReselectedListener { item ->
                when (item.itemId){
                    R.id.nav_back -> Toast.makeText(application , "Back is Clicked" , Toast.LENGTH_SHORT).show()
                    R.id.nav_home -> Toast.makeText(application , "Home is Clicked" , Toast.LENGTH_SHORT).show()
                    R.id.nav_account -> Toast.makeText(application , "Account is Clicked" , Toast.LENGTH_SHORT).show()
                }
            }
        }


    }

}