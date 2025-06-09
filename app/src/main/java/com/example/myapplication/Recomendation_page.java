package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Recomendation_page extends AppCompatActivity {

    EditText nitrogen, phosphorus, potassium, temperature, humidity, ph, rainfall;
    Button recommendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendation_page);

        nitrogen = findViewById(R.id.inputNitrogen);
        phosphorus = findViewById(R.id.inputPhosphorus);
        potassium = findViewById(R.id.inputPotassium);
        temperature = findViewById(R.id.inputTemperature);
        humidity = findViewById(R.id.inputHumidity);
        ph = findViewById(R.id.inputPH);
        rainfall = findViewById(R.id.inputRainfall);
        recommendBtn = findViewById(R.id.btnRecommend);

        recommendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = nitrogen.getText().toString();
                String p = phosphorus.getText().toString();
                String k = potassium.getText().toString();
                String temp = temperature.getText().toString();
                String hum = humidity.getText().toString();
                String phVal = ph.getText().toString();
                String rain = rainfall.getText().toString();

                if (n.isEmpty() || p.isEmpty() || k.isEmpty() || temp.isEmpty() || hum.isEmpty() || phVal.isEmpty() || rain.isEmpty()) {
                    Toast.makeText(Recomendation_page.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Replace with your ML model or API call
                    Toast.makeText(Recomendation_page.this, "Recommendation logic goes here!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
