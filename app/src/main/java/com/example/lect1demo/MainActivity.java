package com.example.lect1demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button appButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appButton = (Button) findViewById(R.id.layoutBtn);

        appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TEST", "I pressed a button & I love git!!!!!");
                Toast.makeText(MainActivity.this, "I am a toast! message", Toast.LENGTH_LONG).show();
            }
        });
    }
}