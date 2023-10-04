package com.example.mis_primeros_aux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Bienvenida : AppCompatActivity() {
    private lateinit var welcomeMessageTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        welcomeMessageTextView = findViewById(R.id.username12)

        // Obtiene
        val username = intent.getStringExtra("USERNAME")

   //nombre de usuario
        welcomeMessageTextView.text = "$username :)"
    }
}