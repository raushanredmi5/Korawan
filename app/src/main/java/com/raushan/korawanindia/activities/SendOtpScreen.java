package com.raushan.korawanindia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.raushan.korawanindia.R;

public class SendOtpScreen extends AppCompatActivity {
    Button btnOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_help);

        btnOTP = findViewById(R.id.btnOTP);

        btnOTP.setOnClickListener(v -> {
            startActivity(new Intent(SendOtpScreen.this,VerifyOtp.class));
        });
    }
}