package edu.stts.materialcomponents.activity.menu2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu12.Menu12Activity
import kotlinx.android.synthetic.main.activity_menu_2_color_button.*

class ColorButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2_color_button)
        init()
    }

    private fun init(){
        buttonBackFromColor.setOnClickListener(View.OnClickListener {
            //val i = Intent(this,Menu2Activity::class.java)
            //startActivity(i)
            finish()
        })
    }
}
