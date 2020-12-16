package com.example.emailpassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var inputEmail:EditText
    private lateinit var inputPassword:EditText
    private lateinit var loginButton:Button
    private lateinit var registerButton:Button
    private lateinit var resetButton:Button
    private lateinit var mAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (mAuth.currentUser != null) {
            startActivity(Intent(this, PersonActivity::class.java))
            finish()
        }

        setContentView(R.layout.activity_main)

        inputEmail = findViewById(R.id.signInEmailEditText)
        inputPassword = findViewById(R.id.signInPasswordEditText)
        loginButton = findViewById(R.id.signInButton)
        registerButton = findViewById(R.id.regButton)
        resetButton = findViewById(R.id.resetPasswordButton)

        loginButton.setOnClickListener {
        }
        registerButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        resetButton.setOnClickListener {
            startActivity(Intent(this, resetButton::class.java))
        }

    }
}