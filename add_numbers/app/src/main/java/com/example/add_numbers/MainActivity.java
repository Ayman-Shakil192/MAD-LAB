package com.example.add_numbers;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button b1,b2,b3;
    TextView sum,difference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        num1 = findViewById(R.id.Firstno);
        num2 = findViewById(R.id.Secondno);
        b1 = findViewById(R.id.addBtn);
        sum = findViewById(R.id.add);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int addition = a+b;
        sum.setText(String.format("Sum = %d",addition));
    }

    public void subtract(View view){
        b2 = findViewById(R.id.subBtn);
        difference = findViewById(R.id.sub);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int subtraction = a-b;
        difference.setText(String.format("Difference = %d",subtraction));
    }

    public void displayToast(View view){
        Button b3 = (Button) findViewById(R.id.multiplyBtn);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Operation could not be performed.." , Toast.LENGTH_LONG ).show();
            }
        });
    }
}
