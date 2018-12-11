package edu.stts.materialcomponents.activity.menu13

import android.content.Context
import android.graphics.Canvas
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.SwipeAdapter
import edu.stts.materialcomponents.activity.menu13.Adapter.Webservice
import edu.stts.materialcomponents.activity.menu13.Class.Webserviceclass
import edu.stts.materialcomponents.activity.menu13.Interface.Services
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_menu_13_swipeable.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory
import edu.stts.materialcomponents.activity.menu13.Class.SwipeController
import android.support.v7.widget.helper.ItemTouchHelper
import edu.stts.materialcomponents.activity.menu13.Class.SwipeControllerActions
import android.support.v7.widget.RecyclerView


class SwipeActivity: AppCompatActivity(), Callback<List<Webservice>> {

    lateinit var con: Context
    lateinit var swipeadapter: SwipeAdapter
    var swipeController: SwipeController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_swipeable)
        val toolbar = findViewById<View>(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Swipeable"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        con = this
        rv_swipeable.layoutManager = LinearLayoutManager(con)
        tryWebServices()

        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onFailure(call: Call<List<Webservice>>, error_message: Throwable) {
        Toast
            .makeText(
                this@SwipeActivity,
                error_message.message,
                Toast.LENGTH_LONG
            )
            .show()
    }

    override fun onResponse(call: Call<List<Webservice>>, response: Response<List<Webservice>>) {
        if (response.isSuccessful) {
            val listapi2 : MutableList<Webserviceclass> = mutableListOf()
            val data = response.body()
            data?.map {
                listapi2.add(Webserviceclass(it.title, it.body))
            }

            swipeadapter = SwipeAdapter(listapi2, con)
            rv_swipeable.adapter = swipeadapter
            swipeadapter.notifyDataSetChanged()
            rv_swipeable.setHasFixedSize(true)

            swipeController = SwipeController(object : SwipeControllerActions() {
                override fun onRightClicked(position: Int) {
                    swipeadapter.list.removeAt(position)
                    swipeadapter.notifyDataSetChanged()
                }
            })

            val itemTouchhelper = ItemTouchHelper(swipeController)
            itemTouchhelper.attachToRecyclerView(rv_swipeable)

            rv_swipeable.addItemDecoration(object : RecyclerView.ItemDecoration() {
                override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
                    swipeController!!.onDraw(c)
                }
            })
        }
    }

    private fun tryWebServices() {
        val gson = Gson()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
        val service = retrofit.create(Services::class.java)
        val caller = service.getPosts()
        caller.enqueue(this)
    }


}