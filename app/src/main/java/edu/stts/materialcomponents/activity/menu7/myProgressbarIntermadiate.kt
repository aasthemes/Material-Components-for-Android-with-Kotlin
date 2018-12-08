package edu.stts.materialcomponents.activity.menu7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_progressbar_intermadiate.*

class myProgressbarIntermadiate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_progressbar_intermadiate)

        // get the references from layout file
        val btnStartProgress = this.button123
        //val progressBar: ProgressBar = this.progressBar123

        // when button is clicked, start the task
        btnStartProgress.setOnClickListener { v ->

            // task is run on a thread
            Thread(Runnable {
                // dummy thread mimicking some operation whose progress cannot be tracked

                // display the indefinite progressbar
                this@myProgressbarIntermadiate.runOnUiThread(java.lang.Runnable {
                    progressBar123.visibility = android.view.View.VISIBLE
                })

                // performing some dummy time taking operation
                try {
                    var i=0;
                    while(i<Int.MAX_VALUE){
                        i++
                        progressBar123.progress + i

                        if(progressBar123.progress == 100){
                            // when the task is completed, make progressBar gone
                            this@myProgressbarIntermadiate.runOnUiThread(java.lang.Runnable {
                                progressBar123.visibility = android.view.View.GONE
                            })
                        }
                    }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }


            }).start()
        }

    }
}
