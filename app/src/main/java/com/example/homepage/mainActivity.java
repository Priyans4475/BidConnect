package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mainActivity extends AppCompatActivity {
    Button button5;
    ImageButton img9;
    ImageButton img17;
    Button button;
    Button botton6;
    ImageButton img10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button5=findViewById(R.id.button5);
        img9=findViewById(R.id.imageButton9);
        img17=findViewById(R.id.imageButton17);
        button=findViewById(R.id.button);
        botton6=findViewById(R.id.button6);
        img10=findViewById(R.id.imageButton10);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainActivity.this,Notification.class);
                startActivity(intent);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainActivity.this,approval.class);
                startActivity(intent);
            }
        });
        img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainActivity.this,uploads.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainActivity.this,details.class);
                startActivity(intent);
            }
        });
        botton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainActivity.this,Tracking.class);
                startActivity(intent);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainActivity.this,profile.class);
                startActivity(intent);
            }
        });
    }
}