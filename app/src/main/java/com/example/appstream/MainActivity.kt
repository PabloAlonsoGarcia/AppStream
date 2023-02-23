package com.example.appstream

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstream.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logIn.setOnClickListener(){
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
        binding.getAll.setOnClickListener(){
            val intent = Intent(this, ChoosePlan::class.java)
            startActivity(intent)
        }


    }



}