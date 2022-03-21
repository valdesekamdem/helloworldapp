package com.example.helloworldapp

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworldapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener { showHelloDialog() }
    }

    private fun showHelloDialog() {
        val dialog = AlertDialog.Builder(this)
            .setTitle("Hello World")
            .setMessage("Just want to wanted to see if you will click.\nHave a good day!")
            .setNeutralButton("Close") { _, _ -> }
            .create()
        dialog.show()
    }
}
