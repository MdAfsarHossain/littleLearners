package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassTwoBooks extends AppCompatActivity {

    LinearLayout classTwoBanglaBook, classTwoEnglishBook, classTwoMathBook;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_class_two_books);

        // Find Book By id
        classTwoBanglaBook = findViewById(R.id.class_two_bangle_book);
        classTwoEnglishBook = findViewById(R.id.class_two_english_book);
        classTwoMathBook = findViewById(R.id.class_two_math_book);
        backBtn = findViewById(R.id.backBtn);


        // Book Set On Click Listener
        classTwoBanglaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassTwoBooks.this, ClassTwoBanglaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        classTwoEnglishBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassTwoBooks.this, ClassTwoEnglishBook.class);
                startActivity(intent);
//                finish();
            }
        });

        classTwoMathBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassTwoBooks.this, ClassTwoMathBook.class);
                startActivity(intent);
//                finish();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassTwoBooks.super.onBackPressed();
            }
        });
    }
}