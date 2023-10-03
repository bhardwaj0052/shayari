package com.example.shayari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button button,previous,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button = findViewById(R.id.btn4);
        previous = findViewById(R.id.prev2);
        exit =findViewById(R.id.exit2);
        button.setOnClickListener(View -> {
            Intent intent= new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(i);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
}