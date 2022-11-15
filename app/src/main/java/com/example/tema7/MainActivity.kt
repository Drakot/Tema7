package com.example.tema7

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tema7.Constants.NAV_APELLIDO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btNavegar).setOnClickListener {
            val texto = findViewById<TextView>(R.id.texto).text.toString()
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra(NAV_APELLIDO, texto)
            startActivity(intent)
        }

    }
}