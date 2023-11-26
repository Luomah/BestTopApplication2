package com.wtf.besttopapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class RegisterActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)
        val login: Button = findViewById(R.id.login)
        val signup: MaterialButton = findViewById(R.id.signUp)
        login.setOnClickListener {
            val intent = Intent(this, SignInActivity2::class.java)

            this.startActivity(intent)
        }
        signup.setOnClickListener {
            val intent = Intent(this, SignInActivity2::class.java)

            this.startActivity(intent)
        }

    }
}