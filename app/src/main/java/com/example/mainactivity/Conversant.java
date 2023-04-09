package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Conversant extends AppCompatActivity {

    ImageView backBtn;
    RelativeLayout animals, fish;
    CardView fruits, food, vegetables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_conversant);

        animals = findViewById(R.id.animals);
        fruits = findViewById(R.id.fruits);
        food = findViewById(R.id.food);
        vegetables = findViewById(R.id.vegetables);
        fish= findViewById(R.id.fish);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stopPlayer();
                Conversant.super.onBackPressed();
            }
        });

        //Animals
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Conversant.this, Animals.class);
                startActivity(intent);
            }
        });

        //Fruits
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Conversant.this, Fruits.class);
                startActivity(intent);
            }
        });

        //Food
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Conversant.this, Food.class);
                startActivity(intent);
            }
        });

        //Vegetables
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Conversant.this, Vegetables.class);
                startActivity(intent);
            }
        });

        //Fish
        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Conversant.this, Fish.class);
                startActivity(intent);
            }
        });

    }
}