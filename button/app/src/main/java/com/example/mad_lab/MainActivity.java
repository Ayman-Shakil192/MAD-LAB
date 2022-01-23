package com.example.mad_lab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }

    @SuppressLint("SetTextI18n")
    public void buttonClick() {
        Button myButton = (Button) findViewById(R.id.Button);
        TextView textMsg = (TextView) findViewById(R.id.textView);

        myButton.setOnClickListener(V -> {
                    textMsg.setText("BMSCE");
                }
        );
    }
}

