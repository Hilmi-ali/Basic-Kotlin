package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class End : AppCompatActivity() {
    private lateinit var name : TextView
    private lateinit var alamate : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        name = findViewById(R.id.nama)
        alamate = findViewById(R.id.alamat)

        val namane = intent.getStringExtra("nama")
        val addres = intent.getStringExtra("alamat")

        name.text = "Nama : " + namane
        alamate.text = "Alamat : " + addres

        val btn : Button = findViewById(R.id.kembali)
        btn.setOnClickListener {
            finish()
        }
    }
}