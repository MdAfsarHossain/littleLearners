package com.example.mainactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AlphabetQuizQuestion extends AppCompatActivity {

    Button buttonA, buttonB, buttonC, buttonD;
    TextView questionNumberTextShow, setTimer, timesUpText;
    ImageView questionImage;


    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = database.getReference().child("Questions");

    String quizQuestion;
    String quizAnswerA;
    String quizAnswerB;
    String quizAnswerC;
    String quizAnswerD;
    String quizCorrectAnswer;
    String questionNumberText;
    int questionCount;
    int questionNumber = 1;
    int correctAnswer = 0;
    int wrongAnswer = 0;

    CountDownTimer countDownTimer;
    private static final long TOTAL_TIME = 5000;
    Boolean timerContinue;
    long leftTime = TOTAL_TIME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_alphabet_quiz_question);


        //Hooks
        questionNumberTextShow = findViewById(R.id.questionNumber);
        setTimer = findViewById(R.id.timer);
        timesUpText = findViewById(R.id.timesUpText);
        questionImage = (ImageView)findViewById(R.id.questionImage);
        buttonA = findViewById(R.id.buttonA);
        buttonB = findViewById(R.id.buttonB);
        buttonC = findViewById(R.id.buttonC);
        buttonD = findViewById(R.id.buttonD);

        //questionImage.setVisibility(View.VISIBLE);

        start();

        //Set On Click Listener
        //Button A
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //questionImage.setImageResource("@d");
                //Toast.makeText(getApplicationContext(), "Question Image", Toast.LENGTH_LONG).show();
                pauseTimer();
                answerControl(buttonA);
            }
        });

        //Button B
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pauseTimer();
                answerControl(buttonB);
            }
        });

        //Button C
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pauseTimer();
                answerControl(buttonC);
            }
        });

        //Button D
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pauseTimer();
                answerControl(buttonD);
            }
        });
        //End of Set On Click Listener
    }


    //Next Question
    public void nextQuestion(View view) {

        if(!isConnected(this)) {
            showCustomDialog();
            return;
        }
        else {
            resetTimer();

            timesUpText.setVisibility(View.INVISIBLE);
            questionImage.setVisibility(View.INVISIBLE);

            if(questionNumber == (questionCount+1))
            {
                //Toast.makeText(getApplicationContext(), "Correct Answer: " + correctAnswer, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AlphabetQuizQuestion.this, AlphabetQuizFinalResult.class);

                //TODO: Sent Data Final Result Activity
                intent.putExtra("correctAnswer", String.valueOf(correctAnswer));
                intent.putExtra("wrongAnswer", String.valueOf(wrongAnswer));
                intent.putExtra("totalQuestion", String.valueOf(questionCount));
                startActivity(intent);
            }
            else
            {
                timesUpText.setVisibility(View.INVISIBLE);
                questionImage.setVisibility(View.INVISIBLE);

                buttonA.setClickable(true);
                buttonB.setClickable(true);
                buttonC.setClickable(true);
                buttonD.setClickable(true);

                buttonA.setBackgroundColor(Color.WHITE);
                buttonB.setBackgroundColor(Color.WHITE);
                buttonC.setBackgroundColor(Color.WHITE);
                buttonD.setBackgroundColor(Color.WHITE);

                resetTimer();
                start();
            }
        }
    }
    //End of Next Question

    //Check Answer
    public void answerControl(Button button) {

        String buttonText = button.getText().toString();
        String correctAns = "Apple";
        //Toast.makeText(getApplicationContext(), buttonText, Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(), quizCorrectAnswer, Toast.LENGTH_LONG).show();

        if(buttonText.equals(quizCorrectAnswer)) {
            button.setBackgroundColor(Color.GREEN);
            correctAnswer++;
        }
        else
        {
            wrongAnswer++;
            button.setBackgroundColor(Color.RED);

            if(buttonA.getText().toString().equals(quizCorrectAnswer)) {
                buttonA.setBackgroundColor(Color.GREEN);
            }

            if(buttonB.getText().toString().equals(quizCorrectAnswer)) {
                buttonB.setBackgroundColor(Color.GREEN);
            }

            if(buttonC.getText().toString().equals(quizCorrectAnswer)) {
                buttonC.setBackgroundColor(Color.GREEN);
            }

            if(buttonD.getText().toString().equals(quizCorrectAnswer)) {
                buttonD.setBackgroundColor(Color.GREEN);
            }
        }

        buttonA.setClickable(false);
        buttonB.setClickable(false);
        buttonC.setClickable(false);
        buttonD.setClickable(false);
    }
    //End of Check Answer

    //Data Base
    //Start Quiz
    public void start()
    {
        // Read from the database
        databaseReference.addValueEventListener(new ValueEventListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                //Get Value From Database
                questionCount = (int) dataSnapshot.getChildrenCount();
                quizQuestion = dataSnapshot.child(String.valueOf(questionNumber)).child("q").getValue().toString();
                quizAnswerA = dataSnapshot.child(String.valueOf(questionNumber)).child("a").getValue().toString();
                quizAnswerB = dataSnapshot.child(String.valueOf(questionNumber)).child("b").getValue().toString();
                quizAnswerC = dataSnapshot.child(String.valueOf(questionNumber)).child("c").getValue().toString();
                quizAnswerD = dataSnapshot.child(String.valueOf(questionNumber)).child("d").getValue().toString();
                quizCorrectAnswer = dataSnapshot.child(String.valueOf(questionNumber)).child("answer").getValue().toString();

                questionNumberText = "Question: " + questionNumber;

                //Set Value
                int imageResource = getResources().getIdentifier(quizQuestion, "drawable", getPackageName());

                questionImage.setVisibility(View.VISIBLE);
                questionImage.setImageResource(imageResource);
                buttonA.setText(quizAnswerA);
                buttonB.setText(quizAnswerB);
                buttonC.setText(quizAnswerC);
                buttonD.setText(quizAnswerD);
                questionNumberTextShow.setText(questionNumberText);

                startTimer();

                if(questionNumber <= questionCount)
                {
                    questionNumber++;
                }
                else
                {
//                    Toast.makeText(getApplicationContext(), "You Answered all question!", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Correct Answer: " + correctAnswer, Toast.LENGTH_SHORT).show();

//                    Toast.makeText(getApplicationContext(), "Total Question: " + questionCount, Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(Question.this, FinalResult.class);
                    //startActivity(intent);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Toast.makeText(getApplicationContext(), "There is an ERROR!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //End of Quiz

    //Check Internet Connection
    private boolean isConnected(AlphabetQuizQuestion mainActivity) {

        timesUpText.setVisibility(View.INVISIBLE);
        questionImage.setVisibility(View.INVISIBLE);

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

    //Custom Dialog
    private void showCustomDialog() {
//        Toast.makeText(MainActivity.this, "Show Custom Dialog", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(AlphabetQuizQuestion.this);
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
    //End of Custom Dialog

    //End Check Internet Connection


    //Set Timer
    //Start Timer
    public void startTimer()
    {
        countDownTimer = new CountDownTimer(leftTime, 1000) {
            @Override
            public void onTick(long l) {
                leftTime = l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timerContinue = false;
                pauseTimer();
                questionImage.setVisibility(View.INVISIBLE);
                timesUpText.setVisibility(View.VISIBLE);
                buttonA.setClickable(false);
                buttonB.setClickable(false);
                buttonC.setClickable(false);
                buttonD.setClickable(false);
                //Toast.makeText(getApplicationContext(), "Sorry!! Time is UP!!!", Toast.LENGTH_SHORT).show();
            }
        }.start();

        timerContinue = true;
    }

    //Reset Timer
    public void resetTimer()
    {
        leftTime = TOTAL_TIME;
        updateCountDownText();
    }

    //Update Count Down Text
    public void updateCountDownText()
    {
        int second = (int) (leftTime / 1000) % 60;
        setTimer.setText("Time: " + second);
    }

    //Pause Timer
    public void pauseTimer()
    {
        countDownTimer.cancel();
        timerContinue = false;
    }
    //End of Timer
}