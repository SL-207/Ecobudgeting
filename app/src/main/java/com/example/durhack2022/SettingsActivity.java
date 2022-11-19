package com.example.durhack2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SettingsActivity extends AppCompatActivity {
    Button saveBtn; //save settings
    TextView settingsFieldOne, settingsFieldTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        saveBtn = findViewById(R.id.saveBtn);
        settingsFieldOne = (TextView) findViewById(R.id.fieldOne);      //fan
        settingsFieldTwo = (TextView) findViewById(R.id.fieldTwo);      //fanless
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                MainActivity.ovenConsumptionfan = Integer.parseInt(settingsFieldOne.getText().toString());
                MainActivity.ovenConsumptionfanless = Integer.parseInt(settingsFieldTwo.getText().toString());
                Toast.makeText(SettingsActivity.this, "Settings saved", Toast.LENGTH_SHORT).show();
                SettingsActivity.this.startActivity(intent);
            }
        });

    }
}