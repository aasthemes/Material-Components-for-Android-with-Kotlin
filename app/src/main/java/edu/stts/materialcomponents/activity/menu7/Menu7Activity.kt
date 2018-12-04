package edu.stts.materialcomponents.activity.menu7

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_7.*

class Menu7Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_7)
        init()

        buttonProcess.setOnClickListener(){
            val i = Intent(this, WebViewWithProgressBar::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }

    private fun init() {
    }

}