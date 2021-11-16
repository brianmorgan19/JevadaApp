package com.example.figmaappp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.TranslateLanguage.RUSSIAN
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.Translator
import com.google.mlkit.nl.translate.TranslatorOptions

import org.w3c.dom.Text

class Task1 : AppCompatActivity() {
    private lateinit var realtive:RelativeLayout
    private lateinit var pDialog:SweetAlertDialog
    private lateinit var russianToEnglish:Translator
    private lateinit var txtView:TextView
    private lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task1)

        txtView = findViewById(R.id.txtView)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btnSkip = findViewById<Button>(R.id.btn_skip)
        val btnNext = findViewById<Button>(R.id.btn_next)
        val buttons = arrayListOf(btn1, btn2, btn3)


        ///             Listeners             ///
        btn1.setOnClickListener {
            btn1.isSelected = !btn1.isSelected
            btn2.isClickable = !btn2.isClickable
            btn3.isClickable = !btn3.isClickable

        }
        btn2.setOnClickListener {
            btn2.isSelected = !btn2.isSelected
            btn3.isClickable = !btn3.isClickable
            btn1.isClickable = !btn1.isClickable

        }

        btn3.setOnClickListener {
            btn3.isSelected = !btn3.isSelected
            btn1.isClickable = !btn1.isClickable
            btn2.isClickable = !btn2.isClickable

        }

        btnSkip.setOnClickListener {
            inCorrectFun()

        }

        btnNext.setOnClickListener {
            btnNext.isSelected = !btnNext.isSelected
            if (btn2.isSelected){
                correctFun()
            }
            else {
                inCorrectFun()
            }
        }


        btnSkip.setOnClickListener {
            inCorrectFun()
        }
    }

    private fun inCorrectFun() {
        val popupWindow = PopupWindow(this)

        val view = layoutInflater.inflate(R.layout.popup2,null)

        window.setContentView(view)
        val line = findViewById<View>(R.id.linet)
        popupWindow.showAsDropDown(line)

        val btn_incorrect = findViewById<Button>(R.id.notCorrect)

        btn_incorrect.setOnClickListener {
            Intent(this, Task2::class.java).also{
                startActivity(it)
        }
        }
    }

    private fun correctFun() {
        val popUpWindow = PopupWindow(this)
        val view  = layoutInflater.inflate(R.layout.popupwindow, null)

        window.setContentView(view)

        val line = findViewById<View>(R.id.linet)
        popUpWindow.showAsDropDown(line)

        val btn_correct = findViewById<Button>(R.id.btn_correct)
        btn_correct.setOnClickListener {
            Intent(this, Task2::class.java).also{
                startActivity(it)
            }
        }
    }
}






