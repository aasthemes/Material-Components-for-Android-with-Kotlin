package edu.stts.materialcomponents.activity.menu15

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu15.TabBasic.MainActivity

class Menu15Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_15)
        init()

        val button1 = findViewById<Button>(R.id.button1) as Button
        val button2 = findViewById<Button>(R.id.button2) as Button
        val button3 = findViewById<Button>(R.id.button3) as Button
        val button4 = findViewById<Button>(R.id.button4) as Button
        val button5 = findViewById<Button>(R.id.button5) as Button


//        button1.setOnClickListener{
//            val intent = Intent(context, MainActivity::class.java)
//            startActivity(intent);
//        }
//        button2.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabAndScrolling.MainActivity::class.java)
//            startActivity(intent);
//        }
//        button3.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabWithIcon.MainActivity::class.java)
//            startActivity(intent);
//        }
//        button4.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabWithText.MainActivity::class.java)
//            startActivity(intent);
//        }
//        button5.setOnClickListener{
//            val intent = Intent(context, edu.stts.materialcomponents.activity.menu15.TabWithIconAndText.MainActivity::class.java)
//            startActivity(intent);
//        }
    }

    private fun init() {
    }

}