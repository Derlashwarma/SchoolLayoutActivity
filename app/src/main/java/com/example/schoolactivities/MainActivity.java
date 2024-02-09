package com.example.schoolactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button layoutActivity;
    Button activity2;
    Button activity3;
    Button activity4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutActivity = findViewById(R.id.activity1);
        activity2 = findViewById(R.id.activity2);
        activity3 = findViewById(R.id.activity3);
        activity4 = findViewById(R.id.activity4);

        layoutActivity.setOnClickListener(v -> setContentView(R.layout.activity_layout_exercise));
    }
}