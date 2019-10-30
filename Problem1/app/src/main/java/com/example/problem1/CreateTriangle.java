package com.example.problem1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateTriangle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);


        Integer levels = Integer.parseInt(getIntent().getStringExtra("levels"));

        LinearLayout layout = new LinearLayout(this);
        LinearLayout rows;

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        layout.setLayoutParams(layoutParams);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        for (int i = 1; i<= levels; i++){
            rows = new LinearLayout(this);
            ViewGroup.LayoutParams rowParams = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            );

            rows.setLayoutParams(rowParams);
            rows.setOrientation(LinearLayout.HORIZONTAL);
            rows.setGravity(Gravity.CENTER_HORIZONTAL);

            for(int j = 0; j<i; j++){

                TextView tv;
                tv = new TextView(this);
                tv.setText("     ");
                tv.setBackgroundColor(Color.BLUE);
                tv.setGravity(Gravity.CENTER);


                rows.addView(tv);

            }
            layout.addView(rows);

        }
            setContentView(layout);

    }



}
