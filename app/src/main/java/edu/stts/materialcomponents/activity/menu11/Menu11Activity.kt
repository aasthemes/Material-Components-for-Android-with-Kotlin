package edu.stts.materialcomponents.activity.menu11

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.MenuItem
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu1.Menu1Activity
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu_11_toolbar.*
import kotlinx.android.synthetic.main.toolbar_main.*

class Menu11Activity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_11)
        init()
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun init() {
        setupToolbar()
        setupNavView()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbarmenu)
        val actionBar = supportActionBar
        actionBar?.title = ""
    }

    private fun setupNavView() {
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbarmenu, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toggle.isDrawerIndicatorEnabled = false
        toggle.setHomeAsUpIndicator(R.drawable.ic_menu)
        toggle.syncState()
        toggle.setToolbarNavigationClickListener { drawerLayout.openDrawer(GravityCompat.START) }
        navView.menu.clear()
        navView.inflateMenu(R.menu.activity_menu_11_menu)
        navView.itemIconTintList = null
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawers()
        when (item.itemId) {
            android.R.id.home -> if (drawerLayout.isDrawerOpen(Gravity.START)) {
                drawerLayout.closeDrawer(Gravity.START)
            } else drawerLayout.openDrawer(Gravity.START)
            R.id.menu1 -> {
                val i = Intent(this, AddMenu1Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu2 -> {
                val i = Intent(this, AddMenu2Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu3 -> {
                val i = Intent(this, AddMenu3Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu4 -> {
                val i = Intent(this, AddMenu4Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu5 -> {
                val i = Intent(this, AddMenu5Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
        }
        return true
    }

}