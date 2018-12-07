package edu.stts.materialcomponents.activity.menu13.Interface

import edu.stts.materialcomponents.activity.menu13.Adapter.Webservice
import retrofit2.Call
import retrofit2.http.GET

interface Services {
    @GET("posts")
    fun getPosts(): Call<List<Webservice>>
}