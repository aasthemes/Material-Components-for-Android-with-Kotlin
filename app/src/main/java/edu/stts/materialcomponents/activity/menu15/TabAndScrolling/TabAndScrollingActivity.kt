package edu.stts.materialcomponents.activity.menu15.TabAndScrolling

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_15_tabandscrolling.*

class TabAndScrollingActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_15_tabandscrolling)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
    }
    //tambahmain activity
}