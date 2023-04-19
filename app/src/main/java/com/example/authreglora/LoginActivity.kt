package com.example.authreglora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var EmailText :EditText
    lateinit var PasswordText :EditText
    lateinit var LogInButton :Button
    lateinit var CreateAccountButton :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        EmailText = findViewById(R.id.edt_emails)
        PasswordText = findViewById(R.id.edt_passwords)
        LogInButton = findViewById(R.id.btn_logins)
        CreateAccountButton = findViewById(R.id.btn_creates)

        LogInButton.setOnClickListener {
            Toast.makeText(this, "You have logged in successfully!", Toast.LENGTH_SHORT).show()
        }

        CreateAccountButton.setOnClickListener {
            Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show()
            var gotoaccount = Intent(this,MainActivity::class.java)
            startActivity(gotoaccount)
        }
    }
}