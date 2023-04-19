package com.example.authreglora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var FirstName : EditText
    lateinit var SecondName :EditText
    lateinit var EmailAddress :EditText
    lateinit var Password :EditText
    lateinit var ButtonAccount :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FirstName = findViewById(R.id.edt_firstname)
        SecondName = findViewById(R.id.edt_secondname)
        EmailAddress = findViewById(R.id.edt_email)
        Password = findViewById(R.id.edt_password)
        ButtonAccount = findViewById(R.id.btnAccount)

        ButtonAccount.setOnClickListener {
            Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show()
            var gotologin = Intent(this,LoginActivity::class.java)
            startActivity(gotologin)
        }


//        ButtonAccount.setOnClickListener {
//            Toast.makeText(this, "Hi, Lora :)", Toast.LENGTH_SHORT).show()
//       }




    }
}