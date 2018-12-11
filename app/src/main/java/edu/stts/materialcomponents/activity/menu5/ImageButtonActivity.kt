package edu.stts.materialcomponents.activity.menu5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_5_image_button.*

class ImageButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_5_image_button)
        init()
    }

    private fun init() {
        imageButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Image Button Clicked", Toast.LENGTH_SHORT).show()
        })
    }
}
