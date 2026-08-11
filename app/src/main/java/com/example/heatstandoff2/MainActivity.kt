package com.example.cheatsstandoff2

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startBtn)
        startBtn.setOnClickListener {
            startService(Intent(this, LockService::class.java))
            finish()
        }
    }
}
