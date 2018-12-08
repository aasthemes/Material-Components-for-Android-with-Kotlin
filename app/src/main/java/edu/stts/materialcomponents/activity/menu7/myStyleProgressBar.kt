package edu.stts.materialcomponents.activity.menu7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_style_progress_bar.*
import kotlin.system.exitProcess

class myStyleProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_style_progress_bar)

        buttonProcess.setOnClickListener(){
            if(radioButtonCicle.isChecked){
                progressBarCircle.visibility = android.view.View.VISIBLE
                var i=0;
                while(i<Int.MAX_VALUE){
                    i++
                    progressBarCircle.progress = progressBarCircle.progress + 10
                    textViewProgress.text = "Progress : $i%"
                    if(progressBarCircle.progress == 100){
                        progressBarCircle.visibility = android.view.View.GONE
                        exitProcess(1)
                    }
                }
            }else if(radioButtonHorizontal.isChecked){
                progressBarHorizontal.visibility = android.view.View.VISIBLE
                var i=0;
                while(i<Int.MAX_VALUE){
                    i++
                    progressBarHorizontal.progress  = progressBarHorizontal.progress + 10
                    textViewProgress.text = "Progress : $i%"
                    if(progressBarHorizontal.progress == 100){
                        progressBarHorizontal.visibility = android.view.View.GONE
                        exitProcess(1)
                    }
                }
            }
        }
    }
}
