package com.example.figmaappp

object Constants{

    const val TOTAL_QUESTIONS: String = "TOTAL_QUESTIONS"
    const val TOTAL_CORRECT_ANSWERS: String = "CORRECT_ANSWERS"


    // DIGITALS //
    fun getQuestions():ArrayList<QuestionModel>{

        val questions_d = ArrayList<QuestionModel>()
        val questions_d_i = ArrayList<QuestionModel2>()

        val quesions = questions_d.plus(questions_d_i)

        // inputtext //

        val que1_d_i = QuestionModel2(6,"Переведите текст на русский", "Mom, I want to buy a new camera!", R.drawable.daughter,
            "Мама я хочу купить новую камеру",
            "Мама, я хочу купить новую камеру",
            "Мам, я хочу купить новую камеру",
            "Мам я хочу купить новую камеру",
            "Мама я хочу купить новую камеру",
            "Мама я хочу приобрести новую камеру"
        )

        questions_d_i.add(que1_d_i)

        val que2_d_i = QuestionModel2(7,"Переведите текст на английский", "Мама, я хочу купить новую камеру!", R.drawable.daughter,
            "Mother, I want to buy a new camera",
            "Mom, I want to buy a new camera",
            "Mother I want to buy a new camera",
            "Mom I want to buy a new camera",
            "Mother I want to buy a new camera",
            "Mom I wanna buy a new camera")

        questions_d_i.add(que2_d_i)

        val que3_d_i = QuestionModel2(8,"Переведите текст на русский", "This game console is perfect.", R.drawable.man,
            "Эта игровая консоль идеальная",
            "Эта игровая консоль крутая",
            "Эта игровая приставка идеальная",
            "Эта игровая приставка крутая",
            "Эта игровая консоль хорошая",
            "Эта игровая приставка великолепная"
        )

        questions_d_i.add(que3_d_i)

        val que4_d_i = QuestionModel2(9,"Переведите текст на английский", "Могу ли я воспользоваться вашим телефоном?", R.drawable.daughter,
            "Can I use your phone",
            "Could I use your phone",
            "Can I borrow your phone",
            "Could I borrow your phone",
            "dhdhdfhdfh",
            "dhdfhdhfdh")

        questions_d_i.add(que4_d_i)

        val que5_d_i = QuestionModel2(10,"Переведите текст на русский", "I use my laptop for programming.", R.drawable.daughter,
            "Я использую ноутбук для программирования",
            "Я программирую на ноутбуке",
            "Я программирую на моем ноутбуке",
            "3tg31",
            "3tg131r",
        "sgtwtgg")

        questions_d_i.add(que5_d_i)

        val que6_d_i = QuestionModel2(11,"Переведите текст на английский", "Hey Carl, turn TV on.", R.drawable.daughter,
            "Эй Карл, включи телевизор",
            "Хей Карл, включи телевизор",
            "Карл, включи телевизор",
            "Эй Карл включи телевизор",
            "Хей Карл, включи телевизор",
            "Карл включи телевизор")

        questions_d_i.add(que6_d_i)

        val que7_d_i = QuestionModel2(12,"Переведите текст на русский", "The Camera is broken!", R.drawable.daughter,
            "Эта камера сломана",
            "Эта камера сломалась",
            "Камера сломалась",
            "Камера сломана",
            "dsg2g",
            "Gdgg2")

        questions_d_i.add(que7_d_i)


        // test //

        val que1_d = QuestionModel(1, "What does Camera mean in Russian?", R.drawable.camera,
            "Телевизор", "Камера", "Ноутбук", "Телефон", 2)

        questions_d .add(que1_d)

        val que2_d = QuestionModel(2, "Как переводится Ноутбук на английский?", R.drawable.laptop,
            "Monitor", "Phone", "Playstation", "Laptop", 4)

        questions_d .add(que2_d)

        val que3_d = QuestionModel(3, "Как переводится Телефон на английский?", R.drawable.phone,
            "TV", "Monitor", "Phone", "Fitbit", 3)

        questions_d .add(que3_d)

        val que4_d = QuestionModel(4, "What does Monitor mean in Russian?", R.drawable.monitor,
            "Монитор", "Плейстейшн", "Телевизор", "Телефон", 1)

        questions_d .add(que4_d)

        val que5_d = QuestionModel(5, "Как переводится Плейстейшион на английский?", R.drawable.playstation,
            "Fitbit", "Playstation", "TV", "Phone", 2)

        questions_d .add(que5_d)

        questions_d .shuffle()

        return questions

    }

}