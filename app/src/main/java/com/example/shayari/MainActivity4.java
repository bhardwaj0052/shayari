package com.example.shayari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button = findViewById(R.id.btn4);
        button.setOnClickListener(View -> {
            Intent intent= new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
        });
    }
}