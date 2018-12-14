package edu.stts.materialcomponents.activity.menu2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_2.*
import kotlinx.android.synthetic.main.activity_menu_2_basic_button.*

class BasicButtonActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2_basic_button)
        init()
    }

    private fun init() {
            buttonBackFromBasic.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

}