package edu.stts.materialcomponents.activity.menu6

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_6.*
import kotlinx.android.synthetic.main.activity_menu_6_zoominzoomout.*
import kotlinx.android.synthetic.main.activity_menu_6_zoominzoomout.view.*
import com.github.chrisbanes.photoview.PhotoView




class Menu6Activity: AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_6)

        init()
    }

    @SuppressLint("WrongViewCast")
    private fun init() {


        buttonSlider.setOnClickListener{
            setContentView(R.layout.activity_menu_6_slider_view)
        }

        buttonRounded.setOnClickListener{
            setContentView(R.layout.activity_menu_6_rounded_view)
        }

        buttonCircular.setOnClickListener{
            setContentView(R.layout.activity_menu_6_circular_view)

        }

        buttonZoom.setOnClickListener{
            setContentView(R.layout.activity_menu_6_zoom_view)

            val photoView = findViewById<View>(R.id.photo_view) as PhotoView
            photoView.setImageResource(R.drawable.logo)
        }

    }

}