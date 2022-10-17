package com.example.mainactivity;

import static com.example.mainactivity.Display.colorList;
import static com.example.mainactivity.Display.pathArrayList;
import static com.example.mainactivity.Display.current_brush;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Drawing extends AppCompatActivity {

    ImageView backBtn;

    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_drawing);

        //Hooks
        backBtn = findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawing.super.onBackPressed();
            }
        });
    }


    public void pencil(View view) {
        paint_brush.setColor((Color.BLACK));
        currentColor(paint_brush.getColor());
    }

    public void eraser(View view) {

        pathArrayList.clear();
        colorList.clear();
        path.reset();
    }

    public void redColor(View view) {

        paint_brush.setColor((Color.RED));
        currentColor(paint_brush.getColor());
    }

    public void yellowColor(View view) {

        paint_brush.setColor((Color.YELLOW));
        currentColor(paint_brush.getColor());
    }

    public void greenColor(View view) {

        paint_brush.setColor((Color.GREEN));
        currentColor(paint_brush.getColor());
    }

    public void magentaColor(View view) {

        paint_brush.setColor((Color.MAGENTA));
        currentColor(paint_brush.getColor());
    }

    public void blueColor(View view) {

        paint_brush.setColor((Color.BLUE));
        currentColor(paint_brush.getColor());
    }

    public void currentColor(int c) {

        current_brush = c;
        path = new Path();

    }
}