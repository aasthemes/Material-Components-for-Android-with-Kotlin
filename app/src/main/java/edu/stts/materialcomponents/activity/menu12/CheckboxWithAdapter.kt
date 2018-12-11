package edu.stts.materialcomponents.activity.menu12

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ListView
import edu.stts.materialcomponents.R

class CheckboxWithAdapter : AppCompatActivity() {
    private var lv: ListView? = null
    private var modelArrayList: ArrayList<Model>? = null
    private var customAdapter: CustomAdapter? = null
    private var btnselect: Button? = null
    private var btndeselect: Button? = null
    private var btnnext: Button? = null
    private val animallist = arrayOf("Singa", "Kucing", "Anjing", "Ikan Pari", "Ikan Cupang", "Paus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_12_main)

        lv = findViewById(R.id.lv) as ListView
        btnselect = findViewById(R.id.select) as Button
        btndeselect = findViewById(R.id.deselect) as Button
        btnnext = findViewById(R.id.next) as Button

        modelArrayList = getModel(false)
        customAdapter = CustomAdapter(this, modelArrayList!!)
        lv!!.adapter = customAdapter

        btnselect!!.setOnClickListener {
            modelArrayList = getModel(true)
            customAdapter = CustomAdapter(this@CheckboxWithAdapter, modelArrayList!!)
            CustomAdapter.public_modelArrayList = modelArrayList as ArrayList<Model>
            lv!!.adapter = customAdapter
        }
        btndeselect!!.setOnClickListener {
            modelArrayList = getModel(false)
            customAdapter = CustomAdapter(this@CheckboxWithAdapter, modelArrayList!!)
            CustomAdapter.public_modelArrayList = modelArrayList as ArrayList<Model>
            lv!!.adapter = customAdapter
        }
        btnnext!!.setOnClickListener {
            val intent = Intent(this@CheckboxWithAdapter, NextActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getModel(isSelect: Boolean): ArrayList<Model> {
        val list = ArrayList<Model>()
        for (i in 0..5) {
            val model = Model()
            model.setSelecteds(isSelect)
            model.setAnimals(animallist[i])
            list.add(model)
        }
        return list
    }
}