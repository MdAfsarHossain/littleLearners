package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ClassZeroBooks extends AppCompatActivity {

    LinearLayout classZeroAmarBoi;
    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_class_zero_books);


        classZeroAmarBoi = findViewById(R.id.class_zero_amar_boi);
        backBtn = findViewById(R.id.backBtn);


        classZeroAmarBoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClassZeroBooks.this, ClassZeroAmarBoi.class);
                startActivity(intent);
//                finish();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassZeroBooks.super.onBackPressed();
            }
        });

    }
}