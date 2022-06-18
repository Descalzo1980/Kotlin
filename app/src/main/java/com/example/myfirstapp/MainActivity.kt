package com.example.myfirstapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
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
            val l = data?.getStringExtra(Constance.LOGIN)
            val p = data?.getStringExtra(Constance.PASSWORD)
            if(login == l && password == p){

                bindingClass.imAvatar.visibility = View.VISIBLE
                bindingClass.imAvatar.setImageResource(avatarImageID)
                val textInfo = "$name $second_name $last_name"
                bindingClass.tvInfo.text = textInfo
                bindingClass.bHide.visibility = View.GONE
                bindingClass.eBtn.text = "Выйти"
            }else{

                bindingClass.imAvatar.visibility = View.VISIBLE
                bindingClass.imAvatar.setImageResource(R.drawable.figa)
                bindingClass.tvInfo.text = "Тебя тут не стояло"
            }

        }else if(requestCode == Constance.REQUEST_CODE_SING_UP){
            login = data?.getStringExtra(Constance.LOGIN)!!
            password = data.getStringExtra(Constance.PASSWORD)!!
            name = data.getStringExtra(Constance.NAME)!!
            second_name = data.getStringExtra(Constance.NAME2)!!
            last_name = data.getStringExtra(Constance.NAME3)!!
            avatarImageID = data.getIntExtra(Constance.AVATAR_ID, 0)
            bindingClass.imAvatar.visibility = View.VISIBLE
            bindingClass.imAvatar.setImageResource(avatarImageID)
            val textInfo = "$name $second_name $last_name"
            bindingClass.tvInfo.text = textInfo
            bindingClass.bHide.visibility = View.GONE
            bindingClass.eBtn.text = "Выйти"
        }
    }
    fun onClickSingIn(view: View){

        if(bindingClass.imAvatar.isVisible){

            bindingClass.imAvatar.visibility = View.INVISIBLE
            bindingClass.tvInfo.text = ""
            bindingClass.bHide.visibility = View.VISIBLE
            bindingClass.eBtn.text = getString(R.string.sing_in)

        }else{
            val intent = Intent(this, SingInUpActivity::class.java)
            intent.putExtra(Constance.SING_STATE, Constance.SING_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SING_IN)
        }

    }
    fun onClickSingUp(view: View){
        val intent = Intent(this, SingInUpActivity::class.java)
        intent.putExtra(Constance.SING_STATE, Constance.SING_UP_STATE)
        startActivityForResult(intent, Constance.REQUEST_CODE_SING_UP)
    }
}


