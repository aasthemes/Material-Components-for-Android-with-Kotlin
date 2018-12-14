package edu.stts.materialcomponents.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu2.Menu2Activity
import edu.stts.materialcomponents.activity.menu3.Menu3Activity
import edu.stts.materialcomponents.activity.menu1.Menu1Activity
import edu.stts.materialcomponents.activity.menu10.Menu10Activity
import edu.stts.materialcomponents.activity.menu11.Menu11Activity
import edu.stts.materialcomponents.activity.menu12.Menu12Activity
import edu.stts.materialcomponents.activity.menu13.Menu13Activity
import edu.stts.materialcomponents.activity.menu14.Menu14Activity
import edu.stts.materialcomponents.activity.menu15.Menu15Activity
import edu.stts.materialcomponents.activity.menu16.Menu16Activity
import edu.stts.materialcomponents.activity.menu17.Menu17Activity
import edu.stts.materialcomponents.activity.menu4.Menu4Activity
import edu.stts.materialcomponents.activity.menu5.Menu5Activity
import edu.stts.materialcomponents.activity.menu6.Menu6Activity
import edu.stts.materialcomponents.activity.menu7.Menu7Activity
import edu.stts.materialcomponents.activity.menu8.Menu8Activity
import edu.stts.materialcomponents.activity.menu9.Menu9Activity
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var exitTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    override fun onBackPressed() {
        doExitApp()
    }

    fun doExitApp() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            Toast.makeText(this, R.string.app_exit, Toast.LENGTH_SHORT).show()
            exitTime = System.currentTimeMillis()
        } else {
            finish()
        }
    }

    private fun init() {
        setupToolbar()
        setupNavView()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = ""
    }

    private fun setupNavView() {
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toggle.isDrawerIndicatorEnabled = false
        toggle.setHomeAsUpIndicator(R.drawable.ic_menu)
        toggle.syncState()
        toggle.setToolbarNavigationClickListener { drawerLayout.openDrawer(GravityCompat.START) }
        navView.menu.clear()
        navView.inflateMenu(R.menu.menu_main_drawer)
        navView.itemIconTintList = null
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawers()
        when (item.itemId) {
            android.R.id.home -> if (drawerLayout.isDrawerOpen(Gravity.START)) {
                drawerLayout.closeDrawer(Gravity.START)
            } else drawerLayout.openDrawer(Gravity.START)
            R.id.menu_1 -> {
                val i = Intent(this, Menu1Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_2 -> {
                val i = Intent(this, Menu2Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_3 -> {
                val i = Intent(this, Menu3Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_4 -> {
                val i = Intent(this, Menu4Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_5 -> {
                val i = Intent(this, Menu5Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_6 -> {
                val i = Intent(this, Menu6Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_7 -> {
                val i = Intent(this, Menu7Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_8 -> {
                val i = Intent(this, Menu8Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_9 -> {
                val i = Intent(this, Menu9Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_10 -> {
                val i = Intent(this, Menu10Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_11 -> {
                val i = Intent(this, Menu11Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_12 -> {
                val i = Intent(this, Menu12Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_13 -> {
                val i = Intent(this, Menu13Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_14 -> {
                val i = Intent(this, Menu14Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_15 -> {
                val i = Intent(this, Menu15Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_16 -> {
                val i = Intent(this, Menu16Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
            R.id.menu_17 -> {
                val i = Intent(this, Menu17Activity::class.java)
                startActivity(i)
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            }
        }
        return true
}
}
