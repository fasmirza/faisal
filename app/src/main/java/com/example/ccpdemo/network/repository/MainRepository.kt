package com.example.demoaplication.network.repository

import com.example.ccpdemo.network.Response
import com.example.demoaplication.network.RetrofitBuilder
import com.example.demoaplication.network.RetrofitBuilder.apiService
import com.example.demoaplication.network.model.response.GifResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class MainRepository @Inject constructor(private val retrofit: RetrofitBuilder) {


    suspend fun fetchData(queryString: String): Flow<Response<GifResponse>> = flow {
        emit(Response.Loading)
        try {
            val response = apiService.getGIFData(queryString)
            emit(Response.Success(response))
        } catch (e: HttpException) {
            emit(Response.Error(e.message ?: "An error occurred"))
        }
    }
}