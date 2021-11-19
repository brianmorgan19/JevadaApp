package com.example.figmaappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val images = listOf(
            R.drawable.w1,
            R.drawable.w2,
            R.drawable.w1
        )

        val adapter = FragmentAdapter(images)

        id_viewpaper2.adapter = adapter

        TabLayoutMediator(TabLayout, id_viewpaper2){tab,position->
            tab.text = "Tab ${position + 1}"
        }.attach()


    }
}