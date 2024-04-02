package com.example.demoaplication.network.repository

import com.example.ccpdemo.network.Response
import com.example.ccpdemo.util.ApiIdentifire.Companion.GIF_API_IDENTIFIRE
import com.example.demoaplication.network.RetrofitBuilder
import com.example.demoaplication.network.model.response.GifResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepository @Inject constructor(private val retrofit: RetrofitBuilder) {


     fun fetchData(queryString: String): Flow<Response<GifResponse>> = flow {
        try {
            emit(Response.Loading(GIF_API_IDENTIFIRE))
            val result = retrofit.apiService.getGIFData(queryString)
            emit(Response.Success(result, GIF_API_IDENTIFIRE))
        } catch (e: Exception) {
            emit(Response.Error(GIF_API_IDENTIFIRE, e.message ?: "Unknown error"))
        }
    }
}