package edu.stts.materialcomponents.activity.menu13.Class

class Webserviceclass() {

    lateinit var title: String
    lateinit var body: String

    constructor(title: String, body: String) : this() {
        this.title = title
        this.body = body
    }


    fun getTitles() : String {
        return title
    }

    fun getBodies() : String {
        return body
    }

}