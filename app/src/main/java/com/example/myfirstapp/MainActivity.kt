package com.example.myfirstapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password : String = "empty"
    private var name : String = "empty"
    private var second_name : String = "empty"
    private var last_name : String = "empty"
    private var avatarImageID : Int = 0


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Constance.REQUEST_CODE_SING_IN){

        }else if(requestCode == Constance.REQUEST_CODE_SING_UP){

        }
    }
    fun onClickSingIn(view: View){

        val intent = Intent(this, SingInUpActivity::class.java)
        intent.putExtra(Constance.SING_STATE, Constance.SING_IN_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SING_IN)
    }
    fun onClickSingUp(view: View){
        val intent = Intent(this, SingInUpActivity::class.java)
        intent.putExtra(Constance.SING_STATE, Constance.SING_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SING_UP)
    }
}


