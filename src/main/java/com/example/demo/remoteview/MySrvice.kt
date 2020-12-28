package com.example.demo.remoteview

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MySrvice : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("ddebug","---onStartCommand---")
        return super.onStartCommand(intent, flags, startId)
    }
}