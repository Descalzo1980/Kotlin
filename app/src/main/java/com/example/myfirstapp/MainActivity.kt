package com.example.myfirstapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun onClickTest1(view: View){
        val i = Intent( this,  TestActivity1::class.java)
        i.putExtra("key", "Привет,как дела?")
        startActivity(i)
    }
}


