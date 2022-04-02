package com.example.mproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mproject.ui.gallery.GalleryFragment;

public class Name3 extends AppCompatActivity {

    Button bN, bP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name3);
        getSupportActionBar().hide();
        bN = (Button) findViewById(R.id.nbtn);
        bP = (Button) findViewById(R.id.prebtn);
        bN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Name3.this, Name4.class);
                startActivity(intent);
            }
        });
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Name3.this, Name2.class);
                startActivity(intent);
            }
        });

    }
}
