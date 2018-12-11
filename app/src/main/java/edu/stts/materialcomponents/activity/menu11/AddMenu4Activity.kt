package edu.stts.materialcomponents.activity.menu11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_menu_11_addmenu4.*

class AddMenu4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_11_addmenu4)
        init()
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun init() {
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbarmenu4)
        val actionBar = supportActionBar
        actionBar?.title = ""
    }
}
