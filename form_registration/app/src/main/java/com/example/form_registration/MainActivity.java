package com.example.form_registration;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView t1,t2,t3;
    EditText fn,ln,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void onRegister(View v){
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);

        btn = findViewById(R.id.register);
        fn = findViewById(R.id.fname);
        ln = findViewById(R.id.lname);
        email = findViewById(R.id.email);

        String a = fn.getText().toString();
        String b = ln.getText().toString();
        String c = email.getText().toString();

        t1.setText("First name : " +a);
        t2.setText("Last name : " +b);
        t3.setText("Email : " +c);
    }
}