package edu.stts.materialcomponents.activity.menu10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import javax.swing.text.View
import java.awt.Button



class Menu10Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showToast = findViewById(R.id.showToast) as Button
        showToast.setOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                Toast.makeText(this@MainActivity, "Toast Success", Toast.LENGTH_SHORT).show()
            }
        })

    }

    private fun init() {
    }

}