package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassFiveBooks extends AppCompatActivity {

    LinearLayout classFiveBanglaBook, classFiveEnglishBook, classFiveMathBook, classFiveScienceBook, classFiveBgsBook;
    LinearLayout classFiveIslamBook, classFiveHinduBook, classFiveBouddhaBook, classFiveChristianBook;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_class_five_books);


        // Find Book By id
        classFiveBanglaBook = findViewById(R.id.class_five_bangla_book);
        classFiveEnglishBook = findViewById(R.id.class_five_english_book);
        classFiveMathBook = findViewById(R.id.class_five_math_book);
        classFiveScienceBook = findViewById(R.id.class_five_science_book);
        classFiveBgsBook = findViewById(R.id.class_five_bgs_book);
        classFiveIslamBook = findViewById(R.id.class_five_islam_book);
        classFiveHinduBook = findViewById(R.id.class_five_hindu_book);
        classFiveBouddhaBook = findViewById(R.id.class_five_bouddha_book);
        classFiveChristianBook = findViewById(R.id.class_five_christian_book);
        backBtn = findViewById(R.id.backBtn);


        // Bangla Set On Click Listener
        classFiveBanglaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveBanglaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //English Set On Click Listener
        classFiveEnglishBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveEnglishBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Math Set On Click Listener
        classFiveMathBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveMathBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Science Set On Click Listener
        classFiveScienceBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveScienceBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //BGS Set On Click Listener
        classFiveBgsBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveBgsBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Islam Set On Click Listener
        classFiveIslamBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveIslamBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Hindu Set On Click Listener
        classFiveHinduBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveHinduBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Bouddha Set On Click Listener
        classFiveBouddhaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveBouddhaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        //Christian Set On Click Listener
        classFiveChristianBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassFiveBooks.this, ClassFiveChristianBook.class);
                startActivity(intent);
//                finish();
            }
        });


        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassFiveBooks.super.onBackPressed();
            }
        });
    }
}