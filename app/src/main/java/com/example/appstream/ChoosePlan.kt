package com.example.appstream

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstream.databinding.ActivityChoosePlanBinding

class ChoosePlan : AppCompatActivity() {
    private lateinit var binding: ActivityChoosePlanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoosePlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView28.setOnClickListener(){
            val intent = Intent(this, Terms::class.java)
            startActivity(intent)
        }
    }
}