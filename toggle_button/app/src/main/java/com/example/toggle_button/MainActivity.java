package com.example.toggle_button;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton tbt1 = (ToggleButton) findViewById(R.id.toggleButton1);
        ToggleButton tbt2 = (ToggleButton) findViewById(R.id.toggleButton2);
        Button btn = (Button) findViewById(R.id.checkButton);
        TextView txt = (TextView) findViewById(R.id.text);

        tbt1.setOnClickListener(view -> {
            if(tbt1.isChecked()){
                Toast.makeText(getApplicationContext(), "The button is in ON state", Toast.LENGTH_SHORT).show();
            } else if(!tbt1.isChecked()){
                Toast.makeText(getApplicationContext(), "The button is in OFF state", Toast.LENGTH_SHORT).show();
            }
        });

        tbt2.setOnClickListener(view -> {
            if(tbt2.isChecked()){
                Toast.makeText(getApplicationContext(), "The button is in on state", Toast.LENGTH_SHORT).show();
            } else if(!tbt2.isChecked()){
                Toast.makeText(getApplicationContext(), "The button is in off state", Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(view -> {

            if(tbt2.isChecked() && tbt1.isChecked()) {
                txt.setText("Both buttons are ON");
            }
            else if(!tbt2.isChecked() && tbt1.isChecked()) {
                txt.setText("Button 1 is ON and Button 2 is OFF");
            }
            else if(tbt2.isChecked() && !tbt1.isChecked()) {
                txt.setText("Button 2 is ON and Button 1 is OFF");
            }
            else if(!tbt2.isChecked() && !tbt1.isChecked()) {
                txt.setText("Both buttons are OFF");
            }
        });
    }
}



