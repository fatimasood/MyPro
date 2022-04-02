package com.example.mproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mproject.ui.gallery.GalleryFragment;
import com.example.mproject.ui.home.HomeFragment;

public class duaActivity extends AppCompatActivity {
 Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        getSupportActionBar().hide();
        b=(Button) findViewById(R.id.backbtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(duaActivity.this, HomeFragment.class);
                startActivity(intent);
            }
        });
    }
}