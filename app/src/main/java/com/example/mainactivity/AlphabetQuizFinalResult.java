package com.example.mainactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class AlphabetQuizFinalResult extends AppCompatActivity {

    TextView correctAns, wrongAns, emptyAns, successRate;
    Button playAgain, quitGame;
    int correctAnswer;
    int wrongAnswer;
    int totalQuestion;
    int emptyQuestion;
    int successRatePercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_alphabet_quiz_final_result);


        //Hooks
        correctAns = findViewById(R.id.correctAns);
        wrongAns = findViewById(R.id.wrongAns);
        emptyAns = findViewById(R.id.emptyAns);
        successRate = findViewById(R.id.successRate);

        quitGame = findViewById(R.id.quitGame);

        correctAnswer = Integer.parseInt(getIntent().getStringExtra("correctAnswer"));
        wrongAnswer = Integer.parseInt(getIntent().getStringExtra("wrongAnswer"));
        totalQuestion = Integer.parseInt(getIntent().getStringExtra("totalQuestion"));

        emptyQuestion = 10 - correctAnswer - wrongAnswer;
        successRatePercentage = (correctAnswer * 100) / 10;

        //Set On Click Listener
        correctAns.setText("Total Correct Answer: " + correctAnswer);
        wrongAns.setText("Total Wrong Answer: " + wrongAnswer);
        emptyAns.setText("Total Empty Answer: " + emptyQuestion);
        successRate.setText("Success Rate: " + successRatePercentage + "%");

        //Quit Game
        quitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetQuizFinalResult.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    //Play Again
    public void playAgain(View view) {

        if(!isConnected(this)) {
            showCustomDialog();
            return;
        } else {
            Intent intent = new Intent(AlphabetQuizFinalResult.this, AlphabetQuizQuestion.class);
            startActivity(intent);
            finish();
        }
    }


    //Check Internet Connection
    private boolean isConnected(AlphabetQuizFinalResult mainActivity) {

        ConnectivityManager connectivityManager = (ConnectivityManager) mainActivity.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifiConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileConn = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if((wifiConn != null && wifiConn.isConnected()) || (mobileConn != null && mobileConn.isConnected())) {
//            Toast.makeText(MainActivity.this, "Internet Connect", Toast.LENGTH_SHORT).show();
            return true;
        } else {
//            Toast.makeText(MainActivity.this, "No internet Connect", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void showCustomDialog() {
//        Toast.makeText(MainActivity.this, "Show Custom Dialog", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(AlphabetQuizFinalResult.this);
        builder.setMessage("Please connect to the internet to proceed further")
                .setCancelable(false)
                .setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    //End Check Internet Connection
}