package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_up_page extends AppCompatActivity {

    EditText firstName, lastName, email, birthDate, phone, password, confirmPassword;
    Button signupBtn, googleSignUp;
    TextView loginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        birthDate = findViewById(R.id.birthDate);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        signupBtn = findViewById(R.id.signupBtn);
        googleSignUp = findViewById(R.id.googleSignUp);
        loginLink = findViewById(R.id.loginLink);

        signupBtn.setOnClickListener(v -> {
            String user = email.getText().toString();
            String pass = password.getText().toString();
            String confirmPass = confirmPassword.getText().toString();

            if (user.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!pass.equals(confirmPass)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(this, "Signed up successfully!", Toast.LENGTH_SHORT).show();
            // You can add intent to go to Home page here
        });

        // 👇 Go to Login page
        loginLink.setOnClickListener(v -> {
            Intent intent = new Intent(Sign_up_page.this, login_page.class);
            startActivity(intent);
        });

        googleSignUp.setOnClickListener(v ->
                Toast.makeText(this, "Google Sign-In not yet implemented", Toast.LENGTH_SHORT).show());
    }
}
