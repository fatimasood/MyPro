package com.example.mproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Name4 extends AppCompatActivity {

    Button bN1,bP1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name4);
        getSupportActionBar().hide();
        bN1 = (Button) findViewById(R.id.nbtn);
        bP1 = (Button) findViewById(R.id.prebtn);
        bP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Name4.this, Name3.class);
                startActivity(intent);
            }
        });

    }
}