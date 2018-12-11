package edu.stts.materialcomponents.activity.menu7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_custom_drawlable_progress_bar.*
import kotlinx.android.synthetic.main.activity_my_progressbar_intermadiate.*
import kotlin.concurrent.thread
import kotlin.system.exitProcess

class myProgressbarIntermadiate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_progressbar_intermadiate)

        // get the references from layout file
        val btnStartProgress = this.button123

        var progress: Int = 0
        progressBar123.visibility = View.INVISIBLE
        btnStartProgress.setOnClickListener {
            try {
                toast("progress bar is visible")
                progressBar123.visibility = View.VISIBLE
                if(progressBar123.visibility == View.VISIBLE){
                    setProgressValue(progress)
                }
            }catch (e:Exception){
                toast(e.toString())
            }
        }

    }

    public fun setProgressValue(progress: Int){
        Thread(Runnable {
            progressBar123.max = 100
            this@myProgressbarIntermadiate.runOnUiThread(java.lang.Runnable {
                progressBar123.visibility = View.VISIBLE
                if(progressBar123.progress == 100){
                    progressBar123.visibility = View.GONE
                    toast("Progress Bar was gone")
                    killThread()
                    exitProcess(1)
                    //Thread.currentThread().stop()

                    //finish()
                }
                try {
                    Thread.sleep(1000)
                    progressBar123.setProgress(progress)
                    setProgressValue(progress + 10)
                }   catch (e : Exception){
                    toast(e.toString())
                }
            })
        }).start()
    }

    public fun killThread(){
        Thread(Runnable {
            this@myProgressbarIntermadiate.runOnUiThread(java.lang.Runnable {
                Thread.currentThread().interrupt()
            })
        }).interrupt()
    }

}
