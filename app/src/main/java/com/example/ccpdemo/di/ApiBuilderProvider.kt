package com.example.demoaplication.di

import com.example.demoaplication.network.RetrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApiBuilderProvider {

    @Provides
    fun provideAPIInterface() : RetrofitBuilder{
        return RetrofitBuilder
    }
}