package com.example.appstream

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appstream.databinding.ActivityTermsBinding

class Terms : AppCompatActivity() {
    private lateinit var binding: ActivityTermsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTermsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView7.setOnClickListener(){
            val intent = Intent(this, ChoosePlan::class.java)
            startActivity(intent)
        }


    }
}