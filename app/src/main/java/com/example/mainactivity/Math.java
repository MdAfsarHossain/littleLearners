package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Math extends AppCompatActivity {

    ImageView imageView;
    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_math);

        //Hooks
        imageView = findViewById(R.id.english_image);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlayer();
                Math.super.onBackPressed();
            }
        });
    }

    // Audio Java Code

    public void one(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.one_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.one);
        mediaPlayer.start();
    }

    public void two(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.two_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.two);
        mediaPlayer.start();
    }

    public void three(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.three_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.three);
        mediaPlayer.start();
    }

    public void four(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.four_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.four);
        mediaPlayer.start();
    }

    public void five(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.five_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.five);
        mediaPlayer.start();
    }

    public void six(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.six_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.six);
        mediaPlayer.start();
    }

    public void seven(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.seven_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.seven);
        mediaPlayer.start();
    }

    public void eight(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.eight_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.eight);
        mediaPlayer.start();
    }

    public void nine(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.nine_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.nine);
        mediaPlayer.start();
    }

    public void ten(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.ten_word);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.ten);
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