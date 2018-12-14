package edu.stts.materialcomponents.activity.menu2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu12.Menu12Activity
import kotlinx.android.synthetic.main.activity_menu_2_typeface_button.*

class TypefaceButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_2_typeface_button)
        init()
    }

    private fun init(){
        buttonBackFromTypeface.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
