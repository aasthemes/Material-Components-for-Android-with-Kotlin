package edu.stts.materialcomponents.activity.menu5

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_5.*

class Menu5Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_5)
        init()
    }

    private fun init() {
        button1.setOnClickListener(View.OnClickListener {
            val i = Intent(this, TextButtonActivity::class.java)
            startActivity(i)
        })
        button2.setOnClickListener(View.OnClickListener {
            val i = Intent(this, ImageButtonActivity::class.java)
            startActivity(i)
        })
        button3.setOnClickListener(View.OnClickListener {
            val i = Intent(this, TextImageButtonActivity::class.java)
            startActivity(i)
        })
        button4.setOnClickListener(View.OnClickListener {
            val i = Intent(this, MaterialButtonActivity::class.java)
            startActivity(i)
        })
        button5.setOnClickListener(View.OnClickListener {
            val i = Intent(this, AtributButtonActivity::class.java)
            startActivity(i)
        })
    }

}