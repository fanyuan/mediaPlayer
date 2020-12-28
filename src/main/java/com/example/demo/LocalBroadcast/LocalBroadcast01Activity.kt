package com.example.demo.LocalBroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.demo.R


class LocalBroadcast01Activity : AppCompatActivity() {
    var mLocalBroadcastManager: LocalBroadcastManager? = null

    var mReceiver: BroadcastReceiver? = null

    val action = "test_action"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_broadcast02)
        mLocalBroadcastManager = LocalBroadcastManager.getInstance(this)


        val filter = IntentFilter()

        filter.addAction(action)

        mReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent) {
                Log.d("ddebug", "LocalBroadcast onReceive")
                if (intent.action == action) {
                    Log.d("ddebug", "收到了action")
                }
            }
        }

        mLocalBroadcastManager!!.registerReceiver(mReceiver as BroadcastReceiver, filter)

    }
    fun send(v: View){
        val intent = Intent(action)
        mLocalBroadcastManager!!.sendBroadcast(intent)
    }
    fun skip(v: View){
        startActivity(Intent(this, LocalBroadcast02Activity::class.java))
    }
}