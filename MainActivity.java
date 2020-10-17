package com.example.service;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void StartService(View view) {
        Intent intent = new Intent(MainActivity.this, foregroundService.class);
        startService(intent);
    }

    public void StopService(View view) {
        Intent intent = new Intent(MainActivity.this, foregroundService.class);
        stopService(intent);
    }
}