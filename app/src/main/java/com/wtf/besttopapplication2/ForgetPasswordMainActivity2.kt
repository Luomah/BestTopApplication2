package com.wtf.besttopapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class ForgetPasswordMainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password_main3)
        val login: Button = findViewById(R.id.newLogin)
        val sendBtn: Button = findViewById(R.id.sendEmail)
        val emailEdt: TextInputEditText = findViewById(R.id.email)
        login.setOnClickListener {
            val intent = Intent(this, SignInActivity2::class.java)

            this.startActivity(intent)
        }

        sendBtn.setOnClickListener {
            val userEmailEntered: String= emailEdt.text.toString()
            Snackbar
                .make(
                    findViewById(R.id.layout),
                    "An Email has been sent to $userEmailEntered",
                    Snackbar.LENGTH_LONG
                )
                .show()
        }




    }
}