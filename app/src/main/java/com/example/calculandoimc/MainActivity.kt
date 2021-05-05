package com.example.calculandoimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.calculandoimc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("lifecycle", "onCreate - Main")


            with(binding) {
                btCalculateImc.setOnClickListener {
                    val name = tieName.text.toString()
                    val weight = tieWeight.text.toString().toInt()
                    val height = tieHeight.text.toString().toDouble()

                    if (name.isBlank()) {
                        tilName.error = "Campo de nome vazio e/ou inválido"
                    } else {
                        tilName.isErrorEnabled = false
                    }

                    val intent = Intent(this@MainActivity, ResultActivity::class.java)
                    intent.putExtra("name", name)
                    intent.putExtra("weight", 0)
                    intent.putExtra("height", 0.0)

                    startActivity(intent)
                }

            }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - Main")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume - Main")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - Main")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - Main")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy- Main")
    }


}