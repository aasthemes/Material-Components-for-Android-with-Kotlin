package edu.stts.materialcomponents.activity.menu2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_2_style_button.*

class StyleButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2_style_button)
        init()
    }

    private fun init(){
        buttonBackFromStyle.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
