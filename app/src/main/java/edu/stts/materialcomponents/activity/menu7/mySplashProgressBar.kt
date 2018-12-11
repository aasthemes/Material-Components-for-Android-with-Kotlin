package edu.stts.materialcomponents.activity.menu7

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_my_dialog_progress_bar.*

class mySplashProgressBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_splash_progress_bar)
        myProgresBar.max = 100
        try {
            Thread(Runnable {
                this@mySplashProgressBar.runOnUiThread(java.lang.Runnable {
                    try {
                        var i = 0
                        while(i<100){
                            Thread.sleep(1000)
                            i = i + 1
                            myProgresBar.setProgress(i)
                            mySplash.text = "Proses: $i%"
                        }

                        startup()
                        finish()
                    }   catch (e : Exception){
                        toast(e.toString())
                    }
                })
            }).start()
        }catch (e :Exception){
            toast(e.toString())
        }
    }

    public fun splashNow(){
        Thread(Runnable {
            this@mySplashProgressBar.runOnUiThread(java.lang.Runnable {
                try {
                    myProgresBar.max = 100
                    var i = 0
                    while(i<100){
                        Thread.sleep(1000)
                        i = i + 1
                        myProgresBar.setProgress(i)
                        mySplash.text = "Proses: $i%"
                    }

                    startup()
                    finish()
                }   catch (e : Exception){
                    toast(e.toString())
                }
            })
        }).start()
    }

    public  fun doWork(){

        try{
            myProgresBar.max = 100
            var i = 0
            while(i<100){
                Thread.sleep(1000)
                i = i + 1
                myProgresBar.setProgress(i)
                mySplash.text = "Proses: $i%"
            }
        }catch (e:Exception){
            toast(e.toString())
        }

    }

    public fun  startup(){
        val i = Intent(this, Menu7Activity::class.java)
        startActivity(i)
        toast("sukses!")
    }
}
