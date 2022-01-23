package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showpopup(View v) {
        PopupMenu popup = new PopupMenu(this,v);
        popup.inflate(R.menu.popup); popup.show();
        popup.setOnMenuItemClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1 :
                Toast.makeText(getApplicationContext(), "Notification",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Help",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Setting",
                        Toast.LENGTH_SHORT).show();
            case R.id.item4:
                System.exit(0);
            default: return super.onContextItemSelected(item);
        }
    }
}

