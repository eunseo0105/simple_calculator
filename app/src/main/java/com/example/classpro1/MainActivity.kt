package com.example.classpro1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var edit1: EditText;  lateinit var edit2: EditText
    lateinit var btnAdd: Button;  lateinit var btnSub: Button
    lateinit var btnMul: Button; lateinit var btnDiv: Button
    lateinit var TextResult: TextView
    lateinit var num1: String
    lateinit var num2:String
    var result : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        edit1 = findViewById(R.id.Edit1)
        edit2 = findViewById(R.id.Edit2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)

        TextResult = findViewById(R.id.TextResult)
        btnAdd.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkInput()) {
                result = Integer.parseInt(num1) + Integer.parseInt(num2)
                TextResult.text = "계산결과: " + result.toString()
            }
        }
        btnSub.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkInput()) {
                result = Integer.parseInt(num1) - Integer.parseInt(num2)
                TextResult.text = "계산결과: " + result.toString()
            }
        }
        btnMul.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkInput()) {
                result = Integer.parseInt(num1) * Integer.parseInt(num2)
                TextResult.text = "계산결과: " + result.toString()
            }
        }
        btnDiv.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (num2.equals("0")) {
                Toast.makeText(applicationContext, "계산하지 않습니다.", Toast.LENGTH_SHORT).show()
            }
            else if (checkInput()) {
                result = Integer.parseInt(num1) / Integer.parseInt(num2)
                TextResult.text = "계산결과: " + result.toString()
            }
        }
        btnMod.setOnClickListener {
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            if (checkInput()) {
                result = Integer.parseInt(num1) % Integer.parseInt(num2)
                TextResult.text = "계산결과: " + result.toString()
            }

        }
    }
    fun checkInput() : Boolean {
        if (num1.isEmpty() || (num2.isEmpty())) {
            Toast.makeText(applicationContext, "값이 입력되지 않았습니다.", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

}