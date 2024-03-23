package com.withsejong.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.withsejong.databinding.ActivityLoginChoicePageBinding
import com.withsejong.login.LoginPage
import com.withsejong.login.AccountPage


class LoginChoicePage : AppCompatActivity() {


    lateinit var binding: ActivityLoginChoicePageBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginChoicePageBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }




    override fun onStart() {
        super.onStart()

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this@LoginChoicePage, LoginPage::class.java)
            startActivity(intent)
            finish()

        }

        binding.btnSignup.setOnClickListener {
            val intent = Intent(this@LoginChoicePage, AccountPage::class.java)
            startActivity(intent)
            finish()

        }



    }
}