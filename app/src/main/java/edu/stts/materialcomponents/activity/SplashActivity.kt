package edu.stts.materialcomponents.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import edu.stts.materialcomponents.R
import java.util.*

class SplashActivity : AppCompatActivity() {

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        bindLogo()
        val task = object : TimerTask() {
            override fun run() {

                // go to the login activity
                val i = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(i)

                // kill current activity
                finish()
            }
        }
        // Show splash screen for 3 seconds
        Timer().schedule(task, 3000)
    }

    private fun bindLogo() {
        // Start animating the image
        val splash = findViewById(R.id.splash) as ImageView
        val animation1 = AlphaAnimation(0.2f, 1.0f)
        animation1.duration = 700
        val animation2 = AlphaAnimation(1.0f, 0.2f)
        animation2.duration = 700
        //animation1 AnimationListener
        animation1.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationEnd(arg0: Animation) {
                // start animation2 when animation1 ends (continue)
                splash.startAnimation(animation2)
            }

            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationStart(arg0: Animation) {}
        })

        //animation2 AnimationListener
        animation2.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationEnd(arg0: Animation) {
                // start animation1 when animation2 ends (repeat)
                splash.startAnimation(animation1)
            }

            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationStart(arg0: Animation) {}
        })

        splash.startAnimation(animation1)
    }

}