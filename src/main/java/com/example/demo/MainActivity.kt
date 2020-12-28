package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.demo.LocalBroadcast.LocalBroadcast01Activity
import com.example.demo.LocalBroadcast.LocalBroadcast02Activity
import com.example.demo.databinding.ActivityMainBinding
import com.example.demo.mediaplayer.MediaPlayerActivity
import com.example.demo.remoteview.Remoteview02Activity

class MainActivity : AppCompatActivity() {
    //var databing:ActivityMainBinding?  = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var databing =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        databing!!.tv.text = "demo123"
        databing.act = this

    }
    fun remoView(){
        Log.d("ddebug","---click remoView---")
        //startActivity(Intent(this, RemoteViewActivity::class.java))
        startActivity(Intent(this, Remoteview02Activity::class.java))
    }
    fun preferences(){
        startActivity(Intent(this, PreferencesActivity::class.java))
    }
    fun localBroadcast(){
        startActivity(Intent(this, LocalBroadcast01Activity::class.java))
    }
    fun mediaPlayer(){
        startActivity(Intent(this, MediaPlayerActivity::class.java))
    }

}