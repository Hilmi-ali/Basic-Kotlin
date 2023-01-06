package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Deskripsi : AppCompatActivity() {
    private lateinit var img : ImageView
    private lateinit var teks : TextView
    private lateinit var statu : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        img  = findViewById(R.id.gambar)
        teks  = findViewById(R.id.ket)
        statu = findViewById(R.id.status)

        val pict = intent.getStringExtra("gambar")
        val deks = intent.getStringExtra("deskripsi")
        val stat = intent.getStringExtra("status")

        teks.text = deks
        statu.text = stat
    }
}