package com.example.latihan

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class adapter (val context: Context,val listData:ArrayList<Data>) :RecyclerView.Adapter<adapter.DataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val list = listData[position]
        holder.gambar.setImageResource(list.image)
        holder.deskripsi.text = list.desc

        holder.status.text = list.status
        if (list.status == "Berhasil"){
            holder.status.setBackgroundResource(R.drawable.bg_status)
        } else {
            holder.status.setBackgroundResource(R.drawable.bg_gagal)
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(context, Deskripsi::class.java)
            intent.putExtra("gambar", list.image)
            intent.putExtra("deskripsi", list.desc)
            intent.putExtra("status", list.status)
            startActivity(context, intent, null)
        }

    }

    override fun getItemCount(): Int {
        return listData.size
    }
    class DataViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val gambar : ImageView = itemView.findViewById(R.id.gambar)
        val deskripsi : TextView = itemView.findViewById(R.id.teks)
        val status : TextView = itemView.findViewById(R.id.status)
    }
}