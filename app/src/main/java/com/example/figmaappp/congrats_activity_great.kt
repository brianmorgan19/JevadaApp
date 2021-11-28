package com.example.figmaappp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_congrats_great.*

class congrats_activity_great : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats_great)

        val correct_answers = intent.getIntExtra(Constants.TOTAL_CORRECT_ANSWERS,0)
        val total_questions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        tvScore.text = "You scored $correct_answers / $total_questions"

        btn_finish.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}