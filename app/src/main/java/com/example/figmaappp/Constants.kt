package com.example.figmaappp

object Constants{

    fun getQuestions():ArrayList<QuestionModel>{

        val questions = ArrayList<QuestionModel>()

        val que1 = QuestionModel(1, "What does Camera mean in Russian?", R.drawable.camera,
            "Телевизор", "Камера", "Ноутбук", "Телефон", 2)

        questions.add(que1)

        val que2 = QuestionModel(2, "Как переводится Ноутбук на английский?", R.drawable.laptop,
            "Monitor", "Phone", "Playstation", "Laptop", 4)

        questions.add(que2)

        val que3 = QuestionModel(3, "Как переводится Телефон на английский?", R.drawable.phone,
            "TV", "Monitor", "Phone", "Fitbit", 3)

        questions.add(que3)

        val que4 = QuestionModel(4, "What does Monitor mean in Russian?", R.drawable.monitor,
            "Монитор", "Плейстейшн", "Телевизор", "Телефон", 1)

        questions.add(que4)

        val que5 = QuestionModel(5, "Как переводится Плейстейшион на английский?", R.drawable.playstation,
            "Fitbit", "Playstation", "TV", "Phone", 2)

        questions.add(que5)

        questions.shuffle()

        return questions

    }

}