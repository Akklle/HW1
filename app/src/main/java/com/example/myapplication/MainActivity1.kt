package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity1 : AppCompatActivity() {
    private var button: Button? = null
    private var ed1: EditText? = null
    private var ed2: EditText? = null
    private var ed3: EditText? = null
    private var ed4: EditText? = null
    private var text1: TextView? = null
    private var text2: TextView? = null
    private var text3: TextView? = null
    private var text4: TextView? = null
    private var text5: TextView? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button1)
        ed1 = findViewById(R.id.editText1)
        ed2 = findViewById(R.id.editText2)
        ed3 = findViewById(R.id.editText3)
        ed4 = findViewById(R.id.editText4)
        text1 = findViewById(R.id.textView)
        text2 = findViewById(R.id.textView1)
        text3 = findViewById(R.id.textView2)
        text4 = findViewById(R.id.textView3)
        text5 = findViewById(R.id.textView5)
        button?.setOnClickListener {
            val en1: String = ed1?.text.toString()
            val en2: String = ed2?.text.toString()
            val en3: String = ed3?.text.toString()
            val en4: String = ed4?.text.toString()

            if (en1.isEmpty()) {
                text1?.setText("Впишите своё имя")
            } else{
                text1?.setText(" ")
            }
            if (en2.isNotEmpty()) {
                if (1 > en2.toDouble() || en2.toDouble() > 249){
                    text2?.setText("Впишите свой рост корректно!")
                }else{
                    text2?.setText(" ")
                }
            }
            if (en3.isNotEmpty()) {
                if (1 > en3.toDouble() || en3.toDouble()>249){
                    text3?.setText("Впишите свой вес корректно!")
                }
                else{
                    text3?.setText(" ")
                }
            }
            if (en4.isNotEmpty()) {
                if (1 > en4.toDouble() || en4.toDouble()>149){
                    text4?.setText("Впишите свой возраст корректно!")
                } else{
                    text4?.setText(" ")
                }

            }
                text5?.setText("Ответ: " + en4.toDouble()*en3.toDouble()*en2.toDouble())
            }

            }
        }

