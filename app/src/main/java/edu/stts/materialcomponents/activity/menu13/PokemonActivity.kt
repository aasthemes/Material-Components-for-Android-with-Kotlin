package edu.stts.materialcomponents.activity.menu13

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.PokemonAdapter
import kotlinx.android.synthetic.main.activity_menu_13_pokemon.*

class PokemonActivity: AppCompatActivity() {

    lateinit var searchView : SearchView

    lateinit var image: IntArray
    lateinit var name: ArrayList<String>

    lateinit var filter_image: IntArray
    lateinit var filter_name: ArrayList<String>

    lateinit var dadapter: PokemonAdapter

    lateinit var con: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_pokemon)

        val toolbar = findViewById<View>(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Pokemon"
        rv_basic.setHasFixedSize(true)

        image = intArrayOf(
            R.drawable.arbok,
            R.drawable.beedrill,
            R.drawable.bulbasaur,
            R.drawable.butterfree,
            R.drawable.caterpie,
            R.drawable.charizard,
            R.drawable.charmander,
            R.drawable.diglett,
            R.drawable.ekans,
            R.drawable.geodude,
            R.drawable.ivysaur,
            R.drawable.meowth,
            R.drawable.nidoran,
            R.drawable.paras,
            R.drawable.pidgeot,
            R.drawable.pidgey,
            R.drawable.psyduck,
            R.drawable.raichu,
            R.drawable.raticate,
            R.drawable.rattata,
            R.drawable.seel,
            R.drawable.spearow,
            R.drawable.squirtle,
            R.drawable.venusaur,
            R.drawable.voltorb,
            R.drawable.vulpix,
            R.drawable.weedle,
            R.drawable.weepinbell,
            R.drawable.pikachu
        )
        name = addNames()
        filter_name = name
        filter_image = image
        con = this
        dadapter = PokemonAdapter(filter_image, filter_name, this)
        rv_basic.layoutManager = LinearLayoutManager(this)
        rv_basic.adapter = dadapter
        dadapter.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu13_toolbar_search, menu)
        var item: MenuItem = menu!!.findItem(R.id.action_search_13)
        searchView = item.actionView as SearchView
        item.setOnActionExpandListener(object : MenuItem.OnActionExpandListener{
            override fun onMenuItemActionExpand(item: MenuItem?): Boolean {
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem?): Boolean {
                searchView.setQuery("", false)
                dadapter = PokemonAdapter(image, name, con)
                rv_basic.adapter = dadapter
                dadapter.notifyDataSetChanged()
                return true
            }
        })
        searchView.maxWidth = Int.MAX_VALUE
        searchName(searchView)
        return true
    }

    private fun searchName(searchView: SearchView) {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                var cek = false
                if (query.toString().isEmpty()) {
                    filter_name = name
                    filter_image = image
                } else {
                    var count = 0;
                    for (index in name.indices) {
                        if (name[index].contains(query.toString())) {
                            count++
                        }
                    }

                    if (count > 0) {
                        filter_name = ArrayList(count)
                        filter_image = IntArray(count)
                        var indexing = 0;
                        for (index in name.indices) {
                            if (name[index].contains(query.toString())) {
                                filter_name.add(name[index])
                                filter_image[indexing] = image[index]
                                indexing++
                            }
                        }
                    } else {
                        filter_image = image
                        filter_name = name
                        cek = true
                    }
                }

                dadapter = PokemonAdapter(filter_image, filter_name, con)
                rv_basic.adapter = dadapter
                dadapter.notifyDataSetChanged();
                if (cek) {
                    Toast.makeText(con, "Data Not Found", Toast.LENGTH_SHORT).show()
                }
//                Toast.makeText(con, "This is a message displayed in a Toast $query", Toast.LENGTH_SHORT).show()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == R.id.action_search_13) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }



    override fun onBackPressed() {
        if (!searchView.isIconified) {
            searchView.isIconified = true
            return
        }
        super.onBackPressed()
    }

    private fun addNames() : ArrayList<String> {
        return arrayListOf(
            "arbok",
            "beedrill",
            "bulbasaur",
            "butterfree",
            "caterpie",
            "charizard",
            "charmander",
            "diglett",
            "ekans",
            "geodude",
            "ivysaur",
            "meowth",
            "nidoran",
            "paras",
            "pidgeot",
            "pidgey",
            "psyduck",
            "raichu",
            "raticate",
            "rattata",
            "seel",
            "spearow",
            "squirtle",
            "venusaur",
            "voltorb",
            "vulpix",
            "weedle",
            "weepinbell",
            "pikachu"
        )

    }

}