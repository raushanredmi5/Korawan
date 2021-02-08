package com.raushan.korawanindia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.raushan.korawanindia.R;

public class NewPasswordGeneration extends AppCompatActivity {

    Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password_generation);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(v -> {
            startActivity(new Intent(NewPasswordGeneration.this,LoginScreen.class));
        });
    }
}