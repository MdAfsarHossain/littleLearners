package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    ImageView splashImage;
    TextView littleText, learnersText, poweredText;

    Animation splashAnimation, littleAnimation, learnersAnimation, poweredAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        splashImage = findViewById(R.id.splashImage);
        littleText = findViewById(R.id.littleText);
        learnersText = findViewById(R.id.learnersText);
        poweredText = findViewById(R.id.powered);

        //Animation Calls
        splashAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        littleAnimation = AnimationUtils.loadAnimation(this, R.anim.left_animation);
        learnersAnimation = AnimationUtils.loadAnimation(this, R.anim.right_animation);
        poweredAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //-----------Setting Animations to the elements of Splash
//        Screen-------- - first.setAnimation(topAnimantion);
        splashImage.setAnimation(splashAnimation);
        littleText.setAnimation(littleAnimation);
        learnersText.setAnimation(learnersAnimation);
        poweredText.setAnimation(poweredAnimation);

        //Splash Screen Code to call new Activity after some time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Calling new Activity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}