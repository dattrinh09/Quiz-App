package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_next.setOnClickListener{
            if(input_name.text.toString().isEmpty()){
                Toast.makeText(this, "Enter your name", Toast.LENGTH_SHORT).show()
            }else{
                var intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra("${SetData.name}", input_name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}