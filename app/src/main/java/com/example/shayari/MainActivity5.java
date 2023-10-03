package com.example.shayari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.net.Inet4Address;

public class  MainActivity5 extends AppCompatActivity {
    Button exitButton,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        exitButton = findViewById(R.id.exitButton);
        previous = findViewById(R.id.prev1);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();

            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(i);
            }
        });

    }
}