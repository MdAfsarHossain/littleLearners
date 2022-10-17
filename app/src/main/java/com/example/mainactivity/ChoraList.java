package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class ChoraList extends AppCompatActivity {

    ImageView backBtn;
    Button choraOne, choraTwo, choraThree, choraFour, choraFive, choraSix, choraSeven, choraEight, choraNine, choraTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chora_list);

        //Hooks
        backBtn = findViewById(R.id.backBtn);
        choraOne = findViewById(R.id.choraOne);
        choraTwo = findViewById(R.id.choraTwo);
        choraThree = findViewById(R.id.choraThree);
        choraFour = findViewById(R.id.choraFour);
        choraFive = findViewById(R.id.choraFive);
        choraSix = findViewById(R.id.choraSix);
        choraSeven = findViewById(R.id.choraSeven);
        choraEight = findViewById(R.id.choraEight);
        choraNine = findViewById(R.id.choraNine);
        choraTen = findViewById(R.id.choraTen);

        //Chora One On Click
        choraOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraOne.class);
                startActivity(intent);
            }
        });

        //Chora Two On Click
        choraTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraTwo.class);
                startActivity(intent);
            }
        });

        //Chora Three On Click
        choraThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraThree.class);
                startActivity(intent);
            }
        });

        //Chora Four On Click
        choraFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraFour.class);
                startActivity(intent);
            }
        });

        //Chora Five On Click
        choraFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraFive.class);
                startActivity(intent);
            }
        });

        //Chora Six On Click
        choraSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraSix.class);
                startActivity(intent);
            }
        });

        //Chora Seven On Click
        choraSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraSeven.class);
                startActivity(intent);
            }
        });

        //Chora Eight On Click
        choraEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraEight.class);
                startActivity(intent);
            }
        });

        //Chora Nine On Click
        choraNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraNine.class);
                startActivity(intent);
            }
        });

        //Chora Ten On Click
        choraTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoraList.this, ChoraTen.class);
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChoraList.super.onBackPressed();
            }
        });

    }
}