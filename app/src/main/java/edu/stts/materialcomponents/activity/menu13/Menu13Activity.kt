package edu.stts.materialcomponents.activity.menu13

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_13.*

class Menu13Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13)
        init()
    }

    private fun init() {
        button1.setOnClickListener {
            Toast.makeText(this, "This is a Toast Message", Toast.LENGTH_SHORT).show()
        }
    }

}