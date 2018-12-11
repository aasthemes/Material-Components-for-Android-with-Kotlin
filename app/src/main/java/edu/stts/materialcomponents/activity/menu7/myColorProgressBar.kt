package edu.stts.materialcomponents.activity.menu7

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_color_progress_bar.*
import kotlinx.android.synthetic.main.activity_my_style_progress_bar.*
import android.graphics.PorterDuff
import android.view.View
import android.widget.ProgressBar
import kotlin.system.exitProcess


class myColorProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_color_progress_bar)

        myProgressBar.visibility = View.INVISIBLE
        myProgressBar.max = 100
        var i: Int = 0
        myButtonProcess.setOnClickListener(){
            try{
                if(radioButtonBiru.isChecked){
                    myProgressBar.visibility = View.VISIBLE
                    val color = Color.BLUE
                    myProgressBar.indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
                }else if(radioButtonHijau.isChecked){
                    myProgressBar.visibility = View.VISIBLE
                    val color = Color.GREEN
                    myProgressBar.indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
                }else if(radioButtonKuning.isChecked){
                    myProgressBar.visibility = View.VISIBLE
                    val color = Color.YELLOW
                    myProgressBar.indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
                }else if(radioButtonMerah.isChecked){
                    myProgressBar.visibility = View.VISIBLE
                    val color = Color.RED
                    myProgressBar.indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
                }
            }catch (e : Exception){
                toast(e.toString())
            }
        }
    }
}
