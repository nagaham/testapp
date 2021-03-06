package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.view.View
import android.view.animation.RotateAnimation

import android.widget.TextView
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tv01.text = "π²"

        binding.button00.setOnClickListener{
            binding.tv01.text = "π"
            movemove0()
        }

        binding.button01.setOnClickListener{
            binding.tv01.text = "π"
            movemove1()
        }

        binding.button02.setOnClickListener{
            binding.tv01.text = "π"
            movemove2()
        }
        binding.button04.setOnClickListener {
            binding.tv01.text = "π΅"
            moverotate()
        }

    }
    fun movemove0(){
        var moving = TranslateAnimation(0f,0f,-200f,200f)
        moving.duration = 200// γγͺη§)γγγ¦θ‘γ
        binding.tv01.animation = moving // γγ₯γΌγ«γ’γγ‘γΌγ·γ§γ³γι©η¨γγ
        moving.repeatMode= Animation.REVERSE
        moving.repeatCount = 20
    }
    fun movemove1(){
        var moving = TranslateAnimation(-200f,200f,0f,0f)
        moving.duration = 200// γγͺη§)γγγ¦θ‘γ
        binding.tv01.animation = moving // γγ₯γΌγ«γ’γγ‘γΌγ·γ§γ³γι©η¨γγ
        moving.repeatMode= Animation.REVERSE
        moving.repeatCount = 20
    }
    fun movemove2(){
        var moving = TranslateAnimation(-10f,10f,-10f,10f)
        moving.duration = 10// γγͺη§)γγγ¦θ‘γ
        binding.tv01.animation = moving // γγ₯γΌγ«γ’γγ‘γΌγ·γ§γ³γι©η¨γγ
        moving.repeatMode= Animation.REVERSE
        moving.repeatCount = 20
    }
    fun moverotate(){
        var moving = RotateAnimation(-90.0f, 90.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 3f)
        moving.duration = 1000// γγͺη§)γγγ¦θ‘γ
        binding.tv01.animation = moving // γγ₯γΌγ«γ’γγ‘γΌγ·γ§γ³γι©η¨γγ
        moving.repeatMode= Animation.REVERSE
        moving.repeatCount = 20
    }
}