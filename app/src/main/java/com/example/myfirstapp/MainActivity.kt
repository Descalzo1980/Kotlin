package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.LogPrinter
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var a:Byte = 120 // целое число от  -128 до 127 1 байт
    // одна единица информации (без разницы 0 это или 1) и называеся бит
    //  8 бит равно Байт
    var b:Short = 120 // -32768 до 32768 2 байта
    var c:Int = 120 // по умолчанию Int -2147483648 до 2147483647 4 байта
    var d:Long = 120 // 8 байт, числа уже ололо
    var f:Float = 120.8f // 4 байта -3.4*10 в 38 до 3.4*10 в 38 степени
    var g:Double = 120.5 // 8 байт 5.0 в 10 в 324 степени
    var testBool: Boolean = true // это понятно
    var test: Char = 'A' // это тоже понятно
    var testString: String = "Привет как дела"



    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
    }

}