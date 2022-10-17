package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChoraOne extends AppCompatActivity {

    ImageView backBtn;
    Button playBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chora_one);

        //Hooks
        backBtn = findViewById(R.id.backBtn);
        //playBtn = findViewById(R.id.play);

        //Set On Click Listener
        //Play

        //Back Button
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChoraOne.super.onBackPressed();
            }
        });
    }

    //Music Stop
    // Stop Player
    private void stopPlayer() {

        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void playChora(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.a_for_apple);
        mediaPlayer.start();

    }
    // Stop Player Finish
}