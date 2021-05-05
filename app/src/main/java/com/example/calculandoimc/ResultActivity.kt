package com.example.calculandoimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.calculandoimc.databinding.ActivityMainBinding

class ResultActivity : AppCompatActivity() {

    private fun doCalculateImc (height : Double, weight : Int) : Double {
        return weight / (height * height)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Log.i("lifecycle", "onCreate - Result")

        val name = intent.getStringExtra("name")
        val weight = intent.getIntExtra("weight", 0)
        val height = intent.getDoubleExtra("height", 0.0)

        val textViewResult : TextView = findViewById(R.id.textViewResult)

        textViewResult.text = name + "\nAltura " + height + "\nPeso " + weight + "\nIMC = " + doCalculateImc(height, weight)




        findViewById<Button>(R.id.btMoreInfo).setOnClickListener {
           startActivity(Intent(this@ResultActivity, AboutActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - Result")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume - Result")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - Result")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - Result")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy - Result")
    }
}