package com.raushan.korawanindia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.raushan.korawanindia.Navigation.NavDraw;
import com.raushan.korawanindia.R;

public class LoginScreen extends AppCompatActivity {

    TextView textViewLoginHelp;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(LoginScreen.this, NavDraw.class));
        });

        textViewLoginHelp = findViewById(R.id.textViewLoginHelp);
        textViewLoginHelp.setOnClickListener(v -> {
            startActivity(new Intent(LoginScreen.this, SendOtpScreen.class));
        });
    }
}