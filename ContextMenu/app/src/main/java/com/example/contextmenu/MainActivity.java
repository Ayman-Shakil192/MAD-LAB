package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_view);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose an option");
        getMenuInflater().inflate(R.menu.context, menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.option1 : display("Option 1 selected");
                return true;
            case R.id.option2 : display("Option 2 selected");
                return true;
            default: return super.onContextItemSelected(item);
        }
    }

    void display(String text)
    {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }
}
