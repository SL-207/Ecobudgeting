package com.example.durhack2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    Button formSubmitBtn;
    TextView ovenField, hobField;
    int price;
    String hobTime, ovenTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ovenField = (TextView) findViewById(R.id.ovenEditText);
        hobField = (TextView) findViewById(R.id.hobEditText);

        formSubmitBtn = findViewById(R.id.formSubmitBtn);
        formSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hobTime = hobField.getText().toString().trim();
                ovenTime = ovenField.getText().toString().trim();
                if(hobTime.equals("") || ovenTime.equals("")){
                    if(hobTime.equals("") && ovenTime.equals("")){
                        Toast.makeText(FormActivity.this, "No input", Toast.LENGTH_SHORT).show();
                    }
                    else if(hobTime.equals("")){
                        hobTime = "0";
                        showResult();
                    }
                    else if(ovenTime.equals("")){
                        ovenTime = "0";
                        showResult();
                    }
                }
                else{
                    showResult();
                }
            }
        });

    }
    public void showResult(){
        Intent intent = new Intent(FormActivity.this, OutputActivity.class);

        price = (MainActivity.ovenConsumptionfan * Integer.parseInt(ovenTime) * MainActivity.elecPrice) + (MainActivity.hobConsumption * Integer.parseInt(hobTime) * MainActivity.elecPrice);
        intent.putExtra("price", price);
        FormActivity.this.startActivity(intent);
    }
}