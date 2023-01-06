package com.example.latihan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class One : Fragment() {
    private lateinit var btn : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)


        btn = view.findViewById(R.id.klik)
        val activity = getActivity()

        btn.setOnClickListener {
            val intent = Intent(activity, Recycler::class.java)
            startActivity(intent)
        }
        return view
    }
}