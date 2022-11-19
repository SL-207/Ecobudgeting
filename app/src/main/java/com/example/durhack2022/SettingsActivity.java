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
    EditText sFieldOne, sFieldTwo, sFieldThree, sFieldFour, sFieldFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        saveBtn = findViewById(R.id.saveBtn);
        sFieldOne = findViewById(R.id.fieldOne);      //fan
        sFieldTwo = findViewById(R.id.fieldTwo);      //fanless
        sFieldThree = findViewById(R.id.fieldThree);    //hob
        sFieldFour = findViewById(R.id.fieldFour);      //gas price
        sFieldFive = findViewById(R.id.fieldFive);      //electricity price

        sFieldOne.setText("" + MainActivity.ovenConsumptionfan);
        sFieldTwo.setText("" + MainActivity.ovenConsumptionfanless);
        sFieldThree.setText("" + MainActivity.hobConsumption);
        sFieldFour.setText("" + MainActivity.gasPrice);
        sFieldFive.setText("" + MainActivity.elecPrice);
        sFieldOne.setSelectAllOnFocus(true);
        sFieldTwo.setSelectAllOnFocus(true);
        sFieldThree.setSelectAllOnFocus(true);
        sFieldFour.setSelectAllOnFocus(true);
        sFieldFive.setSelectAllOnFocus(true);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                MainActivity.ovenConsumptionfan = Integer.parseInt(((TextView) sFieldOne).getText().toString());
                MainActivity.ovenConsumptionfanless = Integer.parseInt(((TextView) sFieldTwo).getText().toString());
                MainActivity.hobConsumption = Integer.parseInt(((TextView) sFieldThree).getText().toString());
                MainActivity.gasPrice = Integer.parseInt(((TextView) sFieldFour).getText().toString());
                MainActivity.elecPrice = Integer.parseInt(((TextView) sFieldFive).getText().toString());
                Toast.makeText(SettingsActivity.this, "Settings saved", Toast.LENGTH_SHORT).show();
                SettingsActivity.this.startActivity(intent);
            }
        });

    }
}