package com.example.demoaplication.network


import androidx.multidex.BuildConfig
import com.example.demoaplication.util.UrlConstant
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitBuilder {


    private fun getRetrofit(): Retrofit {


        val interceptor = HttpLoggingInterceptor()
        interceptor.level = when (BuildConfig.BUILD_TYPE) {
             "release"-> HttpLoggingInterceptor.Level.NONE
            else -> {
                HttpLoggingInterceptor.Level.BODY
                HttpLoggingInterceptor.Level.HEADERS
            }
        }


        val okHttp= OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder()
            .baseUrl(UrlConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttp)
            .build()
    }

    val apiService: ApiInterface = getRetrofit().create(ApiInterface::class.java)

}