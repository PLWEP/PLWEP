// Login Activity

package com.example.plwep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var login : Button
    private lateinit var usernama : EditText
    private lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.login)
        usernama = findViewById(R.id.username)
        password = findViewById(R.id.password)


        login.setOnClickListener {
            val user = usernama.text.toString()
            val pass = password.text.toString()
            
            // Toast Kalau user sama pass kosong
            if(user.isEmpty()&&pass.isEmpty()) {
                Toast.makeText(this, "Masukan username dan password!!", Toast.LENGTH_SHORT).show()
            }

            if(user.isNotEmpty()&&pass.isNotEmpty()) {
                // Intent ke Activity Utama
                val intent = Intent(this,MenuUtama::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
                finish()
            }
        }
    }
}

