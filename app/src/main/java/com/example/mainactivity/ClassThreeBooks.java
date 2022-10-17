package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassThreeBooks extends AppCompatActivity {


    LinearLayout classThreeBanglaBook, classThreeEnglishBook, classThreeMathBook, classThreeScienceBook, classThreeBgsBook;
    LinearLayout classThreeIslamBook, classThreeHinduBook, classThreeBouddhaBook, classThreeChristianBook;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_class_three_books);


        // Find Book By id
        classThreeBanglaBook = findViewById(R.id.class_three_bangle_book);
        classThreeEnglishBook = findViewById(R.id.class_three_english_book);
        classThreeMathBook = findViewById(R.id.class_three_math_book);
        classThreeScienceBook = findViewById(R.id.class_three_science_book);
        classThreeBgsBook = findViewById(R.id.class_three_bgs_book);
        classThreeIslamBook = findViewById(R.id.class_three_islam_book);
        classThreeHinduBook = findViewById(R.id.class_three_hindu_book);
        classThreeBouddhaBook = findViewById(R.id.class_three_bouddha_book);
        classThreeChristianBook = findViewById(R.id.class_three_christian_book);
        backBtn = findViewById(R.id.backBtn);


        // Bangla Set On Click Listener
        classThreeBanglaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeBanglaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //English Set On Click Listener
        classThreeEnglishBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeEnglishBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Math Set On Click Listener
        classThreeMathBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeMathBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Science Set On Click Listener
        classThreeScienceBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeScienceBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //BGS Set On Click Listener
        classThreeBgsBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeBgsBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Islam Set On Click Listener
        classThreeIslamBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeIslamBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Hindu Set On Click Listener
        classThreeHinduBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeHinduBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Bouddha Set On Click Listener
        classThreeBouddhaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeBouddhaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Christian Set On Click Listener
        classThreeChristianBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassThreeBooks.this, ClassThreeChristianBook.class);
                startActivity(intent);
//                finish();
            }
        });



        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassThreeBooks.super.onBackPressed();
            }
        });
    }
}