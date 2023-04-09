package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Food extends AppCompatActivity {

    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_food);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stopPlayer();
                Food.super.onBackPressed();
            }
        });
    }

    //Music
    // Stop Player
    private void stopPlayer() {

        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    //burger
    public void burger(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.burger);
        mediaPlayer.start();
    }

    //pizza
    public void pizza(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.pizza);
        mediaPlayer.start();
    }

    //cake
    public void cake(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.cake);
        mediaPlayer.start();
    }

    //biryani
    public void biryani(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.biryani);
        mediaPlayer.start();
    }

    //pasta
    public void pasta(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.pasta);
        mediaPlayer.start();
    }

    //rice
    public void rice(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.rice);
        mediaPlayer.start();
    }
}