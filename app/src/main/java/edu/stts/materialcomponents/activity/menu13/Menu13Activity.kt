package edu.stts.materialcomponents.activity.menu13

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_menu_13.*

class Menu13Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13)
        init()
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun init() {
        button1.setOnClickListener {
//            Toast.makeText(this, "This is a Toast Message", Toast.LENGTH_SHORT).show()
            val i = Intent(this, BasicActivity::class.java)
            startActivity(i)
        }

        button2.setOnClickListener {
            //            Toast.makeText(this, "This is a Toast Message", Toast.LENGTH_SHORT).show()
            val i = Intent(this, PokemonActivity::class.java)
            startActivity(i)
        }

        button3.setOnClickListener {
            //            Toast.makeText(this, "This is a Toast Message", Toast.LENGTH_SHORT).show()
            val i = Intent(this, StaggeredActivity::class.java)
            startActivity(i)
        }

    }

}