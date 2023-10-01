package com.example.shayari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button = findViewById(R.id.btn3);
        button.setOnClickListener(View -> {
            Intent intent= new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);

        });
    }
}