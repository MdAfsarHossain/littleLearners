package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class ClassFiveBanglaBook extends AppCompatActivity {

    PDFView pdfView;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_class_five_bangla_book);

        //Hooks
        pdfView = findViewById(R.id.classFiveBanglaBook);

        pdfView.fromAsset("classFiveBanglaBook.pdf").load();

        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(view -> ClassFiveBanglaBook.super.onBackPressed());
    }
}