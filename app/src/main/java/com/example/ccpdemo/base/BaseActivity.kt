package com.example.demoaplication.base

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity

open class BaseActivity : ComponentActivity() {


    protected open fun showToast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_SHORT).show()
    }

    fun ProgressBar.show() {
        visibility = View.VISIBLE
    }

    fun ProgressBar.hide() {
        visibility = View.GONE
    }

    fun Context.isNetworkConnected(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
            return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
        } else {
            val networkInfo = connectivityManager.activeNetworkInfo ?: return false
            return networkInfo.isConnected
        }
    }
}