package edu.stts.materialcomponents.activity.menu12

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import android.util.SparseBooleanArray
import android.view.View
import android.widget.CheckBox
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_menu_12_change_color.*
import kotlinx.android.synthetic.main.activity_menu_12_check_all.*


class CheckAll: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_12_check_all)
        init()
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox_all -> {
                    if (checked) {
                        checkbox_1_all.setChecked(true)
                        checkbox_2_all.setChecked(true)
                        checkbox_3_all.setChecked(true)
                        checkbox_4_all.setChecked(true)
                    } else {
                        checkbox_1_all.setChecked(false)
                        checkbox_2_all.setChecked(false)
                        checkbox_3_all.setChecked(false)
                        checkbox_4_all.setChecked(false)
                    }
                }
                R.id.checkbox_1 -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_2 -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_3 -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_4 -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_red -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_green -> {
                    if (checked) {

                    } else {

                    }
                }
                R.id.checkbox_blue -> {
                    if (checked) {

                    } else {

                    }
                }
            }
        }
    }

    private fun init() {

    }
}