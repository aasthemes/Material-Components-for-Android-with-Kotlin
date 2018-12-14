package edu.stts.materialcomponents.activity.menu6

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_6.*
import com.github.chrisbanes.photoview.PhotoView
import kotlinx.android.synthetic.main.activity_menu_6_click_view.*


public class Menu6Activity: AppCompatActivity() {

    private val imageUrls = arrayOf(
        "https://cdn.pixabay.com/photo/2016/11/11/23/34/cat-1817970_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/11/07/00/07/fantasy-2925250_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/10/10/15/28/butterfly-2837589_960_720.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_6)

        init()
    }

    @SuppressLint("WrongViewCast")
    private fun init() {


        buttonSlider.setOnClickListener{
            setContentView(R.layout.activity_menu_6_slider_view)

            val viewPager = findViewById<ViewPager>(R.id.view_pager)
            val adapter = ViewPagerAdapter(this, imageUrls)
            viewPager.adapter = adapter
        }


        buttonCircular.setOnClickListener{
            setContentView(R.layout.activity_menu_6_circular_view)

        }

        buttonZoom.setOnClickListener{
            setContentView(R.layout.activity_menu_6_zoom_view)

            val photoView = findViewById<View>(R.id.photo_view) as PhotoView
            photoView.setImageResource(R.drawable.logo)
        }

        buttonParallax.setOnClickListener{
            setContentView(R.layout.activity_menu_6_parallax_view)

            val photoView = findViewById<View>(R.id.photo_view) as PhotoView
            photoView.setImageResource(R.drawable.logo)
        }

        buttonClick.setOnClickListener{
            setContentView(R.layout.activity_menu_6_click_view)

            click_image.setOnClickListener{
                Toast.makeText(this,"Ini hasil dari click gambar !", Toast.LENGTH_LONG).show()
            }
        }

    }

}