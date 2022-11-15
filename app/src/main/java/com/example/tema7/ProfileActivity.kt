package com.example.tema7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val apellido = intent.extras?.getString(Constants.NAV_APELLIDO)
        val texto = findViewById<TextView>(R.id.texto)
        texto.text = apellido

        findViewById<Button>(R.id.btNavegar).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}