package edu.stts.materialcomponents.activity.menu12

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.R.layout.activity_menu_12_change_color
import kotlinx.android.synthetic.main.activity_menu_12_change_color.*

class ChangeColorActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_menu_12_change_color)
        init()
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox_1 -> {
                    if (checked) {
                        checkbox_1.setTextColor(Color.BLUE)
                    } else {
                        checkbox_1.setTextColor(Color.BLACK)
                    }
                }
                R.id.checkbox_2 -> {
                    if (checked) {
                        checkbox_2.setTextColor(Color.RED)
                    } else {
                        checkbox_2.setTextColor(Color.BLACK)
                    }
                }
                R.id.checkbox_3 -> {
                    if (checked) {
                        checkbox_3.setTextColor(Color.GREEN)
                    } else {
                        checkbox_3.setTextColor(Color.BLACK)
                    }
                }
                R.id.checkbox_4 -> {
                    if (checked) {
                        checkbox_4.setTextColor(Color.YELLOW)
                    } else {
                        checkbox_4.setTextColor(Color.BLACK)
                    }
                }
            }
        }
    }

    private fun init() {

    }
}