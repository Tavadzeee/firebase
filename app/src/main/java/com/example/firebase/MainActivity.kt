package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerButton.setOnClickListener {

            val email = EmailText.text.toString()
            val password = passwordText.text.toString()


            FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->


            if  (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "შეიყვანეთ ორივე ველი!", Toast.LENGTH_SHORT).show()
                return@addOnCompleteListener
            } else {
                Toast.makeText(this, "თვენ წარმატებით დარეგისტრირდით", Toast.LENGTH_SHORT).show()
                }
            }

        }


    }
}
