package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Tracking extends AppCompatActivity {
    Spinner spinner;
    String[] work= {"25% Done","50% Done","75% Done","100% Done"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        spinner=findViewById(R.id.spinner);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Tracking.this, android.R.layout.simple_list_item_1,work);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);
    }
}