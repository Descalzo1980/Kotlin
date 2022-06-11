package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.LogPrinter
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding
import com.example.myfirstapp.databinding.Test1Binding
import kotlin.math.max

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private val maxPerson = 90
    private val currentPerson = 87

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btn1.setOnClickListener {
           when(currentPerson){
               in 0..maxPerson -> bindingClass.tvres.text = "Всё хорошо"
               else -> bindingClass.tvres.text = "Предел превышен"

           }
        }
        bindingClass.btn2.setOnClickListener {

        }
        bindingClass.btn3.setOnClickListener {

        }
    }

}

