package edu.stts.materialcomponents.activity.menu17

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import android.content.Intent
import android.view.View
import edu.stts.materialcomponents.R.id.menu_17_btn_color
import kotlinx.android.synthetic.main.activity_menu_17.*


class Menu17Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_17)
        init()
    }

    private fun init() {
        menu_17_btn_position.setOnClickListener(View.OnClickListener {

            val i = Intent(this, BasicWithCustomPosition::class.java)
            startActivity(i)

        })
        menu_17_btn_popup.setOnClickListener(View.OnClickListener {

            val i = Intent(this, PopupMenu::class.java)
            startActivity(i)

        })
        menu_17_btn_stroke.setOnClickListener(View.OnClickListener {

            val i = Intent(this, StrokeLoading::class.java)
            startActivity(i)

        })
        menu_17_btn_icon_label.setOnClickListener(View.OnClickListener {

            val i = Intent(this, PopupLabel::class.java)
            startActivity(i)

        })
        menu_17_btn_color.setOnClickListener(View.OnClickListener {

            val i = Intent(this, BackgroundColor::class.java)
            startActivity(i)

        })
    }
}