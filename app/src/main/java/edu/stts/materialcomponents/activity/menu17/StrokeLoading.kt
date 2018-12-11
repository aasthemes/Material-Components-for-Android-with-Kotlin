package edu.stts.materialcomponents.activity.menu17

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.jorgecastilloprz.FABProgressCircle
import edu.stts.materialcomponents.R

class StrokeLoading : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_17_stroke_loading)

        val strikeFAB = findViewById(R.id.fabProgressCircle) as FABProgressCircle
        strikeFAB.setOnClickListener {
            strikeFAB.show()
        }
    }
}
