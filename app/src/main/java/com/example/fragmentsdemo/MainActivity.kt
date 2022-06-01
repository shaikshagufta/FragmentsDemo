package com.example.fragmentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment()
    }
    private fun addFragment() {
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction :FragmentTransaction = fragmentManager.beginTransaction()
        val sampleFragment: Fragment = SampleFragment()
        fragmentTransaction.add(R.id.fragment_container, sampleFragment)
    }
}