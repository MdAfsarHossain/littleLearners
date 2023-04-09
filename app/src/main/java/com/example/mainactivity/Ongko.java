package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Ongko extends AppCompatActivity {

    ImageView imageView;
    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ongko);
        //Hooks
        imageView = findViewById(R.id.english_image);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlayer();
                Ongko.super.onBackPressed();
            }
        });
    }

    // Audio Java Code

    public void ek(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.ek_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.ek);
        mediaPlayer.start();

    }

    public void dui(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.dui_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.dui);
        mediaPlayer.start();
    }

    public void tin(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.tin_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.tin);
        mediaPlayer.start();
    }

    public void car(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.car_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.car);
        mediaPlayer.start();
    }

    public void pach(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.pach_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.pach);
        mediaPlayer.start();
    }

    public void choy(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.choy_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.choy);
        mediaPlayer.start();
    }

    public void sat(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.sat_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.sat);
        mediaPlayer.start();
    }

    public void at(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.at_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.at);
        mediaPlayer.start();
    }

    public void noy(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.noy_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.noy);
        mediaPlayer.start();
    }

    public void dos(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.dos_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.dosh);
        mediaPlayer.start();
    }

    // Stop Player
    private void stopPlayer() {

        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}