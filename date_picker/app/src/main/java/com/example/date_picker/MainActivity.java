package com.example.date_picker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.change);
        DatePicker dp = (DatePicker) findViewById(R.id.datePicker);

        button.setOnClickListener(v -> {
            int day = dp.getDayOfMonth();
            int month = dp.getMonth();
            Toast.makeText(getApplicationContext(), String.valueOf(day) + " " +   String.valueOf(month), Toast.LENGTH_SHORT).show();
        });
    }
}