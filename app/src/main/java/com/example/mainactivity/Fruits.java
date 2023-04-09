package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Fruits extends AppCompatActivity {

    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fruits);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stopPlayer();
                Fruits.super.onBackPressed();
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

    //apple
    public void apple(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.apple);
        mediaPlayer.start();
    }

    //mango
    public void mango(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.mango);
        mediaPlayer.start();
    }

    //orange
    public void orange(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.orange);
        mediaPlayer.start();
    }

    //pineapple
    public void pineapple(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.pineapple);
        mediaPlayer.start();
    }

    //jackfruit
    public void jackfruit(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.jackfruit);
        mediaPlayer.start();
    }

    //watermelon
    public void watermelon(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.watermelon);
        mediaPlayer.start();
    }

    //banana
    public void banana(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.banana);
        mediaPlayer.start();
    }

    //strawberry
    public void straweberry(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.straweberry);
        mediaPlayer.start();
    }

}