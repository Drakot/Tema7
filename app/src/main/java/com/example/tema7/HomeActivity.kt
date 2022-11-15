package com.example.tema7

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val apellido = intent.extras?.getString(Constants.NAV_APELLIDO)
        Log.i("HomeActivity", "$apellido")


    }
}