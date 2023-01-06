package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Recycler : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList : ArrayList<Data>
    private lateinit var adapter: adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_activity)

        val btn : Button = findViewById(R.id.back)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        recyclerView = findViewById(R.id.listAmazon)
        recyclerView.layoutManager = LinearLayoutManager(this)
        dataList = ArrayList<Data>()

        val gambar = arrayOf(
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon,
            R.drawable.amazon
        )

        val teks = arrayOf(
            "Amazon",
            "Amazoff",
            "Ankara Messi",
            "Amazon",
            "Amazoff",
            "Ankara Messi",
            "Amazon",
            "Amazoff",
            "Ankara Messi"
        )
        val ket = arrayOf(
            "Berhasil",
            "Gagal",
            "Berhasil",
            "Gagal",
            "Gagal",
            "Berhasil",
            "Gagal",
            "Berhasil",
            "Berhasil"
        )

        for (i in gambar.indices){
            dataList.add(
                Data(
                    gambar[i],
                    teks[i],
                    ket[i]
                )
            )
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter(this, dataList)
    }
}