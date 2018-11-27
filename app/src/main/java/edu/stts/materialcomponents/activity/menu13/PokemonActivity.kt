package edu.stts.materialcomponents.activity.menu13

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.PokemonAdapter
import edu.stts.materialcomponents.activity.menu13.Class.Pokemons
import edu.stts.materialcomponents.utils.Tools
import kotlinx.android.synthetic.main.activity_menu_13_pokemon.*
import java.util.*

class PokemonActivity: AppCompatActivity() {

    var list: MutableList<Pokemons> = mutableListOf()

    lateinit var searchView : SearchView
    lateinit var dadapter: PokemonAdapter
    lateinit var con: Context

    var image = intArrayOf(
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

    var name = arrayListOf(
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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_pokemon)

//        toolbar
        val toolbar = findViewById<View>(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Pokemon"

        newList()
        con = this
        rv_pokemon.layoutManager = LinearLayoutManager(con)
        setData()
        Tools.setSystemBarColor(this, R.color.grey_1000)
    }

    private fun newList() {
        list = mutableListOf()
        for (index in name.indices) {
            val pk = Pokemons(name[index], image[index])
            list.add(pk)
        }
        list.sortBy { it.getName() }
    }

    private fun setData()
    {
        dadapter = PokemonAdapter(list, con)
        rv_pokemon.adapter = dadapter
        rv_pokemon.setHasFixedSize(true)
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
                newList()
                setData()
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
                    newList()
                } else {
                    var tempList: MutableList<Pokemons> = mutableListOf()
                    for (index in name.indices) {
                        if (name[index].contains(query.toString())) {
                            var pk = Pokemons(name[index], image[index])
                            tempList.add(pk)
                        }
                    }
                    list = tempList
                    list.sortBy { it.getName() }
                }

                setData()
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

}