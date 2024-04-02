package com.example.ccpdemo.ui.mainactivity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ccpdemo.databinding.ActivityMainBinding
import com.example.ccpdemo.network.Response
import com.example.demoaplication.base.BaseActivity
import com.example.demoaplication.network.model.response.GifResponse
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
    private lateinit var rv_gif : RecyclerView
    private lateinit var pb_gifLoading : ProgressBar
    private lateinit var tv_nothing : TextView

    private  val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        til_search = binding.tilSearch
        et_search = binding.etSearch
        rv_gif = binding.rvGif
        pb_gifLoading = binding.pbGifLoading
        tv_nothing =  binding.tvNothing

        val layoutManager = LinearLayoutManager(this)
        rv_gif.layoutManager = layoutManager

        /*Observing the Fetched Live data*/
        mainActivityViewModel.response.observe(this) { result ->
            when (result) {
                is Response.Loading -> showLoading(result.identifier)
                is Response.Success -> showData(result.identifier, result.data)
                is Response.Error -> showError(result.identifier, result.errorMessage)
            }
        }


        /*Search EditText Opertion*/
        et_search.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                /*We dont need any befor text change Operation*/
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (isNetworkConnected()) {
                    mainActivityViewModel.getGifData(et_search.text.toString())
                } else {
                    showToast("No Internet Connection!!")
                }
            }

            override fun afterTextChanged(s: Editable?) {
                /*We dont need any after text change Operation*/
            }
        })


    }



    fun showLoading(identifire : String){
        pb_gifLoading.show()

    }

    private fun showError(identifier: String, errorMessage: String) {
        pb_gifLoading.hide()
        showToast("$identifier -  $errorMessage")
    }

    private fun showData(identifier: String, data: GifResponse) {
        pb_gifLoading.hide()
        Log.d(TAG, "showData: $data")
       if (data.data.size>0){
           rv_gif.visibility = View.VISIBLE
           tv_nothing.visibility = View.GONE
           val adapter = GifAdapter(data,this)
           rv_gif.adapter = adapter
       }else{
           tv_nothing.visibility = View.VISIBLE
           rv_gif.visibility = View.GONE
       }

    }
}