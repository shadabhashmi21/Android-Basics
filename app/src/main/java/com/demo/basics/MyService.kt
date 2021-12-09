package com.demo.basics

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.widget.Toast

open class MyService : Service() {
    private lateinit var player: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show()
        player= MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI)
        player.isLooping = true;
        player.start()
        return START_STICKY
    }

    override fun onDestroy() {
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show()
        super.onDestroy()
        player.stop()
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}