package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class BenjonBorno extends AppCompatActivity {

    ImageView backBtn;
    ImageView imageView;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_benjon_borno);

        //Hooks
        backBtn = findViewById(R.id.backBtn);
        // Find Image View By ID
        imageView = findViewById(R.id.bangla_image);

        //On CLick Listener

        //Back Button On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopPlayer();
                BenjonBorno.super.onBackPressed();
            }
        });


    }

    //Benjon Borno On Click
    public void benjonBorno1(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno12);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno2(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno13);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno3(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno14);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno4(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno15);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno5(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno16);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno6(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno17);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno7(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno18);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno8(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno19);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno9(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno20);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno10(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno21);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno11(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno22);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno12(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno23);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno13(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno24);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno14(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno25);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno15(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno26);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno16(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno27);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno17(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno28);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno18(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno29);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno19(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno30);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno20(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno31);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno21(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno32);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno22(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno33);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno23(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno34);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno24(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno35);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno25(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno36);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno26(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno37);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno27(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno38);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno28(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno39);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno29(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno40);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno30(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno41);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno31(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno42);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno32(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno43);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno33(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno44);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno34(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno45);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno35(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno46);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno36(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno47);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno37(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno48);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno38(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno49);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }

    public void benjonBorno39(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.benjonborno50);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
//        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

//        mediaPlayer.start();
    }


    // Stop Player
    private void stopPlayer() {

        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}