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
            var f1: Boolean = true
            var f2: Boolean = true
            var f3: Boolean = true
            var f4: Boolean = true

            if (en1.isEmpty()) {
                f1 = false
                text1?.setText("Впишите своё имя")
            } else{ f1 = true
                text1?.setText(" ")
            }
            if (en2.isNotEmpty()) {
                if (1 > en2.toDouble() || en2.toDouble() > 249){
                    f2 = false
                    text2?.setText("Впишите свой рост корректно!")
                } else{ f2 = true
                    text2?.setText(" ")
                }
            }
            if (en3.isNotEmpty()) {
                if (1 > en3.toDouble() || en3.toDouble()>249){
                    f3 = false
                    text3?.setText("Впишите свой вес корректно!")
                } else{ f3 = true
                    text3?.setText(" ")
                }
            }
            if (en4.isNotEmpty()) {
                if (1 > en4.toDouble() || en4.toDouble()>149){
                    f4 = false
                    text4?.setText("Впишите свой возраст корректно!")
                } else{ f4 = true
                    text4?.setText(" ")
                }

            if (f1 && f2 && f3 && f4){
                text5?.setText("Ответ: " + en4.toDouble()*en3.toDouble()*en2.toDouble())
            }

            }
        }
    }
}

    }
}

