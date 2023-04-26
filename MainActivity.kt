package com.aysegulyilmaz.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mysum(view: View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1== null|| number2 == null){
            textView.text = "Error!"
        }else{
            result = number1!! + number2!!//gerçekten eminim number1 ve number2 null değil
            textView.text = "Result: $result"
        }




    }
    fun mysub(view :View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1== null|| number2 == null){
            textView.text = "Error!"
        }else{
            result = number1!! - number2!!//gerçekten eminim number1 ve number2 null değil
            textView.text = "Result: $result"
        }


    }

    fun mydiv(view: View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1== null|| number2 == null){
            textView.text = "Error!"
        }else{
            result = number1!! / number2!!//gerçekten eminim number1 ve number2 null değil
            textView.text = "Result: $result"
        }


    }

    fun mymul(view:View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1== null|| number2 == null){
            textView.text = "Error!"
        }else{
            result = number1!! * number2!!//gerçekten eminim number1 ve number2 null değil
            textView.text = "Result: $result"
        }


    }
}