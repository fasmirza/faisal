package com.example.ccpdemo.ui.mainactivity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.ccpdemo.databinding.ActivityMainBinding
import com.example.ccpdemo.network.Response
import com.example.demoaplication.base.BaseActivity
import com.example.demoaplication.viewmodel.MainActivityViewModel
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainActivityViewModel : MainActivityViewModel by viewModels()
    private lateinit var til_search: TextInputLayout
    private lateinit var et_search: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        til_search = binding.tilSearch
        et_search = binding.etSearch


        et_search.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               mainActivityViewModel.getGifData(et_search.text.toString())
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        // Observe the LiveData object in the ViewModel
        mainActivityViewModel.response.observe(this, Observer { response ->
            when (response) {
                is Response.Loading -> {
                    // Show loading state
                }
                is Response.Success -> {
                    val data = response.data
                    // Update UI with the fetched data
                }
                is Response.Error -> {
                    val errorMessage = response.message
                    // Show error message
                }
            }
        })
    }
}