package com.example.miaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val palabra1 = findViewById<EditText>(R.id.c1)
        val palabra2 = findViewById<EditText>(R.id.c2)
        val button = findViewById<Button>(R.id.button)
        val resultado = findViewById<TextView>(R.id.tv1)

        button.setOnClickListener {
        //    Log.d("hola", "${palabra1.text.toString()}")
        //    Log.d("hola2", "${palabra2.text.toString()}")
        if (palabra1.text.toString() == palabra2.text.toString()) {
            resultado.text = "Es igual"
        }
        else {
            resultado.text = "No es igual"
        }
        }
    }
}

