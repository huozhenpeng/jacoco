package com.example.jacoco

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
Date: 2021/3/10
Author: huozhenpeng
 */
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun click(view: View) {
        val intent = Intent(this, ThreddActivity::class.java)
        startActivity(intent)
    }
}