package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            num++
            binding.zeroTv.text=num.toString()
            if (binding.zeroTv.text.toString().equals("10")) {
                binding.btn.text = "-"
                binding.btn.setOnClickListener {
                    num--
                    binding.zeroTv.text = num.toString()
                    if (binding.zeroTv.text.toString().equals("0")) {
                        var intent = Intent(this, SecondActivity::class.java)
                        intent.putExtra("key",num.toString())
                        startActivity(intent)

                    }

                }
            }
        }
    }
}