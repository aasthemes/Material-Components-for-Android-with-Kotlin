package edu.stts.materialcomponents.activity.menu15.TabWithIcon

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_15_tabwithicon.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
        tabs_main.setupWithViewPager(viewpager_main)
    }
}

//TambahSecondFragment