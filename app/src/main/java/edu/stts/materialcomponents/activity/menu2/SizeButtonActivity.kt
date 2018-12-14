package edu.stts.materialcomponents.activity.menu2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_2_size_button.*

class SizeButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2_size_button)
        init()
    }

    private fun init() {
        buttonBackFromSize.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
