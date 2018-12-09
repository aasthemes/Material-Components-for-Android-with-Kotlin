package edu.stts.materialcomponents.activity.menu15.TabAndScrolling

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm)  {
    // sebuah list yang menampung objek Fragment
//    private val pages = listOf(
//        FirstFragment(),
//        SecondFragment(),
//        ThridFragment()
//    )

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                FirstFragment()
            }
            1 -> SecondFragment()
            else -> {
                return ThirdFragment()

            }
        }
    }

    override fun getCount(): Int {
        return 3
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
    //TambahPagerAdapter
}