package com.example.figmaappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.PopupWindow

class Task3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task31)
        val btn1 = findViewById<Button>(R.id.btn_next)
        val btn2 = findViewById<Button>(R.id.btn_skip)
        val edText = findViewById<EditText>(R.id.edText)
        btn1.setOnClickListener {
            when(edText.text.toString()){
                "Монитор" -> isCorrectAnswer()
                "монитор" -> isCorrectAnswer()
                else -> isNotCorrectAnswer()
            }
        }

        btn2.setOnClickListener {
            isNotCorrectAnswer()
        }
    }



    private fun isNotCorrectAnswer() {
        val line = findViewById<View>(R.id.linet1)
        val popupWindow = PopupWindow(this)
        val view = layoutInflater.inflate(R.layout.task3_incorrect,null)
        window.setContentView(view)

        popupWindow.showAsDropDown(line)

    }


    private fun isCorrectAnswer() {
        val popupWindow = PopupWindow(this)
        val line = findViewById<View>(R.id.linet1)
        val view = layoutInflater.inflate(R.layout.task3_correct, null)
        window.setContentView(view)
        popupWindow.showAsDropDown(line)
    }

}
