package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;
    CardView english, bangla, drawing, books, math, rhymes, chora, quiz, ongko, conversant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.imageSlider);

//        // Now we will create a list for images
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.slide_image0, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide_image1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide_image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.slide_image3, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        //New Activity
        english = findViewById(R.id.english);
        bangla = findViewById(R.id.bangla);
        books = findViewById(R.id.books);
        drawing = findViewById(R.id.drawing);
        math = findViewById(R.id.math);
        ongko = findViewById(R.id.ongko);
        rhymes = findViewById(R.id.rhymes);
        conversant = findViewById(R.id.conversant);
        chora = findViewById(R.id.chora);
        quiz = findViewById(R.id.quiz);


        //ON CLICK LISTENER

        //English On Click Listener
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, English.class);
                startActivity(intent);
            }
        });

        //Bangla On Click Listener
        bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BanglaBornomala.class);
                startActivity(intent);
            }
        });

        //Math On Click Listener
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Math.class);
                startActivity(intent);
            }
        });

        //Ongko On Click Listener
        ongko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ongko.class);
                startActivity(intent);
            }
        });

        //Books On Click Listener
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Books.class);
                startActivity(intent);
            }
        });

        //Rhymes On Click Listener
        rhymes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RhymesList.class);
                startActivity(intent);
            }
        });

        //Chora On Click Listener
        chora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChoraList.class);
                startActivity(intent);
            }
        });

        //Conversant On Click Listener
        conversant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Conversant.class);
                startActivity(intent);
            }
        });

        //Drawing On Click Listener
        drawing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Drawing.class);
                startActivity(intent);
            }
        });

        //Quiz On Click Listener
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);
                startActivity(intent);
            }
        });

    }
}