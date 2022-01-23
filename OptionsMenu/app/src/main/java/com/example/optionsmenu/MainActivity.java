package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout clayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clayout= findViewById(R.id.clayout);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.red :
                clayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.blue :
                clayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.green :
                clayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.yellow :
                clayout.setBackgroundColor(Color.YELLOW);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
}