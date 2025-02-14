package com.example.appiuselfproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private lateinit var username:EditText;
    private  lateinit var password:EditText;
    private lateinit var loginbtn: Button;
    private lateinit var signupbtn: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        username = findViewById(R.id.username);
        password = findViewById(R.id.password_);
        loginbtn = findViewById(R.id.Loginbtn);
        signupbtn = findViewById(R.id.signUpbtn);

        loginbtn.setOnClickListener {
            val usernameText = username.text.toString();
            val passwordText = password.text.toString();
            if("cmg" == usernameText && "123" == passwordText){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent);
            }else
            {
                username.setError("Invalid username or password");
                password.setError("Invalid username or password");

            }




    }


}}