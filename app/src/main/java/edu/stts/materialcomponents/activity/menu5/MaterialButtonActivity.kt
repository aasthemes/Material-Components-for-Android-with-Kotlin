package edu.stts.materialcomponents.activity.menu5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_5_material_button.*

class MaterialButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_5_material_button)
        init()
    }

    private fun init() {
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Material Button Clicked", Toast.LENGTH_SHORT).show()
        })
    }
}
