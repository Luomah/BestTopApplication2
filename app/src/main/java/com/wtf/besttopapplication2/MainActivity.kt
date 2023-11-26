package com.wtf.besttopapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signInButton: MaterialButton = this.findViewById(R.id.mainSignIn)
        val registerButton: MaterialButton = this.findViewById(R.id.mainRegister)

        signInButton.setOnClickListener {
            val intent = Intent(this, SignInActivity2::class.java)

            this.startActivity(intent)
        }
        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity2::class.java)

            this.startActivity(intent)
        }



    }
}