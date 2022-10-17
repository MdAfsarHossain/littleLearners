package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class BanglaBornomala extends AppCompatActivity {

    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bangla_bornomala);

        //Hooks
        backBtn = findViewById(R.id.backBtn);


        //On CLick Listener

        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BanglaBornomala.super.onBackPressed();
            }
        });
    }

    //Sorborno
    public void sorBorno(View view) {
        Intent intent = new Intent(BanglaBornomala.this, SorBorno.class);
        startActivity(intent);
    }

    //Benjonborno
    public void benjonBorno(View view) {
        Intent intent = new Intent(BanglaBornomala.this, BenjonBorno.class);
        startActivity(intent);
    }

}