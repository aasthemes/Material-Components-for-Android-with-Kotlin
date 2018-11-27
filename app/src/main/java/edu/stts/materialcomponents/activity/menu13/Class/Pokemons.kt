package edu.stts.materialcomponents.activity.menu13.Class

class Pokemons() {

    private lateinit var name: String
    private var gambar: Int = 0

    constructor(name: String, gambar: Int) : this() {
        this.name = name
        this.gambar = gambar
    }

    fun getName() : String {
        return name
    }

    fun getImagePlace() : Int {
        return gambar
    }


    fun setName(name : String){
        this.name = name
    }

    fun setImagePlace(gambar: Int){
        this.gambar = gambar
    }



}