package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class Animals extends AppCompatActivity {

    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animals);

//        Toast.makeText(getApplicationContext(), "Animals", Toast.LENGTH_LONG).show();


        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlayer();
                Animals.super.onBackPressed();
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

    //Tiger
    public void tiger(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.tiger);
        mediaPlayer.start();
    }

    //Lion
    public void lion(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.lion);
        mediaPlayer.start();
    }

    //Horse
    public void horse(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.horse);
        mediaPlayer.start();
    }

    //Giraff
    public void giraff(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.giraff);
        mediaPlayer.start();
    }

    //Elephant
    public void elephant(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }

    //Fox
    public void fox(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.fox);
        mediaPlayer.start();
    }

    //Dog
    public void dog(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.dog);
        mediaPlayer.start();
    }

    //Monkey
    public void monkey(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }
        mediaPlayer = MediaPlayer.create(this, R.raw.monkey);
        mediaPlayer.start();
    }


}