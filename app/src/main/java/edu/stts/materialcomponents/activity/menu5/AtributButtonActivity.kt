package edu.stts.materialcomponents.activity.menu5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_5_atribut_button.*

class AtributButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_5_atribut_button)
        init()
    }

    private fun init() {
        button1.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Normal Button Clicked", Toast.LENGTH_SHORT).show()
        })
        button2.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Disabled Button Clicked", Toast.LENGTH_SHORT).show()
        })
    }
}
