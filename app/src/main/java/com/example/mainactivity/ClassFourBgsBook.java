package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class ClassFourBgsBook extends AppCompatActivity {

    PDFView pdfView;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_class_four_bgs_book);


        //Hooks
        pdfView = findViewById(R.id.classFourBgsBook);

        pdfView.fromAsset("ClassFourBgsBook.pdf").load();

        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassFourBgsBook.super.onBackPressed();
            }
        });

    }
}