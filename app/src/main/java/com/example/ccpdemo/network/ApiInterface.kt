package com.example.demoaplication.network

import com.example.demoaplication.network.model.response.GifResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/v1/gifs/search?api_key=229ac3e932794695b695e71a9076f4e5&limit=25&offset=0&rating=G&lang=en")
    suspend fun getGIFData(@Query("q") searchQuery : String) : GifResponse
}