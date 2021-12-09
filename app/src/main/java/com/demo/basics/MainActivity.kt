package com.demo.basics

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.Settings
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "FirstPage onCreated", Toast.LENGTH_SHORT).show()

        // Page Navigation Demo
        val navigationBtn: Button = findViewById(R.id.page_navigation_btn)
        navigationBtn.setOnClickListener {
            val secondPageIntent = Intent(this, SecondPage::class.java)
            startActivity(secondPageIntent)
        }

        // Service Demo
        val serNavBtn = findViewById<Button>(R.id.service_navigation_btn)
        serNavBtn.setOnClickListener{
            val serviceIntent = Intent(this, ServiceActivity::class.java)
            startActivity(serviceIntent)
        }

        val receiverBtn: Button = findViewById(R.id.receiver_btn)
        receiverBtn.setOnClickListener {
            sendBroadcast(Intent(this, MyReceiver::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "FirstPage onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "FirstPage onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "FirstPage onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "FirstPage onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "FirstPage onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "FirstPage onRestart", Toast.LENGTH_SHORT).show()
    }
}