package com.example.mis_primeros_aux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


import android.widget.Toast





class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.username)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                
                // Obtén el texto ingresado por el usuario
                val username = usernameEditText.text.toString()

                // Crea un Intent para pasar a la pantalla de bienvenida
                val intent = Intent(this@MainActivity, Bienvenida::class.java)

                // Pasa el nombre de usuario a la pantalla de bienvenida
                intent.putExtra("USERNAME", username)

                // Inicia la pantalla de bienvenida
                startActivity(intent)
            }
        })

    }

    fun irASecondActivity(view: View) {
        val intent = Intent(this, register::class.java)
        startActivity(intent)
    }
}

