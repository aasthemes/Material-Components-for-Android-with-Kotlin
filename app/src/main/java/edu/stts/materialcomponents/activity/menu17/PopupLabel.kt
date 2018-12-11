package edu.stts.materialcomponents.activity.menu17

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_17_popup_label.*

class PopupLabel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_17_popup_label)
        action_b.setOnClickListener {
            Toast.makeText(this, "You click Apps submenu", Toast.LENGTH_SHORT).show()
        }

        action_a.setOnClickListener {
            Toast.makeText(this, "You click Send submenu", Toast.LENGTH_SHORT).show()
        }
    }
}
