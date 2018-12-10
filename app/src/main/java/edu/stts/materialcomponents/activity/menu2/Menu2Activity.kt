package edu.stts.materialcomponents.activity.menu2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_2.*

class Menu2Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2)
        init()
    }

    private fun init() {
        buttonGoBasic.setOnClickListener(View.OnClickListener {

            val i = Intent(this, BasicButtonActivity::class.java)
            startActivity(i)
        })

        buttonGoSize.setOnClickListener(View.OnClickListener {

            val i = Intent(this, SizeButtonActivity::class.java)
            startActivity(i)
        })

        buttonGoStyle.setOnClickListener(View.OnClickListener {
            val i = Intent(this, StyleButtonActivity::class.java)
            startActivity(i)
        })

        buttonGoColor.setOnClickListener(View.OnClickListener {
            val i = Intent(this, ColorButtonActivity::class.java)
            startActivity(i)
        })

        buttonGoTypeface.setOnClickListener(View.OnClickListener {
            val i = Intent(this, TypefaceButtonActivity::class.java)
            startActivity(i)
        })
    }

}