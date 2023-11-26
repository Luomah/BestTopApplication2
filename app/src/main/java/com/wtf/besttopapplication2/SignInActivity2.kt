package com.wtf.besttopapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class SignInActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in2)
        val register: MaterialButton = findViewById(R.id.register)
        val signIn: MaterialButton = findViewById(R.id.signIn)
        val forgetPassword: Button = findViewById(R.id.forgotPassword)

        register.setOnClickListener {
            val intent = Intent(this, RegisterActivity2::class.java)

            this.startActivity(intent)
        }
        signIn.setOnClickListener {
            val intent = Intent(this, HomeActivity2::class.java)

            this.startActivity(intent)
        }

        forgetPassword.setOnClickListener {
            val intent = Intent(this, ForgetPasswordMainActivity2::class.java)

            this.startActivity(intent)
        }

    }
}