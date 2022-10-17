package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassOneBooks extends AppCompatActivity {

    LinearLayout classOneBanglaBook, classOneEnglishBook, classOneMathBook;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_class_one_books);

        // Find Book By id
        classOneBanglaBook = findViewById(R.id.class_one_bangle_book);
        classOneEnglishBook = findViewById(R.id.class_one_english_book);
        classOneMathBook = findViewById(R.id.class_one_math_book);
        backBtn = findViewById(R.id.backBtn);


        // Book Set On Click Listener
        classOneBanglaBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassOneBooks.this, ClassOneBanglaBook.class);
                startActivity(intent);
//                finish();
            }
        });

        classOneEnglishBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassOneBooks.this, ClassOneEnglishBook.class);
                startActivity(intent);
//                finish();
            }
        });

        classOneMathBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassOneBooks.this, ClassOneMathBook.class);
                startActivity(intent);
//                finish();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassOneBooks.super.onBackPressed();
            }
        });
    }
}