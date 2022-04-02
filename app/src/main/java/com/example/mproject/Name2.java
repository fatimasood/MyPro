package com.example.mproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mproject.ui.gallery.GalleryFragment;
import com.example.mproject.ui.home.HomeFragment;

public class Name2 extends AppCompatActivity {
 Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name2);
        getSupportActionBar().hide();
        b1=(Button) findViewById(R.id.nextbtn1);
        b2=(Button) findViewById(R.id.nextbtn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Name2.this, Name3.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Name2.this, GalleryFragment.class);
                startActivity(intent);
            }
        });
    }
}