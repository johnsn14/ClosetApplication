package com.example.closet

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Sade")

        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)

        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton

        loginbtn.setOnClickListener {
            if (username.text.toString() == "test" && password.text.toString() == "Password") {
                Toast.makeText(this@MainActivity, "Login Successful", Toast.LENGTH_SHORT).show()
            } else Toast.makeText(this@MainActivity, "Try Again", Toast.LENGTH_SHORT).show()
        }



    }
}