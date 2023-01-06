package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var fragment: FragmentContainerView
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment = findViewById(R.id.fragmentContainer)
        bottomNav = findViewById(R.id.bottomNav)

        replaceFragment(One())

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.one -> {
                    replaceFragment(One())
                }
                R.id.two -> {
                    replaceFragment(Two())
                }
            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}