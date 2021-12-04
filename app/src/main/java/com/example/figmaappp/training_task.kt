package com.example.figmaappp

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_training_task.*

class training_task : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training_task)

        training_task_family.setOnClickListener {

            Intent(this, task_family::class.java).also {
                startActivity(it)
            }

        }

    }
}