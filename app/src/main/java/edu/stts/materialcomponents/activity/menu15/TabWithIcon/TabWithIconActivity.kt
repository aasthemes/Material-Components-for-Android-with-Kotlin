package edu.stts.materialcomponents.activity.menu15.TabWithIcon

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_15_tabwithicon.*

class TabWithIconActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_15_tabwithicon)

//        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
//        tabs_main.setupWithViewPager(viewpager_main)
        configureTabLayout()
    }

    private fun configureTabLayout() {
        tab_layout.addTab(tab_layout.newTab().setIcon(
            android.R.drawable.ic_dialog_email))
        tab_layout.addTab(tab_layout.newTab().setIcon(
            android.R.drawable.ic_dialog_dialer))
        tab_layout.addTab(tab_layout.newTab().setIcon(
            android.R.drawable.ic_dialog_info))

        val adapter = MyPagerAdapter(supportFragmentManager,
            tab_layout.tabCount)
        viewpager_main.adapter = adapter

        viewpager_main.addOnPageChangeListener(
            TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewpager_main.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }

        })
    }
}

//TambahSecondFragment