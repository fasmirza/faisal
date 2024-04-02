package com.example.ccpdemo.ui.mainactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ccpdemo.R
import com.example.demoaplication.network.model.response.GifResponse

class GifAdapter(private val dataList: GifResponse, private val context: Context) : RecyclerView.Adapter<GifAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_gifTitle: TextView = itemView.findViewById(R.id.tv_gifTitle)
        val iv_gifThumb : ImageView = itemView.findViewById(R.id.iv_gifThumb)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gif, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val itemData = dataList.data[position]
        holder.tv_gifTitle.text = itemData.title
        Glide.with(context)
            .load(itemData.images?.original?.url)
            .placeholder(R.mipmap.ic_launcher)
            .into(holder.iv_gifThumb)
    }

    override fun getItemCount(): Int {
        return dataList.data.size
    }
}
