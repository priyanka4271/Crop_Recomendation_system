package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Next = findViewById(R.id.Next);

        Next.setOnClickListener(view -> {
            Toast.makeText(this, "go to next", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, login_page.class);
            startActivity(intent);
        });
    }
}
