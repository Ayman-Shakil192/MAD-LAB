package com.example.autocomplete_textview;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] lang =getResources().getStringArray(R.array.lang);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,lang);
        AutoCompleteTextView actv =(AutoCompleteTextView)findViewById(R.id.autocompletetextview);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.RED);
    }
}

