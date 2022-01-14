package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.view.View

import android.widget.TextView
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.tv01.text = "😱"
        movemove()
        binding.button01.setOnClickListener{
            movemove()
        }

    }
    fun movemove(){
        var moving = TranslateAnimation(-100f,100f,0f,0f)
        moving.duration = 200// 20ミリ秒)かけて行う
        binding.tv01.animation = moving // ビューにアニメーションを適用する
        moving.repeatMode= Animation.REVERSE
        moving.repeatCount = 50
    }
}