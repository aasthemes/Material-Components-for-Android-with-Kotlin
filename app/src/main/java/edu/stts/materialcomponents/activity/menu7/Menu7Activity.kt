package edu.stts.materialcomponents.activity.menu7

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_7.*

class Menu7Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_7)
        init()

        buttonmyIndeterminateProgressBar.setOnClickListener(){
            val i = Intent(this, myProgressbarIntermadiate::class.java)
            startActivity(i)
        }

        buttonmyWebViewWithProgressBar.setOnClickListener(){
            val i = Intent(this, WebViewWithProgressBar::class.java)
            startActivity(i)
        }

        buttonmyDialogProgressBar.setOnClickListener(){
            val i = Intent(this, myDialogProgressBar::class.java)
            startActivity(i)
        }

        buttonmyStyleProgressBar.setOnClickListener(){
            val i = Intent(this, myStyleProgressBar::class.java)
            startActivity(i)
        }

        buttonmyAsyncTaskProgressBar.setOnClickListener(){
            val i = Intent(this, myAsyProgressBar::class.java)
            startActivity(i)
        }

    }

    private fun init() {
    }

}