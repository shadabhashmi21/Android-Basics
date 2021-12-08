package com.demo.basics

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ServiceActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var start : Button
    private lateinit var stop : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        start = findViewById(R.id.start_service_btn)
        stop = findViewById(R.id.stop_service_btn)

        start.setOnClickListener(this)
        stop.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v == start)
            startService(Intent(this, MyService::class.java))
        else if(v == stop)
            stopService(Intent(this, MyService::class.java))
    }
}