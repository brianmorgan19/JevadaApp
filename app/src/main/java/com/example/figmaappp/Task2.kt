package com.example.figmaappp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.PopupWindow

class Task2 : AppCompatActivity() {
    private lateinit var btn1:Button
    private lateinit var popUpWindow :PopupWindow
    private lateinit var line :View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)

        val btn1 = findViewById<Button>(R.id.btn_next)
        val btn2 = findViewById<Button>(R.id.btn_skip)


        val edText = findViewById<EditText>(R.id.edText)

        ///////// Result OK //////////
        btn1.setOnClickListener {

            val text = edText.text.toString()
            if (text == "Camera" || text == "camera") {
                val popupWindow = PopupWindow(this)
                val view = layoutInflater.inflate(R.layout.popup_true_task2, null)
                window.setContentView(view)
                val line = findViewById<View>(R.id.linet1)
                popupWindow.showAsDropDown(line)

                val btn_correct = findViewById<Button>(R.id.btn_correct)
                btn_correct.setOnClickListener {
                    Intent(this, Task3::class.java).also {
                        startActivity(it)
                    }
                }
            } else {
                val popupWindow = PopupWindow(this)
                val view = layoutInflater.inflate(R.layout.popup_false_task2, null)
                window.setContentView(view)
                val line = findViewById<View>(R.id.linet1)
                popupWindow.showAsDropDown(line)

                val btn_incorrect = findViewById<Button>(R.id.notCorrect)
                btn_incorrect.setOnClickListener {
                    Intent(this, Task3::class.java).also {
                        startActivity(it)
                    }
                }
            }

            btn2.setOnClickListener {
                val popupWindow = PopupWindow(this)
                val view = layoutInflater.inflate(R.layout.popup_false_task2, null)
                window.setContentView(view)
                val line = findViewById<View>(R.id.linet1)
                popupWindow.showAsDropDown(line)

                val btn_incorrect = findViewById<Button>(R.id.notCorrect)
                btn_incorrect.setOnClickListener {
                    Intent(this, Task3::class.java).also {
                        startActivity(it)
                    }
                }

            }
        }
    }
}



