package com.example.figmaappp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        val fragment_more = more()
        val fragment_tasks = Tasks()
        val fragment_profile = profile()

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.layout.fragment_more -> currFragment(fragment_more)
                R.layout.fragment_tasks -> currFragment(fragment_tasks)
                R.layout.fragment_profile -> currFragment(fragment_profile)
            }
            true
        }

    }

    private fun currFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    }


}