package edu.stts.materialcomponents.activity.menu9

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_9.*

class Menu9Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_9)
        init()


    }

    private fun init() {
        button1.setOnClickListener {
            setContentView(R.layout.activity_menu_9_style)
        }
    }

}