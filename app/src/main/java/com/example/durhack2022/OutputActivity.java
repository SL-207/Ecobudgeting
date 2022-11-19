package com.example.durhack2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    int currentPrice;
    TextView displayCurrent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        displayCurrent = findViewById(R.id.displayCurrent);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            currentPrice = extras.getInt("price");
        }
        displayCurrent.setText("$" + currentPrice);
    }
}