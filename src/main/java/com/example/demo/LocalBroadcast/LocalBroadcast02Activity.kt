package com.example.demo.LocalBroadcast

import android.content.BroadcastReceiver
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.demo.R

class LocalBroadcast02Activity : AppCompatActivity() {
    var mLocalBroadcastManager: LocalBroadcastManager? = null

    val action = "test_action"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_broadcast01)
        mLocalBroadcastManager = LocalBroadcastManager.getInstance(this)
    }
    fun send(v: View){
        val intent = Intent(action)
        mLocalBroadcastManager!!.sendBroadcast(intent)
    }

}