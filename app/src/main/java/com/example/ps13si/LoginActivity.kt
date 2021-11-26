package com.example.ps13si

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ps13si.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}