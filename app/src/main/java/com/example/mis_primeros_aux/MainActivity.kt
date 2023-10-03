package com.example.mis_primeros_aux

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.view.View


import android.widget.Toast





class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


    }

    fun irASecondActivity(view: View) {
        val intent = Intent(this, register::class.java)
        startActivity(intent)
    }
}

