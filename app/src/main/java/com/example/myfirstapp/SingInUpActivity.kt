package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding
import com.example.myfirstapp.databinding.ActivitySingUpInBinding

class SingInUpActivity : AppCompatActivity() {

    private lateinit var bindingClass: ActivitySingUpInBinding
    private var singState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySingUpInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        singState = intent.getStringExtra(Constance.SING_STATE)!!
        if (singState == Constance.SING_IN_STATE) {

            bindingClass.edName.visibility = View.GONE
            bindingClass.edName2.visibility = View.GONE
            bindingClass.edName3.visibility = View.GONE
            bindingClass.bAvatar.visibility = View.INVISIBLE

        }

    }

    fun onClickDone(view: View){
        if (singState == Constance.SING_IN_STATE) {

//            bindingClass.edName.visibility = View.GONE
//            bindingClass.edName2.visibility = View.GONE
//            bindingClass.edName3.visibility = View.GONE
//            bindingClass.bAvatar.visibility = View.INVISIBLE

        }
    }

    fun onClickAvatar(view: View){

        bindingClass.imAvatar.visibility = View.VISIBLE
    }
}