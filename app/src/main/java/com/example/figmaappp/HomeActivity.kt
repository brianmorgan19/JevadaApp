package com.example.figmaappp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.replace
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.tasks.Tasks
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_tasks.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
        val fragment_more = more()
        val fragment_tasks = Task()
        val fragment_profile = profile()




        bottomNavigationView1.selectedItemId = R.id.home

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment_tasks)
            commit()

        }

        bottomNavigationView1.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.more -> currFragment(fragment_more)
                R.id.home -> currFragment(fragment_tasks)
                R.id.profile -> currFragment(fragment_profile)
            }
            true
        }
    }

    private fun currFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    }


}



