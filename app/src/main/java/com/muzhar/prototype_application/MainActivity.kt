package com.muzhar.prototype_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muzhar.prototype_application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculatebtn.setOnClickListener {

            var heightstr = binding.heightedt.text.toString().trim()
            var weightstr = binding.weightedt.text.toString().trim()

            var height:Float = heightstr.toFloat()
            var weight:Float = weightstr.toFloat()

            var bmiscore = weight / (height * height )

            binding.resulttv.text= "Score: $bmiscore"

        }



        }
    }
