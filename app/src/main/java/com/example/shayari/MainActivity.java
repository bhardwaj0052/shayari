package com.example.shayari;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button,exit;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn1);
        exit = findViewById(R.id.exit5);
        button.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
        exit.setOnClickListener(view -> finishAffinity());
    }
}