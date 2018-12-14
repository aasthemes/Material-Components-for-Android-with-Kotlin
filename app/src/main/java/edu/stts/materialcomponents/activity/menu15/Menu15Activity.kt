package edu.stts.materialcomponents.activity.menu15

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu15.TabAndScrolling.TabAndScrollingActivity
import edu.stts.materialcomponents.activity.menu15.TabBasic.TabBasicActivity
import edu.stts.materialcomponents.activity.menu15.TabWithIcon.TabWithIconActivity
import edu.stts.materialcomponents.activity.menu15.TabWithIconAndText.TabWithIconAndTextActivity
import edu.stts.materialcomponents.activity.menu15.TabWithText.TabWithTextActivity
import kotlinx.android.synthetic.main.activity_menu_15.*

class Menu15Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_15)
        init()


        button1.setOnClickListener{
            val intent = Intent(this, TabBasicActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, TabAndScrollingActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent = Intent(this, TabWithIconActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent = Intent(this, TabWithTextActivity::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener{
            val intent = Intent(this, TabWithIconAndTextActivity::class.java)
            startActivity(intent)
        }

//        val button1 : Button = findViewById(R.id.button1)
//        val button2 = findViewById<Button>(R.id.button2) as Button
//        val button3 = findViewById<Button>(R.id.button3) as Button
//        val button4 = findViewById<Button>(R.id.button4) as Button
//        val button5 = findViewById<Button>(R.id.button5) as Button
//
//        button1.setOnClickListener {
//            // Handler code here.
//            val intent = Intent(this, TabBasicActivity::class.java)
//            startActivity(intent);
//        }
//        button1.setOnClickListener{
//            val intent = Intent(context, TabBasicActivity::class.java)
//            startActivity(intent);
//        }
//        button2.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabAndScrolling.TabBasicActivity::class.java)
//            startActivity(intent);
//        }
//        button3.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabWithIcon.TabBasicActivity::class.java)
//            startActivity(intent);
//        }
//        button4.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabWithText.TabBasicActivity::class.java)
//            startActivity(intent);
//        }
//        button5.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabWithIconAndText.TabBasicActivity::class.java)
//            startActivity(intent);
//        }
    }

    private fun init() {
    }

}