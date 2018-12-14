package edu.stts.materialcomponents.activity.menu11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_menu_11_addmenu3.*

class AddMenu3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        setContentView(R.layout.activity_menu_11_addmenu3)
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun init() {
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbarmenu3)
        val actionBar = supportActionBar
        actionBar?.title = ""
    }
}
