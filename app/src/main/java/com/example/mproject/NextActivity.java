package com.example.mproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mproject.ui.home.HomeFragment;

public class NextActivity extends AppCompatActivity {
  Button bn,bp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        bp=(Button) findViewById(R.id.prebtn);
        bn=(Button) findViewById(R.id.nextbtn);
        getSupportActionBar().hide();
        bp.setOnClickListener(view -> {
            Intent intent=new Intent(NextActivity.this, HomeFragment.class);
            startActivity(intent);
        });

    }
}