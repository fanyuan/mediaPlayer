package com.example.demo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.demo.R
import kotlinx.android.synthetic.main.activity_preferences.*

class PreferencesActivity : AppCompatActivity() {
    val key:String = "key_preferences"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
    }
    fun set(v: View){
         var content = et.text.toString()
        Log.d("ddebug","---set---")
        var sp = getPreferences(Context.MODE_PRIVATE)
        val edit =sp.edit()
        edit.putString(key,content).commit()
    }
    fun get(v: View){
        val str =getPreferences(Context.MODE_PRIVATE).getString(key,"null")
        Log.d("ddebug","---get---str=$str")
    }

}