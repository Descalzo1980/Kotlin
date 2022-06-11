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

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.btn2.setOnClickListener {
            bindingClass.tv3.visibility = View.GONE
        }

        }


    }
