package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val second=intent?.getStringExtra("key")
       binding.tvResult.text=second
        binding.exit.setOnClickListener {
            finish()
        }
    }

}