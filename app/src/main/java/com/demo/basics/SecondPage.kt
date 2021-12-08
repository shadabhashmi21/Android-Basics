package com.demo.basics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v4.view.ViewPager
import android.widget.Toast

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        Toast.makeText(this, "SecondPage onCreated", Toast.LENGTH_SHORT).show()
    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "SecondPage onStart", Toast.LENGTH_SHORT).show()
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment_placeholder, CustomFragment())
        ft.commit()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "SecondPage onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "SecondPage onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "SecondPage onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "SecondPage onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "SecondPage onRestart", Toast.LENGTH_SHORT).show()
    }
}