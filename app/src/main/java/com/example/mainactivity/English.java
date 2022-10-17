package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class English extends AppCompatActivity {

    ImageView imageView;
    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_english);

        //Hooks
        imageView = findViewById(R.id.english_image);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                English.super.onBackPressed();
            }
        });
    }


    // Audio Java Code

    // A Button
    public void alphabet_a(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.a_for_apple);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.a_for_apple);
        mediaPlayer.start();
    }


    // B Button
    public void alphabet_b(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.b_for_bat);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.b_for_bat);
        mediaPlayer.start();
    }


    // C Button
    public void alphabet_c(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.c_for_cap);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.c_for_cap);
        mediaPlayer.start();
    }

    // D Button
    public void alphabet_d(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.d_for_dog);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.d_for_dog);
        mediaPlayer.start();
    }

    // E Button
    public void alphabet_e(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.e_for_egg);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.e_for_egg);
        mediaPlayer.start();
    }

    // F Button
    public void alphabet_f(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.f_for_fish);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.f_for_fish);

        mediaPlayer.start();
    }

    // G Button
    public void alphabet_g(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.g_for_girl);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.g_for_girl);

        mediaPlayer.start();
    }

    // H Button
    public void alphabet_h(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.h_for_hen);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.h_for_hen);

        mediaPlayer.start();
    }

    // I Button
    public void alphabet_i(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.i_for_igloo);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.i_for_igloo);

        mediaPlayer.start();
    }

    // J Button
    public void alphabet_j(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.j_for_jeep);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.j_for_jeep);

        mediaPlayer.start();
    }

    // K Button
    public void alphabet_k(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.k_for_kite);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.k_for_kite);

        mediaPlayer.start();
    }

    // L Button
    public void alphabet_l(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.l_for_lion);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.l_for_lion);

        mediaPlayer.start();
    }

    // M Button
    public void alphabet_m(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.m_for_mango);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.m_for_mango);

        mediaPlayer.start();
    }

    // N Button
    public void alphabet_n(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.n_for_net);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.n_for_net);

        mediaPlayer.start();
    }

    // O Button
    public void alphabet_o(View view) {

        // Word Image
        imageView.setImageResource(R.drawable.o_for_orange);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.o_for_orange);

        mediaPlayer.start();
    }

    // P Button
    public void alphabet_p(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.p_for_pot);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.p_for_pot);

        mediaPlayer.start();
    }

    // Q Button
    public void alphabet_q(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.q_for_queen);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.q_for_queen);

        mediaPlayer.start();
    }

    // R Button
    public void alphabet_r(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.r_for_rose);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.r_for_rose);

        mediaPlayer.start();
    }

    // S Button
    public void alphabet_s(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.s_for_sun);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.s_for_sun);

        mediaPlayer.start();
    }

    // T Button
    public void alphabet_t(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.t_for_tiger);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.t_for_tiger);

        mediaPlayer.start();
    }

    // U Button
    public void alphabet_u(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.u_for_umbrella);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.u_for_umbrella);

        mediaPlayer.start();
    }

    // V Button
    public void alphabet_v(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.v_for_vase);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.v_for_vase);

        mediaPlayer.start();
    }

    // W Button
    public void alphabet_w(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.w_for_window);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.w_for_window);

        mediaPlayer.start();
    }

    // X Button
    public void alphabet_x(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.x_for_xray);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.x_for_xray);

        mediaPlayer.start();
    }

    // Y Button
    public void alphabet_y(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.y_for_yoyo);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.y_for_yoyo);

        mediaPlayer.start();
    }

    // Z Button
    public void alphabet_z(View view) {


        // Word Image
        imageView.setImageResource(R.drawable.z_for_zebra);

        // Audio
        if (mediaPlayer != null) {
            stopPlayer();

        }
        mediaPlayer = MediaPlayer.create(this, R.raw.z_for_zebra);

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