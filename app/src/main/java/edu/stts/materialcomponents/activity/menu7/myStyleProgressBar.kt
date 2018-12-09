package edu.stts.materialcomponents.activity.menu7

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_style_progress_bar.*
import kotlin.system.exitProcess

class myStyleProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_style_progress_bar)

        progressBarHorizontal.visibility = View.INVISIBLE
        progressBarCircle.visibility = View.INVISIBLE
        var progress: Int = 0
        var myProgress: ProgressBar = progressBarHorizontal
        buttonProcess.setOnClickListener(){
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
            }else if(progressBarCircle.visibility == View.VISIBLE){
                myProgress = progressBarCircle
                myProgress.max = 100
            }
            setProgressValue(progress,myProgress)
        }
    }

    public fun setProgressValue(progress: Int, myProgress: ProgressBar){

        Thread(Runnable {
            @Override
            fun run(){
                try {
                    //Thread.sleep(10)
                    myProgress.setProgress(progress)
                    toast(" Harap tunggu: $progress%")

                    if(myProgress.progress != 100){
                        setProgressValue(progress + 10,myProgress)
                    }else{
                        myProgress.visibility = View.GONE
                        toast("sukses")
                    }
                }   catch (e : Exception){
                    toast(e.toString())
                }

            }
        }).start()
    }
}

