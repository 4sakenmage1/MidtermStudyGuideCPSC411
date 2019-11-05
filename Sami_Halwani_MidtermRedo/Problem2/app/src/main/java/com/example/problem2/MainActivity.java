package com.example.problem2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_problem2);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 =(TextView) findViewById(R.id.tv3);

        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1 = Integer.valueOf(tv1.getText().toString());
                num1++;
                String s = String.valueOf(num1);
                tv1.setText(s);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1 = Integer.valueOf(tv2.getText().toString());
                num1++;
                String s = String.valueOf(num1);
                tv2.setText(s);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1 = Integer.valueOf(tv3.getText().toString());
                num1++;
                String s = String.valueOf(num1);
                tv3.setText(s);
            }
        });

    }
}
