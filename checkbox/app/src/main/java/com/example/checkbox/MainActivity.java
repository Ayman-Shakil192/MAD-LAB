package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit_lang(View view) {
        StringBuffer languages = new StringBuffer().append(getString(R.string.languages));
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);

        if(c1.isChecked())
        {
            languages.append(getString(R.string.ruby));
        }
        if(c2.isChecked())
        {
            languages.append(getString(R.string.python));
        }
        if(c3.isChecked())
        {
            languages.append(getString(R.string.java));
        }

        Toast.makeText(getApplicationContext(),languages.toString(),Toast.LENGTH_LONG).show();
    }
}