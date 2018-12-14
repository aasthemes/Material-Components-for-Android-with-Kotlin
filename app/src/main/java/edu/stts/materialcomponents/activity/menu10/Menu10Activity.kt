package edu.stts.materialcomponents.activity.menu10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import edu.stts.materialcomponents.R



class Menu10Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_10)
//        ERROR, dikomen oleh team master
//        val showToast = findViewById(R.id.showToast) as Button
//        showToast.setOnClickListener(object : View.OnClickListener() {
//            fun onClick(v: View) {
//                Toast.makeText(this@Menu10Activity, "Toast Success", Toast.LENGTH_SHORT).show()
//            }
//        })

    }

    private fun init() {
    }

}