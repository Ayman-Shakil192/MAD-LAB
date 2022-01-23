package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button explicitBtn,implicitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitBtn = (Button)findViewById(R.id.explicit_btn);
        implicitBtn = (Button)findViewById(R.id.implicit_btn);

        // Implementing onclick event for explicit intent

        explicitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        // Implementing onclick event for explicit intent

        implicitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://developer.android.com/"));
                startActivity(intent);
            }
        });
    }
}
