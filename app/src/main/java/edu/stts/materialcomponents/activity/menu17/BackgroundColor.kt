package edu.stts.materialcomponents.activity.menu17

import android.content.res.ColorStateList
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_17_background_color.*

class BackgroundColor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_17_background_color)
        floatingActionButton2.setOnClickListener {
            floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this,R.color.red_300)))
        }
    }

}
