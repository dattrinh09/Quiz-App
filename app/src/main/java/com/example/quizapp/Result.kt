package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName = intent.getStringExtra(SetData.name)
        val userScore = intent.getStringExtra(SetData.score)
        val totalQues = intent.getStringExtra("total_size")

        user_name.text = "Congratulation ${userName} !!"
        user_score.text = "${userScore}/${totalQues}"
        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}