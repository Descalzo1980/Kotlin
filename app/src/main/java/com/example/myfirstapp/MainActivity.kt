package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.LogPrinter
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        val counter = 0
        val counter2 = counter + 5
        val tvTest = findViewById<TextView>(R.id.tvTest)
        tvTest.text = counter.toString()

    }

    fun onClickTest(view: View){

    }
}