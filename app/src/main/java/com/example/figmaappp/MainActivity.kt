package com.example.figmaappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfViewPapers = listOf(
            R.layout.t_circle,
            R.layout.t_circle
        )

        val adapter = LayoutAdapter(listOfViewPapers)

        id_viewpaper2.adapter = adapter

    }
}