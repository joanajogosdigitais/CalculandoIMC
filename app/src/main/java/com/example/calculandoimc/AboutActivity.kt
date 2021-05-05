package com.example.calculandoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.i("lifecycle", "onCreate - About")
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - About")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onStart - About")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - About")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - About")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy - About")
    }
}