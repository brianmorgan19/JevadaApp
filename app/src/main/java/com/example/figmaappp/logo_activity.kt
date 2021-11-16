package com.example.figmaappp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_logo.*

class logo_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

            button_getStarted.setOnClickListener {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                }
            }
        }
    }