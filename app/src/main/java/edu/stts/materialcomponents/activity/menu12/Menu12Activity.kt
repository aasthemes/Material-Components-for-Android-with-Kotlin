package edu.stts.materialcomponents.activity.menu12

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_2.*

class Menu12Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_12)
        init()
    }

    private fun init() {
        button1.setOnClickListener(View.OnClickListener {
            val i = Intent(this, ChangeColorActivity::class.java)
            startActivity(i)
        })

        button2.setOnClickListener(View.OnClickListener {
        })
    }

}