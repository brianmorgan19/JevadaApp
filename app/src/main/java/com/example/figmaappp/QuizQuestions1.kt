package com.example.figmaappp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions1.*

class QuizQuestions1 : AppCompatActivity(), View.OnClickListener{

    private var gCurrPosition:Int = 1
    private var gQuestions:ArrayList<QuestionModel>? = null
    private var gSelectedOptionPosition:Int = 0
    private var gOneAttempt: Int = 1
    private var gPressedSecondTime:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions1)

        gQuestions = Constants.getQuestions()
        setQuestion()

        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)
        val btn_next = findViewById<Button>(R.id.btn_next)
        btn_next.setOnClickListener(this)

    }

    private  fun setQuestion() {


        val question  = gQuestions!![gCurrPosition - 1]

        defaultOptions()

        if(gCurrPosition == gQuestions!!.size){
            btn_next.text = "Finish"
        }
        else{
            btn_next.text = "Next"
        }

        question_id.text = question.question

        ivIcon.setImageResource(question.image)

        count_progress.text = "$gCurrPosition" + "/" + progressBar.max
        progressBar.progress = gCurrPosition

        optionOne.text = question.optionOne
        optionTwo.text = question.optionTwo
        optionThree.text = question.optionThree
        optionFour.text = question.optionFour


        optionOne.isEnabled = true
        optionTwo.isEnabled = true
        optionThree.isEnabled = true
        optionFour.setEnabled(true)

        gPressedSecondTime = false

    }

    private fun defaultOptions(){
        val options = ArrayList<TextView>()
        options.add(0, optionOne)
        options.add(1, optionTwo)
        options.add(2, optionThree)
        options.add(3, optionFour)

        for(option in options){
            option.setTextColor(Color.parseColor("#969696"))
            option.background = (ContextCompat.getDrawable(this,R.drawable.default_option_border))

        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.optionOne -> selectedOption(optionOne, 1)
            R.id.optionTwo -> selectedOption(optionTwo, 2)
            R.id.optionThree -> selectedOption(optionThree, 3)
            R.id.optionFour -> selectedOption(optionFour, 4)
            R.id.btn_next -> {
                if(gSelectedOptionPosition == 0){
                    gCurrPosition++

                    when{ gCurrPosition <= gQuestions!!.size ->
                          setQuestion()

                        else->{
                            Toast.makeText(this,"You've complited the test!", Toast.LENGTH_SHORT).show()
                        }
                    }

                    }

                else{
                    val question = gQuestions!!.get(gCurrPosition-1)
                    if(question!!.CorrectAnswer != gSelectedOptionPosition){
                        answerView(gSelectedOptionPosition, R.drawable.incorrect_option_style)
                    }
                    answerView(question.CorrectAnswer, R.drawable.correct_option_style)

                    if(gCurrPosition == gQuestions!!.size){
                        btn_next.text = "Finish"
                    }
                    else{
                        btn_next.text = "Next"
                    }

                    optionOne.isEnabled = !optionOne.isEnabled
                    optionTwo.isEnabled = !optionTwo.isEnabled
                    optionThree.isEnabled = !optionThree.isEnabled
                    optionFour.isEnabled = !optionFour.isEnabled
                }

                gSelectedOptionPosition = 0

                }
            }

        }

    private fun answerView(answer:Int, Drawable:Int){

        when(answer){
            1 -> optionOne.background = ContextCompat.getDrawable(this,Drawable)
            2 -> optionTwo.background = ContextCompat.getDrawable(this, Drawable)
            3 -> optionThree.background = ContextCompat.getDrawable(this, Drawable)
            4 -> optionFour.background = ContextCompat.getDrawable(this, Drawable)
        }

    }


    private fun selectedOption(tv:TextView, selectedOptionNumber:Int){

        defaultOptions()

        gSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#4B4B4B"))
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option)

    }

}