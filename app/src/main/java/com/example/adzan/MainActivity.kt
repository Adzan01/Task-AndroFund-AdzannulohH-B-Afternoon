package com.example.adzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adzan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Button untuk pindah ke ActivityKedua
        binding.btnMoveToSecondActivity.setOnClickListener {
            val dataToSend = "data Activity Pertama"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data", dataToSend)
            startActivity(intent)
        }
    }
}
