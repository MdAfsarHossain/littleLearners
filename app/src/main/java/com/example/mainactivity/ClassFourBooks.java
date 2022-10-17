package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassFourBooks extends AppCompatActivity {


    LinearLayout classFourBanglaBook, classFourEnglishBook, classFourMathBook, classFourScienceBook;
    LinearLayout classFourBgsBook, classFourIslamBook, classFourHinduBook, classFourBouddhaBook, classFourChristianBook;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_class_four_books);

        // Find Book By id
        classFourBanglaBook = findViewById(R.id.class_four_bangle_book);
        classFourEnglishBook = findViewById(R.id.class_four_english_book);
        classFourMathBook = findViewById(R.id.class_four_math_book);
        classFourScienceBook = findViewById(R.id.class_four_science_book);
        classFourBgsBook = findViewById(R.id.class_four_bgs_book);
        classFourIslamBook = findViewById(R.id.class_four_islam_book);
        classFourHinduBook = findViewById(R.id.class_four_hindu_book);
        classFourBouddhaBook = findViewById(R.id.class_four_bouddha_book);
        classFourChristianBook = findViewById(R.id.class_four_christian_book);
        backBtn = findViewById(R.id.backBtn);


        // Bangla Set On Click Listener
        classFourBanglaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourBanglaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //English Set On Click Listener
        classFourEnglishBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourEnglishBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Math Set On Click Listener
        classFourMathBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourMathBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Science Set On Click Listener
        classFourScienceBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourScienceBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //BGS Set On Click Listener
        classFourBgsBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourBgsBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Islam Set On Click Listener
        classFourIslamBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourIslamBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Hindu Set On Click Listener
        classFourHinduBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourHinduBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Bouddha Set On Click Listener
        classFourBouddhaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourBouddhaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Christian Set On Click Listener
        classFourChristianBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFourBooks.this, ClassFourChristianBook.class);
                startActivity(intent);
//                finish();
            }
        });



        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassFourBooks.super.onBackPressed();
            }
        });

    }
}