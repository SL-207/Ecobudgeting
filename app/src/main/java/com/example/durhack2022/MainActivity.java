package com.example.durhack2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Todo: cumulative budget, local data
public class MainActivity extends AppCompatActivity {
    Button formBtn, settingsBtn;
    public static int ovenConsumptionfan, ovenConsumptionfanless, elecPrice, gasPrice, hobConsumption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        formBtn = findViewById(R.id.formBtn);
        settingsBtn = findViewById(R.id.settingsBtn);

        formBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, FormActivity.class));
            }
        });
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });



    }
}