package com.example.demoaplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ccpdemo.network.Response
import com.example.demoaplication.network.model.response.GifResponse
import com.example.demoaplication.network.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor( private val mainRepository: MainRepository) : ViewModel() {


    private val _response = MutableLiveData<Response<GifResponse>>()
    val response: LiveData<Response<GifResponse>> = _response

    fun getGifData(queryString: String) {
        viewModelScope.launch {
            mainRepository.fetchData(queryString).collect { response ->
                _response.value = response
            }
        }
    }
}