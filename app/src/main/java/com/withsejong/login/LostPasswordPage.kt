package com.withsejong.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.withsejong.databinding.ActivityLostPasswordPageBinding
import com.withsejong.start.LoginStartPage


class LostPasswordPage : AppCompatActivity() {
    lateinit var binding: ActivityLostPasswordPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLostPasswordPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onStart() {
        super.onStart()

        binding.btnNext.setOnClickListener {
            val intent = Intent(this@LostPasswordPage, LoginPage::class.java)
            startActivity(intent)
            finish()

        }
    }

}