package edu.stts.materialcomponents.activity.menu13

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.View
import edu.stts.materialcomponents.R
import edu.stts.materialcomponents.activity.menu13.Adapter.PokemonAdapter
import kotlinx.android.synthetic.main.activity_menu_13_pokemon.*

class PokemonActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_13_pokemon)

        val toolbar = findViewById<View>(R.id.toolbar2) as Toolbar
        setSupportActionBar(toolbar);
        supportActionBar?.title = "Pokemon"
        rv_basic.setHasFixedSize(true)

        val image = intArrayOf(
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
            R.drawable.weepinbell
        )
        val name = addNames()



        rv_basic.layoutManager = LinearLayoutManager(this)
        rv_basic.adapter = PokemonAdapter(image, name, this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu13_toolbar_search, menu)
        return true
    }

    private fun addNames() : Array<String> {
        return arrayOf(
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
            "weepinbell"
        )

    }

}