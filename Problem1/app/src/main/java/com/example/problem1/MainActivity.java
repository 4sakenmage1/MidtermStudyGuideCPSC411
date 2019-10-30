package com.example.problem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_a);

        Button button = (Button) findViewById(R.id.create_triangle_button);

        button.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                EditText text = (EditText) findViewById(R.id.TriangleSize);
                Intent intent = new Intent(MainActivity.this, CreateTriangle.class);
                intent.putExtra("levels", text.getText().toString());
                startActivity(intent);
            }
        });


    }
}
