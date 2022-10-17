package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class RhymesList extends AppCompatActivity {

    ImageView backBtn;
    Button rhymesOne, rhymesTwo, rhymesThree, rhymesFour, rhymesFive, rhymesSix, rhymesSeven, rhymesEight, rhymesNine, rhymesTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_rhymes_list);

        //Hooks
        backBtn = findViewById(R.id.backBtn);
        rhymesOne = findViewById(R.id.rhymesOne);
        rhymesTwo = findViewById(R.id.rhymesTwo);
        rhymesThree = findViewById(R.id.rhymesThree);
        rhymesFour = findViewById(R.id.rhymesFour);
        rhymesFive = findViewById(R.id.rhymesFive);
        rhymesSix = findViewById(R.id.rhymesSix);
        rhymesSeven = findViewById(R.id.rhymesSeven);
        rhymesEight = findViewById(R.id.rhymesEight);
        rhymesNine = findViewById(R.id.rhymesNine);
        rhymesTen = findViewById(R.id.rhymesTen);

        //Rhymes One Set On Click Listener
        rhymesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesOne.class);
                startActivity(intent);
            }
        });

        //Rhymes Two Set On Click Listener
        rhymesTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesTwo.class);
                startActivity(intent);
            }
        });

        //Rhymes Three Set On Click Listener
        rhymesThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesThree.class);
                startActivity(intent);
            }
        });

        //Rhymes Four Set On Click Listener
        rhymesFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesFour.class);
                startActivity(intent);
            }
        });

        //Rhymes Five Set On Click Listener
        rhymesFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesFive.class);
                startActivity(intent);
            }
        });

        //Rhymes Six Set On Click Listener
        rhymesSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesSix.class);
                startActivity(intent);
            }
        });


        //Rhymes Seven Set On Click Listener
        rhymesSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RhymesList.this, RhymesSeven.class);
                startActivity(intent);
            }
        });


        //Rhymes Eight Set On Click Listener
        rhymesEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(RhymesList.this, RhymesEight.class);
                //startActivity(intent);
            }
        });


        //Rhymes Nine Set On Click Listener
        rhymesNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(RhymesList.this, RhymesNine.class);
                //startActivity(intent);
            }
        });


        //Rhymes Ten Set On Click Listener
        rhymesTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(RhymesList.this, RhymesTen.class);
                //startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RhymesList.super.onBackPressed();
            }
        });

    }
}