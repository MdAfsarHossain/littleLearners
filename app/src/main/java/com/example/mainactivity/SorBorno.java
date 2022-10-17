package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class SorBorno extends AppCompatActivity {

    ImageView backBtn;
    ImageView imageView;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sor_borno);

        //Hooks
        backBtn = findViewById(R.id.backBtn);
        // Find Image View By ID
        imageView = findViewById(R.id.bangla_image);

        //On CLick Listener

        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SorBorno.super.onBackPressed();
            }
        });
    }

    public void shorborno1(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.shorborno1);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno2(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno2);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno3(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno3);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno4(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno4);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno5(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno5);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno6(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno6);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno7(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno7);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno8(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno8);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno9(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno9);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno10(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno10);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    public void shorborno11(View view) {
        // Word Image
        imageView.setImageResource(R.drawable.shorborno11);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

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