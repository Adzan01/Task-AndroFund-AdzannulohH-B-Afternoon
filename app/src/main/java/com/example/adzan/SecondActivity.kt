package com.example.adzan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adzan.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receivedData = intent.getStringExtra("data")

        val fragment = receivedData?.let { DisplayDataFragment.newInstance(it) }
        if (fragment != null) {
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
        }
    }
}