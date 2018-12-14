package edu.stts.materialcomponents.activity.menu13.Class

class ItemObject {

    private var name: String
    private var gambar: Int

    constructor(name: String, gambar: Int) {
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