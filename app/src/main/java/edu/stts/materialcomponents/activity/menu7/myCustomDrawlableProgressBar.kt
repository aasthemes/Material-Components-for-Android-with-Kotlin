package edu.stts.materialcomponents.activity.menu7

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_custom_drawlable_progress_bar.*
import kotlinx.android.synthetic.main.activity_my_style_progress_bar.*
import kotlin.system.exitProcess

class myCustomDrawlableProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_custom_drawlable_progress_bar)
        myProgresBarDraw.visibility = View.INVISIBLE
        myProgresBarDraw2.visibility = View.INVISIBLE
        myProgresBarDraw.max = 100
        myProgresBarDraw2.max = 100
        var progress: Int = 0
        var myProgress: ProgressBar

        myButtonOk.setOnClickListener(){
            try {
                if(radioButtonGoogle.isChecked){
                    myProgresBarDraw.visibility = View.VISIBLE
                    myProgresBarDraw2.visibility = View.INVISIBLE

                }else if(radioButtonDarkGoole.isChecked){
                    myProgresBarDraw2.visibility = View.VISIBLE
                    myProgresBarDraw.visibility = View.INVISIBLE
                }

                if(myProgresBarDraw.visibility == View.VISIBLE){
                    myProgress = myProgresBarDraw
                    setProgressValue(progress,myProgress)
                }else if(myProgresBarDraw2.visibility == View.VISIBLE){
                    myProgress = myProgresBarDraw2
                    setProgressValue(progress,myProgress)
                }
            }catch (e: Exception){
                toast(e.toString())
            }
        }
    }

    public fun setProgressValue(progress: Int, myProgress: ProgressBar){
        Thread(Runnable {
            myProgress.max = 100
            this@myCustomDrawlableProgressBar.runOnUiThread(java.lang.Runnable {
                myProgress.visibility = View.VISIBLE
                if(myProgress.progress == 100){
                    myProgress.visibility = View.GONE
                    exitProcess(1)
                }
                try {
                    Thread.sleep(1000)
                    myProgress.setProgress(progress)
                    setProgressValue(progress + 10,myProgress)
                }   catch (e : Exception){
                    toast(e.toString())
                }
            })
        }).start()
    }
}
