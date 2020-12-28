package com.example.demo.mediaplayer

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.demo.R
import java.lang.Exception

class MediaPlayerActivity : AppCompatActivity() {
    var mediaPlayer:MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media_player)
       mediaPlayer = MediaPlayer.create(this,R.raw.get_gold_coin_sound)
    }

    fun click(v: View){
        Log.d("ddebug","---click000---")
        mediaPlayer?.let {
            //it.setAudioStreamType(AudioManager.STREAM_MUSIC);

//            try {
//                it.prepareAsync();
//            }catch (e:Exception){
//                e.printStackTrace()
//
//                Log.d("ddebug","exception ---- ${e.toString()}")
//            }

//            it.setOnPreparedListener {
//                Log.d("ddebug","---- setOnPreparedListener ---")
//                it.start();
//            };
            Log.d("ddebug","---- it.start() ---")
            it.start();
        }


    }
}