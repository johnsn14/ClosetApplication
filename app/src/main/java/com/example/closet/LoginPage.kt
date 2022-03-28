package com.example.closet


import android.content.Intent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        println("Sade")

        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)

        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton

        loginbtn.setOnClickListener {
            if (username.text.toString() == "test" && password.text.toString() == "Password") {
                Toast.makeText(this@LoginPage, "Login Successful", Toast.LENGTH_SHORT).show()

                val intent = Intent (this, MainClosetDisplayPage:: class.java )
                startActivity(intent)

            } else Toast.makeText(this@LoginPage, "Try Again", Toast.LENGTH_SHORT).show()
        }

    }
}