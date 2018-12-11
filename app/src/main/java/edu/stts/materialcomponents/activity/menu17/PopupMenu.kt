package edu.stts.materialcomponents.activity.menu17

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast
import edu.stts.materialcomponents.R
import kotlinx.android.synthetic.main.activity_menu_17_popup_menu.*


class PopupMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_17_popup_menu)

        action_b.setOnClickListener {
            Toast.makeText(this, "You click Apps submenu", Toast.LENGTH_SHORT).show()
        }

        action_a.setOnClickListener {
            Toast.makeText(this, "You click Send submenu", Toast.LENGTH_SHORT).show()
        }

    }

}
