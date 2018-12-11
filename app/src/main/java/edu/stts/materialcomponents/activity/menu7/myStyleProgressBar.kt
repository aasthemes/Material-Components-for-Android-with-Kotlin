package edu.stts.materialcomponents.activity.menu7

import android.app.ProgressDialog
import android.content.res.ColorStateList
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_style_progress_bar.*
import kotlin.system.exitProcess
import android.graphics.PorterDuff



class myStyleProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_style_progress_bar)

        progressBarHorizontal.visibility = View.INVISIBLE
        progressBarCircle.visibility = View.INVISIBLE
        var progress: Int = 0
        var myProgress: ProgressBar
        buttonProcess.setOnClickListener(){
            try{
                if(radioButtonHorizontal.isChecked){
                    progressBarHorizontal.visibility = View.VISIBLE
                    progressBarCircle.visibility = View.INVISIBLE

                }else if(radioButtonCicle.isChecked){
                    progressBarCircle.visibility = View.VISIBLE
                    progressBarHorizontal.visibility = View.INVISIBLE
                }

                if(progressBarHorizontal.visibility == View.VISIBLE){
                    myProgress = progressBarHorizontal
                    myProgress.max = 100
                    val color = Color.GREEN
                    myProgress.indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
                    setProgressValue(progress,myProgress)
                }else if(progressBarCircle.visibility == View.VISIBLE){
                    myProgress = progressBarCircle
                    myProgress.max = 100
                    val color = Color.GREEN
                    myProgress.indeterminateDrawable.setColorFilter(color, PorterDuff.Mode.SRC_IN)
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
            this@myStyleProgressBar.runOnUiThread(java.lang.Runnable {
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
            @Override
            fun run(){
            }
        }).start()
    }
}

