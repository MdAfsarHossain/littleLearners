package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Books extends AppCompatActivity {

    ImageView backBtn;
    Button classZero, classOne, classTwo, classThree, classFour, classFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_books);


        //Hooks
        backBtn = findViewById(R.id.backBtn);
        classZero = findViewById(R.id.classZero);
        classOne = findViewById(R.id.classOne);
        classTwo = findViewById(R.id.classTwo);
        classThree = findViewById(R.id.classThree);
        classFour = findViewById(R.id.classFour);
        classFive = findViewById(R.id.classFive);


        //On CLick Listener

        //Primary Class On Click Listener
        classZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Books.this, ClassZeroBooks.class);
                startActivity(intent);
            }
        });

        //Class One On Click Listener
        classOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Books.this, ClassOneBooks.class);
                startActivity(intent);
            }
        });


        //Class Two On Click Listener
        classTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Books.this, ClassTwoBooks.class);
                //startActivity(intent);
            }
        });


        //Class Three On Click Listener
        classThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Books.this, ClassThreeBooks.class);
                //startActivity(intent);
            }
        });

        //Class Four On Click Listener
        classFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Books.this, ClassFourBooks.class);
                //startActivity(intent);
            }
        });


        //Class Five On Click Listener
        classFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Books.this, ClassFiveBooks.class);
                //startActivity(intent);
            }
        });

        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Books.super.onBackPressed();
            }
        });
    }
}