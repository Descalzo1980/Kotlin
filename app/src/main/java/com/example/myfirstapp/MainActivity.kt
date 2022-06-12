package com.example.myfirstapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btnResult.setOnClickListener {

            when (bindingClass.idValue.text.toString()) {
                Constance.Account -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите вашу зарплату ${Constance.Account_Salary}"
                    bindingClass.tvResult.text = if (bindingClass.passView.text.toString() == Constance.Account_Password) {
                        tempText
                    } else {
                        "Не верный пароль"
                    }

                }
                Constance.Writer -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите вашу зарплату ${Constance.Writer_Salary}"
                    bindingClass.tvResult.text = if (bindingClass.passView.text.toString() == Constance.Writer_Password) {
                        tempText
                    } else {
                        "Не верный пароль"
                    }
                }
                Constance.Duck -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите вашу зарплату ${Constance.Duck_Salary}"
                    bindingClass.tvResult.text = if (bindingClass.passView.text.toString() == Constance.Duck_Password) {
                        tempText
                    } else {
                        "Не верный пароль"
                    }
                }
                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого работника)))"
                }


            }
        }
    }
}



