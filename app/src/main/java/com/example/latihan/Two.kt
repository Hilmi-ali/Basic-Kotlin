package com.example.latihan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Two : Fragment() {
    private lateinit var btn : Button
    private lateinit var editNama: EditText
    private lateinit var editAlamat : EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_two, container, false)

        btn = view.findViewById(R.id.sendData)
        editAlamat = view.findViewById(R.id.inputAlamat)
        editNama = view.findViewById(R.id.inputNama)

        btn.setOnClickListener {
            startActivity(Intent(activity,End::class.java).
            putExtra("nama", editNama.text.toString()).
            putExtra("alamat", editAlamat.text.toString()))
        }

    return view
    }
}