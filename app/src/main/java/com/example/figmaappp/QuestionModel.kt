package com.example.figmaappp

data class QuestionModel(
    val id:Int,
    val question:String,
    val image: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val CorrectAnswer:Int
)