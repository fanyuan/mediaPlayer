package com.example.demo.remoteview

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.example.demo.MainActivity
import com.example.demo.R
import com.example.demo.databinding.ActivityRemoveViewBinding

class RemoteViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove_view)
        var dataBing = DataBindingUtil.setContentView<ActivityRemoveViewBinding>(this,R.layout.activity_remove_view)
        dataBing.act = this
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun base(){
        log("---base---")
        //send()
        RemoteViewUtil.create(this)
    }

    fun send() {
        var intent = Intent(this, MainActivity::class.java)
        var pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT)
        var notification = Notification.Builder(this).apply {
            setTicker("Hello world")
            setSmallIcon(R.mipmap.ic_launcher)
            setContentTitle("This is a title")
            setContentText("Content......")
            setLargeIcon(BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher))
            setContentIntent(pendingIntent)
        }.build()
        var manager = this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(1, notification)
    }
    fun log(msg:String){
        Log.d("ddebug",msg)
    }
}