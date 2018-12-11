package edu.stts.materialcomponents.activity.menu17

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_17.*

class Menu17Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_17)
        init()
    }

    private fun init() {
        menu_17_btn_popup.setOnClickListener {
            val intent = Intent(this, PopupMenu::class.java)
            startActivity(intent)
        }

        menu_17_btn_icon_label.setOnClickListener {
            val intent = Intent(this, PopupLabel::class.java)
            startActivity(intent)
        }

        menu_17_btn_position.setOnClickListener {
            val intent = Intent(this, BasicWithCustomPosition::class.java)
            startActivity(intent)
        }

        menu_17_btn_stroke.setOnClickListener {
            val intent = Intent(this, StrokeLoading::class.java)
            startActivity(intent)
        }
    }

}