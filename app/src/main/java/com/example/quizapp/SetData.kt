package com.example.quizapp

object SetData {

    const val name:String = "name"
    const val score:String = "score"

    fun getQuestion():ArrayList<QuestionData>{
        var questions:ArrayList<QuestionData> = arrayListOf()
        var question1 = QuestionData(
            1,
            "Trường đại học Bách Khoa Hà Nội được thành lập vào năm nào?",
            "1955",
            "1956",
            "1957",
            "1958",
            2)

        var question2 = QuestionData(
            2,
            "Ai là hiệu trưởng đầu tiên của trường đại học Bách Khoa Hà Nội?",
            "Trần Đại Nghĩa",
            "Hoàng Văn Phong",
            "Tạ Quang Bửu",
            "Hà Học Trạc",
            1
        )

        var question3 = QuestionData(
            3,
            "Tổng diện tích của trường đại học Bách Khoa Hà Nội?",
            "25 ha",
            "26 ha",
            "27 ha",
            "28 ha",
            2
        )

        var question4 = QuestionData(
            4,
            "Trường đại học Bách Khoa Hà Nội nằm ở quận nào thành phố Hà Nội?",
            "Hai Bà Trưng",
            "Cầu Giấy",
            "Hoàn Kiếm",
            "Đống Đa",
            1
        )

        var question5 = QuestionData(
            5,
            "Trường đại học Bách Khoa Hà Nội đào tạo bao nhiêu chuyên ngành đại học?",
            "66",
            "67",
            "68",
            "69",
            2
        )

        questions.add(question1)
        questions.add(question2)
        questions.add(question3)
        questions.add(question4)
        questions.add(question5)

        return questions
    }
}