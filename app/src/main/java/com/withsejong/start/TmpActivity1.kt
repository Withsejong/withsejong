package com.withsejong.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.withsejong.R
import com.withsejong.databinding.ActivityTmp1Binding

class TmpActivity1 : AppCompatActivity() {

    val TAG = "TmpActivity1"

    lateinit var binding:ActivityTmp1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tmp1)
        binding = ActivityTmp1Binding.inflate(layoutInflater)

        Log.d(TAG,"onCreate함수")

    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart함수")


        val btnTest = findViewById<Button>(R.id.btn_start)
        btnTest.setOnClickListener {
            val intent = Intent(this@TmpActivity1,TmpActivity2::class.java)

            Log.d(TAG, "버튼 클릭됨")
            startActivity(intent)
            finish()

        }




    }
}