package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.LogPrinter
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var bt: Button

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)

        //tv.text = "Некий текст" не запстить, экрана нет
        //var tv = findViewById<TextView>(R.id.tvTest) разные варианты
        //var tv = findViewById<TextView>(R.id.tvTest) as TextView разные варианты
        //tv = findViewById<TextView>(R.id.tvTest) разные варианты
        tv = findViewById(R.id.tvTest)
        bt = findViewById(R.id.buttonTest)
        bt.setOnClickListener {
            tv.text = "Работает"
        }
    }

    override fun onPause() {
        super.onPause()
        tv.text = "И вот опять"
    }



}