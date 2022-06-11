package com.example.myfirstapp

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

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    private val a = 324
    private val b = 34

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btn1.setOnClickListener {
            val result = (a + b).toString()
            bindingClass.tvres.text = result
        }
        bindingClass.btn2.setOnClickListener {

            val result1 = a - b
            bindingClass.tvres.text = "Результат вычитания равен: $result1"
        }
        bindingClass.btn3.setOnClickListener {
            val result2 = a * b
            bindingClass.tvres.text = "Результат умножения равен: $result2"
        }
        }

        }

