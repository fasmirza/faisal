package com.example.ccpdemo.network
sealed class Response<out T> {
    data class Success<T>(val data: T, val identifier: String) : Response<T>()
    data class Loading<T>(val identifier: String, val data: T? = null) : Response<T>()
    data class Error<T>(val identifier: String, val errorMessage: String, val data: T? = null) : Response<T>()
}